package gr.atc.training.locations;

public class Prefecture {
	String prefectureCode;
	String description;
	
	
	public Prefecture(String prefectureCode, String description) {
		this.prefectureCode = prefectureCode;
		this.description = description;
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
}
