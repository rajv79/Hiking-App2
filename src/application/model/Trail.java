package application.model;

public class Trail {

	private String Trail_Name;
	private String trail_Head_Address;
	private int length_miles;
	private int elevation_gain;
	private String diffculity_levels;
	private String type;

	public Trail() {
		this.Trail_Name = "";
		this.trail_Head_Address = "";
		this.length_miles = 0;
		this.elevation_gain = 0;
		this.diffculity_levels = "";
		this.type = "";

	}

	public Trail(String Trail_Name, String trail_Head_Address, int nlenght, String diffculty_levels, String type) {
		this.Trail_Name = Trail_Name;
		this.trail_Head_Address = trail_Head_Address;
		this.length_miles = nlenght;
		this.diffculity_levels = diffculty_levels;
		this.type = type;

	}

	public Trail deepcopy() {
		Trail deepcopy = new Trail(Trail_Name, trail_Head_Address, length_miles, diffculity_levels, type);
		return deepcopy;

	}

	public String toString() {
		return ("Name of Trail :" + Trail_Name + "Trail Head Address :-  " + trail_Head_Address + "Lengths in miles- "
				+ length_miles + "Diffculty level of Trails:- " + diffculity_levels + "Type of Trails:-" + type);

	}

	public int compareTo(String targetKey) {
		return (Trail_Name.compareTo(targetKey));
	}

	public String getTrail_Name() {
		return Trail_Name;
	}

	public void setTrail_Name(String trail_Name) {
		Trail_Name = trail_Name;
	}

	public String getTrail_Head_Address() {
		return trail_Head_Address;
	}

	public void setTrail_Head_Address(String trail_Head_Address) {
		this.trail_Head_Address = trail_Head_Address;
	}

	public int getLength_miles() {
		return length_miles;
	}

	public void setLength_miles(int length_miles) {
		this.length_miles = length_miles;
	}

	public int getElevation_gain() {
		return elevation_gain;
	}

	public void setElevation_gain(int elevation_gain) {
		this.elevation_gain = elevation_gain;
	}

	public String getDiffculity_levels() {
		return diffculity_levels;
	}

	public void setDiffculity_levels(String diffculity_levels) {
		this.diffculity_levels = diffculity_levels;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
