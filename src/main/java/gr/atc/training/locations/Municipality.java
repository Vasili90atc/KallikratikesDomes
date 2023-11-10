package gr.atc.training.locations;

public class Municipality {

	String municipalityCode;
	String description;
	String prefectureUnitCode;
	
	public Municipality(String municipalityCode, String description, String prefectureUnitCode) {
		this.municipalityCode = municipalityCode;
		this.description = description;
		this.prefectureUnitCode = prefectureUnitCode;
	}
	
	public String getMunicipalityCode() {
		return municipalityCode;
	}
	public void setMunicipalityCode(String municipalityCode) {
		this.municipalityCode = municipalityCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrefectureUnitCode() {
		return prefectureUnitCode;
	}
	public void setPrefectureUnitCode(String prefectureUnitCode) {
		this.prefectureUnitCode = prefectureUnitCode;
	}
	
}
