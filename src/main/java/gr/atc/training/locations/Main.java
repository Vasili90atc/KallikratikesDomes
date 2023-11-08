package gr.atc.training.locations;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		// comment
		ReadFromExcel r = new ReadFromExcel("Καλλικρατικές_Δομές.xlsx");
		
		// new comment
		LocationService ls = new LocationService();
		ls.setMunicipalities(r.municipalities);
		ls.setMunicipalityUnits(r.municipalityUnits);
		ls.setPrefectures(r.prefectures);
		ls.setPrefectureUnits(r.prefectureUnits);
		
		r.readFromSheets();
		r.closeFile();
	}
	
}
