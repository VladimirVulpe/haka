 package org.wahlzeit.location;

/**
 * @author Vladimir Vulpe
 *
 */
public enum HakaVersion {

	Ka_Mate("Ringa pakia! Uma tiraha! Turi whatia! Hope whai ake! Waewae takahia kia kino! ..."), 
	Kapa_o_Pango("Kapa o Pango kia whakawhenua au i ahau! Hi aue, hi! Ko Aotearoa e ngunguru nei! ...");

	private final String name;
	private static final String[] array;
	
	private HakaVersion(String s) {
		name = s;

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
	}
	
		
	static {
	    array = new String[HakaVersion.values().length];
	    for (HakaVersion value : HakaVersion.values())
	        array[value.ordinal()] = value.toString();
	}
	public static String[] toArray () { return array; }
}
