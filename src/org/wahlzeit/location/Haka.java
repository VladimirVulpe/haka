package org.wahlzeit.location;

public class Haka implements IHaka {

	private static String VERSION;
	private static String CONTENT;

	/**
	 * standard is Ka Mate
	 */
	public Haka() {
		this(HakaVersion.Ka_Mate);
	}

	public Haka(HakaVersion hakaVersion) {
		setHakaVersion(hakaVersion);

		setHakaContent(hakaVersion);
	}

	@Override
	public String getHakaVersion() {
		assert Haka.VERSION != null : "Haka version must not be emtpy!";

		return Haka.VERSION;
	}

	@Override
	public String getHakaContent() {
		assert Haka.CONTENT != null : "Haka content must not be emtpy!";

		return Haka.CONTENT;
	}

	public void setHakaVersion(HakaVersion version) {
		assert version.name() != null : "Haka version must not be emtpy!";

		Haka.VERSION = version.name();
	};

	public void setHakaContent(HakaVersion content) {
		assert content.toString() != null : "Haka content must not be emtpy!";

		Haka.CONTENT = content.toString();
	}
}
