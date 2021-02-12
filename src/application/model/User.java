package application.model;

public class User {

	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String phonenumber;
	private String history; // history simple

	public User() {
		this.username = "";
		this.history = "";
		this.password = "";
		this.firstname = "";
		this.lastname = "";
		this.phonenumber = "";

	}

	public User(String username, String password, String firstname, String lastname, String phonenumber,String history) {
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.history = history;
		this.phonenumber = phonenumber;

	}

	// public String toString() {
	// return ("Name of User :" + firstname+ " "+ lastname+ "phone number- "+
	// phonenumber+"Hiking_History");

	// }
	public User deepcopy() {
		User deepcopy = new User(username, password, firstname, lastname, phonenumber, history);
		return deepcopy;

	}

	public int compareTo(String targetKey) {
		return (username.compareTo(targetKey));
	}

	public String getname() {
		return username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String history() {
		return history;
	}

	public void sethistory(String hiking_history) {
		history = hiking_history;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname="
				+ lastname + ", phonenumber=" + phonenumber + ", history=" + history + "]";
	}

}
