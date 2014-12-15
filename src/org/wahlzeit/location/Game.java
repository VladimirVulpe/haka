package org.wahlzeit.location;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author Vladimir Vulpe
 *
 */
public class Game implements GameFactory {

	protected GameType gameType; 
	private Map<String, Game> properties; 
	public static final Game VOID = GameType.VOID_TYPE.makeGameInstance() ;
	
	/**
	 * @param gametype
	 */
	public Game(GameType gametype) {
		this.gameType = gametype; 
		this.properties = new Hashtable<String, Game>();
	}
	
	/**
	 * @param name
	 * @param game
	 */
	public void put(String opponent, Game game){
		this.properties.put(opponent, game);
		this.gameType.put(opponent, game.getGameType());
	}
	
	/**
	 * @param name
	 * @param game
	 * @throws Exception
	 */
	public void set(String opponent, Game game) throws Exception {
		GameType gametype = this.gameType.get(opponent);
		
		if(!gametype.equals(game.getGameType())){
			throw new Exception ("Incompatible Types!");
		}
		
		properties.put(opponent, game);
	}
	
	
	/**
	 * @return
	 */
	public GameType getGameType(){
		return this.gameType;
	}
	
	@Override
	public IHaka createHaka() {
		return new Haka(this.gameType.getHakaVersion());
	}

	@Override
	public ITeam createTeam() {
		return new Team(this.gameType.getCaptain(), this.gameType.getLeader());
	}

	@Override
	public IStadium createStadium() {
		return new Stadium(this.gameType.getStadium());
	}

	@Override
	public IOpponent createOpponent() {
		return new Opponent(this.gameType.getOpponent());
	}
}
