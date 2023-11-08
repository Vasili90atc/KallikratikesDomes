package gr.atc.training.locations;

public class MunicipalityUnit {

	String municipalityUnitCode;
	String description;
	String municipalityCode;
	
	public MunicipalityUnit(String municipalityUnitCode, String description, String municipalityCode) {
		this.municipalityUnitCode = municipalityUnitCode;
		this.description = description;
		this.municipalityCode = municipalityCode;
	}
	public String getMunicipalityUnitCode() {
		return municipalityUnitCode;
	}
	public void setMunicipalityUnitCode(String municipalityUnitCode) {
		this.municipalityUnitCode = municipalityUnitCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMunicipalityCode() {
		return municipalityCode;
	}
	public void setMunicipalityCode(String municipalityCode) {
		this.municipalityCode = municipalityCode;
	}
}
	