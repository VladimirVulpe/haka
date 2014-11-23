package org.wahlzeit.location;

/**
 * @author Vladimir Vulpe
 *
 */
public abstract class HakaCategoryAbstract implements HakaCategory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.wahlzeit.location.HakaCategory#setStadiumLocation(java.lang.String)
	 */
	public final void setStadiumLocation(String location) {
		doSetStadiumLocation(location);
	}

	/**
	 * @param location
	 */
	protected abstract void doSetStadiumLocation(String location);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.wahlzeit.location.HakaCategory#getStadiumLocation()
	 */
	public final String getStadiumLocation() {
		return doGetStadiumLocation();
	}

	protected abstract String doGetStadiumLocation();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.wahlzeit.location.HakaCategory#getTeamMembers()
	 */
	public final String getTeamMembers() {
		return doGetTeamMembers();
	}

	/**
	 * @return
	 */
	protected abstract String doGetTeamMembers();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.wahlzeit.location.HakaCategory#setCaptain()
	 */
	public final void setCaptain(HakaTeamMembers captain) {
		doSetCaptain(captain);
	}

	/**
	 * 
	 */
	protected abstract void doSetCaptain(HakaTeamMembers captain);

	/* (non-Javadoc)
	 * @see org.wahlzeit.location.HakaCategory#getCaptain()
	 */
	public final String getCaptain(){
		return doGetCaptain();
	}
	
	/**
	 * @return
	 */
	protected abstract String doGetCaptain(); 

	/* (non-Javadoc)
	 * @see org.wahlzeit.location.HakaCategory#setOpponent()
	 */
	public final void setOpponent(String opponent){
		doSetOpponent(opponent);
	}
	
	
	/**
	 * 
	 */
	protected abstract void doSetOpponent(String opponent); 
	

	/* (non-Javadoc)
	 * @see org.wahlzeit.location.HakaCategory#getOpponent()
	 */
	public final String getOpponent(){
		return doGetOpponent();
	}
	
	/**
	 * @return
	 */
	protected abstract String doGetOpponent(); 

	/* (non-Javadoc)
	 * @see org.wahlzeit.location.HakaCategory#setLeader()
	 */
	public final void setLeader(HakaTeamMembers leader){
		doSetLeader(leader);
	}
	
	/**
	 * 
	 */
	protected abstract void doSetLeader(HakaTeamMembers leader);

	/* (non-Javadoc)
	 * @see org.wahlzeit.location.HakaCategory#getLeader()
	 */
	public final String getLeader(){
		return doGetLeader();
	}
	
	/**
	 * @return
	 */
	protected abstract String doGetLeader(); 
	

	/* (non-Javadoc)
	 * @see org.wahlzeit.location.HakaCategory#setStadium()
	 */
	public final void setStadium(HakaStadium stadium){
		doSetStadium(stadium);
	}
	
	/**
	 * 
	 */
	protected abstract void doSetStadium(HakaStadium stadium); 
	

	/* (non-Javadoc)
	 * @see org.wahlzeit.location.HakaCategory#getStadium()
	 */
	public final String getStadium(){
		return doGetStadium(); 
	}
	
	/**
	 * @return
	 */
	protected abstract String doGetStadium();

	/* (non-Javadoc)
	 * @see org.wahlzeit.location.HakaCategory#setVersionAndContent()
	 */
	public final void setVersionAndContent(HakaVersion version){
		doSetVersionAndContent(version);
	}
	
	/**
	 * 
	 */
	protected abstract void doSetVersionAndContent(HakaVersion version);

	/* (non-Javadoc)
	 * @see org.wahlzeit.location.HakaCategory#getVersionAndContent()
	 */
	public final String[] getVersionAndContent(){
	return	doGetVersionAndContent();
	}
	
	/**
	 * @return
	 */
	protected abstract String[] doGetVersionAndContent();
	
	public final String getTeamNickname(){
		return doGetTeamNickname();
	}

	protected abstract String doGetTeamNickname();
}
