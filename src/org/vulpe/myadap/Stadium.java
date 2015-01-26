package org.vulpe.myadap;

public class Stadium implements IStadium {

	private static String STADIUM_NAME;

	public Stadium(){
		this(HakaStadium.Stadium1);
	}
	
	public Stadium(HakaStadium stadiumname) throws IllegalArgumentException,
	StringIndexOutOfBoundsException {
		setStadiumName(stadiumname);
	}

	@Override
	public void setStadiumName(HakaStadium stadiumname) {
		assert stadiumname.toString() != null : "Stadium name must not be emtpy!";

		Stadium.STADIUM_NAME = stadiumname.toString();
	}

	@Override
	public String getStadiumName() {
		assert Stadium.STADIUM_NAME != null : "Stadium name must not be emtpy!";

		return Stadium.STADIUM_NAME;
	}
}
