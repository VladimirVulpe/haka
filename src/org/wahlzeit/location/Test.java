package org.wahlzeit.location;

public class Test {

	
	public static void main(final String[] args) {
		
		AbstractGame abstractgame = new Game();
        
        IHaka haka = abstractgame.createHaka();
        IStadium stadium = abstractgame.createStadium();
        IOpponent opponent = abstractgame.createOpponent();
        ITeam team = abstractgame.createTeam(); 
        
        System.out.println(haka.getHakaVersion());
        System.out.println(haka.getHakaContent());
        System.out.println(team.getAllPlayers());
	}
}
