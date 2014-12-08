package org.wahlzeit.location;

public class Game_Springbok implements AbstractGame {

	public Game_Springbok() {
	}

	@Override
	public IHaka createHaka() {
		return new Haka(HakaVersion.Ka_Mate);
	}

	@Override
	public ITeam createTeam() {
		return new Team(HakaTeamMembers.Member30, HakaTeamMembers.Member16);
	}

	@Override
	public IStadium createStadium() {
		return new Stadium(HakaStadium.Stadium3);
	}

	@Override
	public IOpponent createOpponent() {
		return new Opponent("Suedafrika");
	}
}
