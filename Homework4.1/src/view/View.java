package view;

import model.Note;

public class View {
	
	public static void printMessage (String string){
        System.out.println(string);
    }

    public void printUserInitials (String firstName, String secondName) {
        System.out.println(secondName + " " + firstName.charAt(0) + ".");
    }

    public void printUserAddress (String index, String street, String homeNumber, String flatNumber, String city){
        System.out.println("Adress: " + street + " street, house " + homeNumber + ", room " 
        					+ flatNumber + ", " + city + ", "
        					+ index + ";");
    }
    
    public void printAllUserData(Note note){
    	printUserInitials(note.getFirstName(), note.getLastName());
    	System.out.println("Nickname: " + note.getNickName() + ";");
    	System.out.println("Comment: " + note.getComments());
    	System.out.println("Group: " + note.getGroup() + ";");
    	System.out.println("Home phone number: " + note.getHomePhoneNumber() + ";");
    	System.out.println("Mobile phone number: " + note.getFirstPhoneNumber() + ";");
    	if (note.getSecondPhoneNumber().length() != 0)
    		System.out.println("Mobile secondary number: " + note.getSecondPhoneNumber() + ";");
    	System.out.println("E-mail: " + note.getEmail() + ";");
    	System.out.println("Skype: " + note.getSkypeID() + ";");
    	printUserAddress(note.getZipCode(), note.getStreet(), note.getHouseNumber(), note.getFlatNumber(), note.getCity());
    	System.out.println("Date of entry: " + note.getDateOfEntry() + ";");
    	System.out.println("Date of last change: " + note.getDateOfLastChange() + ";");
    }
}
