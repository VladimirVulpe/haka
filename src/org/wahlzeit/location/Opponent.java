package org.wahlzeit.location;

public class Opponent implements IOpponent {

	private static String OPPONENT;

	public Opponent(){
		this("Australien");
	}
	
	public Opponent(String opponent) {
		setOpponent(opponent);
	}

	@Override
	public void setOpponent(String opponent) {
		assert opponent != null : "Opponent must not be emtpy!";

		Opponent.OPPONENT = opponent;
	}

	@Override
	public String getOpponent() {
		assert Opponent.OPPONENT != null : "Opponent must not be emtpy!";

		return Opponent.OPPONENT;
	}
}
