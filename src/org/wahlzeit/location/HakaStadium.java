package org.wahlzeit.location;

public enum HakaStadium {

	Stadium1 ("Eden Park"),
	Stadium2 ("Westpack Stadium"),
	Stadium3 ("Jade Stadium");

	private final String name;

	private HakaStadium(String s) {
		name = s;
<<<<<<< HEAD
		
		assertInvariants();
	}

	public boolean equalsName(String otherName) {
		return (otherName == null) ? false : name.equals(otherName);
	}

	public String toString() {
		return name;
	}
	
	private void assertInvariants() {
		assert name != null;
=======
	}

	public boolean equalsName(String otherName) {
		return (otherName == null) ? false : name.equals(otherName);
	}

	public String toString() {
		return name;
>>>>>>> branch 'master' of https://github.com/VladimirVulpe/haka
	}
}
