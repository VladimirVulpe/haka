package org.wahlzeit.location;

public enum HakaTeamMembers {
	
	Member1("Jimmy Cowan"), 
	Member2("Andy Ellis"),
	Member3("Piri Weepu"),
	Member4("Dan Carter"),
	Member5("Aaron Cruden"),
	Member6("Stephen Donald"),
	Member7("Colin Slade"),
	Member8("Richard Kahui"),
	Member9("Ma'a Nonu"),
	Member10("Conrad Smith"),
	Member11("Sonny Bill Williams"),
	Member12("Hosea Gear"),
	Member13("Zac Guildford"),
	Member14("Cory Jane"),
	Member15("Isaia Toeava"),
	Member16("Israel Dagg"),
	Member17("Mils Muliaina"),
	Member18("Corey Flynn"),
	Member19("Andrew Hore"),
	Member20("Keven Mealamu"),
	Member21("John Afoa"),
	Member22("Ben Franks"),
	Member23("Owen Franks"),
	Member24("Tony Woodcock"),
	Member25("Anthony Boric"),
	Member26("Brad Thorn"),
	Member27("Sam Whitelock"),
	Member28("Ali Williams"),
	Member29("Jerome Kaino"),
	Member30("Richie McCaw"),
	Member31("Adam Thompson"),
	Member32("Kieran Read"),
	Member33("Victor Vito"),
	Member34 ("Liam Messam");

	private final String name;
	private static final String[] array;
	
	private HakaTeamMembers(String s) {
		name = s;
	}

	public boolean equalsName(String otherName) {
		return (otherName == null) ? false : name.equals(otherName);
	}

	public String toString() {
		return name;
	}
	
	static {
	    array = new String[HakaTeamMembers.values().length];
	    for (HakaTeamMembers value : HakaTeamMembers.values())
	        array[value.ordinal()] = value.toString();
	}
	public static String[] toArray () { return array; }
}
