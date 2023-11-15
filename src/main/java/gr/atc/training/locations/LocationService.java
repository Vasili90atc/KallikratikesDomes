package gr.atc.training.locations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
	List <PrefectureUnit> prefectureUnits;
	List <Municipality> municipalities;
	List <Prefecture> prefectures;
	List <MunicipalityUnit> municipalityUnits;
	
	public LocationService() {
		ReadFromExcel r = new ReadFromExcel("Καλλικρατικές_Δομές.xlsx");
		r.readFromSheets();
		r.closeFile();
		setMunicipalities(r.municipalities);
		setMunicipalityUnits(r.municipalityUnits);
		setPrefectures(r.prefectures);
		setPrefectureUnits(r.prefectureUnits);
	}
	
	public void setPrefectureUnits(List<PrefectureUnit> prefectureUnits) {
		this.prefectureUnits = prefectureUnits;
	}


	public void setMunicipalities(List<Municipality> municipalities) {
		this.municipalities = municipalities;
	}


	public void setPrefectures(List<Prefecture> prefectures) {
		this.prefectures = prefectures;
	}


	public void setMunicipalityUnits(List<MunicipalityUnit> municipalityUnits) {
		this.municipalityUnits = municipalityUnits;
	}
	
	
	

	List<PrefectureUnit> getPrefectureUnitsByPrefecture(String prefectureCode){
		List<PrefectureUnit> returnedPrefUnits = new ArrayList<PrefectureUnit>();
		for (int i=0; i<prefectureUnits.size(); i++) {
			if (prefectureUnits.get(i).getPrefectureCode().equals(prefectureCode)) {
				returnedPrefUnits.add(prefectureUnits.get(i));
			}
		}
		return returnedPrefUnits;
	}

	List<Municipality> getMunicipalitiesByPrefectureUnit(String prefectureUnitCode){
		// Vres tous dimous tis periferiakis enotitas
		List<Municipality> dimoi_tis_perif_enotitas = new ArrayList<Municipality>();
		for (int i=0; i<municipalities.size();i++) {
			if (municipalities.get(i).getPrefectureUnitCode().equals(prefectureUnitCode)) {
				dimoi_tis_perif_enotitas.add(municipalities.get(i));
			}
		}
		return dimoi_tis_perif_enotitas;
	}
	




	public List<MunicipalityUnit> getMunicipalityUnitsByMunicipality(String municipalityCode) {
		List<MunicipalityUnit> returendMunicipalityUnits= new ArrayList<>();
		for (int i=0; i<municipalityUnits.size(); i++) {
			if (municipalityUnits.get(i).getMunicipalityCode().equals(municipalityCode)) {
				returendMunicipalityUnits.add(municipalityUnits.get(i));
			}
		}
		return returendMunicipalityUnits;
	}

	public List<PrefectureUnit> getPrefectureUnitByName(String Name) {
	List<PrefectureUnit> returnedPrefUnitsName = new ArrayList<PrefectureUnit>();
		for (int i=0; i<prefectureUnits.size(); i++) {
			if (prefectureUnits.get(i).getDescription().startsWith(Name)) {
				returnedPrefUnitsName.add(prefectureUnits.get(i));
			}
		}
		return returnedPrefUnitsName;
	}

}