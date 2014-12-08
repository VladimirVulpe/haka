package org.wahlzeit.location;

public class Game implements AbstractGame {

	public Game() {
	}
	
	@Override
	public IHaka createHaka() {
		return new Haka();
	}

	@Override
	public ITeam createTeam() {
		return new Team();
	}

	@Override
	public IStadium createStadium() {
		return new Stadium();
	}

	@Override
	public IOpponent createOpponent() {
		return new Opponent();
	}
}
