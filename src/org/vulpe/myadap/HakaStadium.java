package org.vulpe.myadap;

public enum HakaStadium {

	Stadium1("Eden Park"), Stadium2("Westpack Stadium"), Stadium3(
			"Jade Stadium");

	private final String name;
	private static final String[] array;

	private HakaStadium(String s) throws StringIndexOutOfBoundsException,
			IllegalArgumentException {
		name = s;

		assertInvariants();
	}

	public boolean equalsName(String otherName)
			throws StringIndexOutOfBoundsException, IllegalArgumentException {
		return (otherName == null) ? false : name.equals(otherName);
	}

	public String toString() {
		return name;
	}

	private void assertInvariants() throws AssertionError {
		assert name != null;
	}

	static {
		array = new String[HakaStadium.values().length];
		for (HakaStadium value : HakaStadium.values())
			array[value.ordinal()] = value.toString();
	}

	public static String[] toArray() {
		return array;
	}
}
