package gr.atc.training.locations;

public class PrefectureUnit {
	String prefectureCode;
	String description;
	String prefectureUnitCode;
	
	public PrefectureUnit(String prefectureCode, String description, String prefectureUnitCode) {
		this.prefectureCode = prefectureCode;
		this.description = description;
		this.prefectureUnitCode = prefectureUnitCode;
	}
	public String getPrefectureCode() {
		return prefectureCode;
	}
	public void setPrefectureCode(String prefectureCode) {
		this.prefectureCode = prefectureCode;
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
