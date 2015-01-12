package org.wahlzeit.location;

public class Test {

	
	public static void main(final String[] args) {
		
//		AbstractGame abstractgame = new Game();
//        
//        IHaka haka = abstractgame.createHaka();
//        IStadium stadium = abstractgame.createStadium();
//        IOpponent opponent = abstractgame.createOpponent();
//        ITeam team = abstractgame.createTeam(); 
        
//		for(int i = 0; i < HakaTeamMembers.toArray().length; i++){
//		System.out.println(HakaTeamMembers.toArray()[i]);	
//		}
		
		String teammembers = "";
		
		for (String teammember : HakaTeamMembers.toArray()) {
		teammembers += teammember +"\n"; 	
		}
		
		System.out.println(teammembers);
	}
}
