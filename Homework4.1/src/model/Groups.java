package model;

public enum Groups {

	TO_31("TO-31"),
	TA_31("TA-31"),
	JAVA_WEB_SPRING("Java Web Spring"),
	JAVA_QA_AUTOMATIZATION("Java QA Automatization");
	
	private String groupName;
	
	Groups (String groupName){
		this.groupName = groupName;
	}
	
	public String getGroupName(){
		return this.groupName;
	}
}
