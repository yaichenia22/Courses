package model;

public enum Logins {
	
	ID1111("yaichenia"),
	ID1112("yaichenia_v"),
	ID1113("yaichenia96"),
	ID1114("yaichenia1996");
	
	private String login;
	
	Logins (String login){
		this.login = login;
	}
	
	public String getLogin(){
		return this.login;
	}
}
