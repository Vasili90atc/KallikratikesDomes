package gr.atc.training.locations;

public class PrefectureUnit {
	
	String prefectureUnitCode;
	String description;
	String prefectureCode;
	String prefectureUnitsByName;
	
	public PrefectureUnit(String prefectureUnitCode, String description, String prefectureCode) {
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
	public String getPrefectureUnitsByName() {
		return prefectureUnitsByName;
	}
	public void setPrefectureUnitsByName(String Name) {
		this.prefectureUnitsByName = Name;
	}
	
	
	

}
