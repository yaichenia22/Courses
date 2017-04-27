package model;

import exception.GroupDoesNotExistException;
import exception.LoginIsNotAvailableException;

public class Note {
	
	private String firstName;
	private String lastName;
	private String middleName;
	private String initials;
	private String nickName;
	private String comments;
	private String group;
	private String homePhoneNumber;
	private String firstPhoneNumber;
	private String secondPhoneNumber;
	private String email;
	private String skypeID;
	private String zipCode;
	private String city;
	private String street;
	private String houseNumber;
	private String flatNumber;
	private String fullAdress;
	private String dateOfEntry;
	private String dateOfLastChange;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public void setInitials(String initials) {
		this.initials = initials;
	}
	public void setNickName(String nickName) throws LoginIsNotAvailableException {
		for (Logins login : Logins.values()){
			if (login.getLogin().equals(nickName)){
				throw new LoginIsNotAvailableException("Login is not available!");
			}
		}
		this.nickName = nickName;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public void setGroup(String group) throws GroupDoesNotExistException {
		for (Groups band : Groups.values()){
			if (band.getGroupName().equals(group)){
				this.group = group;
				return;
			}
		}
		throw new GroupDoesNotExistException("Group does not exist!");
	}
	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
	}
	public void setFirstPhoneNumber(String firstPhoneNumber) {
		this.firstPhoneNumber = firstPhoneNumber;
	}
	public void setSecondPhoneNimber(String secondPhoneNumber) {
		this.secondPhoneNumber = secondPhoneNumber;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSkypeID(String skypeID) {
		this.skypeID = skypeID;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}
	public void setFullAdress(String fullAdress) {
		this.fullAdress = fullAdress;
	}
	public void setDateOfEntry(String dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}
	public void setDateOfLastChange(String dateOfLastChange) {
		this.dateOfLastChange = dateOfLastChange;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getInitials() {
		return initials;
	}
	public String getNickName() {
		return nickName;
	}
	public String getComments() {
		return comments;
	}
	public String getGroup() {
		return group;
	}
	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}
	public String getFirstPhoneNumber() {
		return firstPhoneNumber;
	}
	public String getSecondPhoneNumber() {
		return secondPhoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public String getSkypeID() {
		return skypeID;
	}
	public String getZipCode() {
		return zipCode;
	}
	public String getCity() {
		return city;
	}
	public String getStreet() {
		return street;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public String getFlatNumber() {
		return flatNumber;
	}
	public String getFullAdress() {
		return fullAdress;
	}
	public String getDateOfEntry() {
		return dateOfEntry;
	}
	public String getDateOfLastChange() {
		return dateOfLastChange;
	}
}
