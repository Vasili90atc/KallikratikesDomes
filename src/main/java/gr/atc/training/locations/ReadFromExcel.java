package gr.atc.training.locations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.core.io.ClassPathResource;


public class ReadFromExcel {
	FileInputStream file;
	XSSFWorkbook workbook;
	List<Prefecture> prefectures;
	List<PrefectureUnit> prefectureUnits;
	List<Municipality> municipalities;
	List<MunicipalityUnit> municipalityUnits;

	public ReadFromExcel(String path) {
		try {
			file = new FileInputStream(new ClassPathResource(path).getFile());
			workbook = new XSSFWorkbook(file);
		} catch (FileNotFoundException e) {
			file = null;
		} catch (IOException e) {
			file = null;
			e.printStackTrace();
		}
		prefectures = new ArrayList<Prefecture>();
		prefectureUnits = new ArrayList<PrefectureUnit>();
		municipalities = new ArrayList<Municipality>();
		municipalityUnits = new ArrayList<MunicipalityUnit>();
	}

	public void readFromSheets() {
		if (file == null) {
			System.out.println("Sorry an error occured!!");
			return;
		}
		// Municipality
		XSSFSheet sheet = workbook.getSheet("Περιφέρειες");
		Iterator<Row> rowIterator = sheet.iterator();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			Cell cell = cellIterator.next();
			String code = cell.getStringCellValue();
			cell = cellIterator.next();
			String desc = cell.getStringCellValue();
			municipalities.add(new Municipality(code, desc));
		}

		// Municipality Units
		sheet = workbook.getSheet("Περιφερειακή Ενότητα");
		rowIterator = sheet.iterator();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			Cell cell = cellIterator.next();
			String municipUnitCode = cell.getStringCellValue();
			cell = cellIterator.next();
			String desc = cell.getStringCellValue();
			cell = cellIterator.next();
			String municipCode = cell.getStringCellValue();
			municipalityUnits.add(new MunicipalityUnit(municipUnitCode, desc, municipCode));
		}

		// Prefecture
		sheet = workbook.getSheet("Δήμος");
		rowIterator = sheet.iterator();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			Cell cell = cellIterator.next();
			String prefectureCode = cell.getStringCellValue();
			cell = cellIterator.next();
			String desc = cell.getStringCellValue();
			cell = cellIterator.next();
			String municipUnitCode = cell.getStringCellValue();
			prefectures.add(new Prefecture(prefectureCode, desc, municipUnitCode));
		}

		// Prefecture Unit
		sheet = workbook.getSheet("Δημοτική Ενότητα");
		rowIterator = sheet.iterator();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			Cell cell = cellIterator.next();
			String prefectureUnitCode = cell.getStringCellValue();
			cell = cellIterator.next();
			String desc = cell.getStringCellValue();
			cell = cellIterator.next();
			String prefectureCode = cell.getStringCellValue();
			prefectureUnits.add(new PrefectureUnit(prefectureUnitCode, desc, prefectureCode));
		}
	}

	public void closeFile() {
		try {
			workbook.close();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
