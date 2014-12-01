package org.wahlzeit.location;

/**
 * @author Vladimir Vulpe
 *
 */
public class HakaCharacteristics extends HakaCategoryAbstract {

	private String version, stadium, leader, captain, opponent, content,
			stadiumLocation;
	private final String teamnickname = "All Blacks";

	/**
	 * Do nothing
	 */
	public HakaCharacteristics() {

	}

	/**
	 * @param version
	 * @param members
	 * @param stadium
	 * @param opponent
	 * @param captain
	 * @param leader
	 * @param stadiumLocation
	 */
	public HakaCharacteristics(HakaVersion version, HakaTeamMembers members,
			HakaStadium stadium, String opponent, HakaTeamMembers captain,
			HakaTeamMembers leader, String stadiumLocation) {

		doSetVersionAndContent(version);
		doSetCaptain(captain);
		doSetLeader(leader);
		doSetOpponent(opponent);
		doSetStadium(stadium);
	}

	/**
	 * 
	 * @param captain
	 * @return
	 */
	private boolean captainORLeaderIsTeamMember(HakaTeamMembers captain) {

		for (String cap : HakaTeamMembers.toArray()) {
			if (cap == captain.toString())
				return true;
		}

		return false;
	}

	@Override
	protected void doSetStadiumLocation(String stadiumLocation) {
		this.stadiumLocation = stadiumLocation;

		assert (this.stadiumLocation == stadiumLocation) : "Stadium location does not coincide!";

	}

	@Override
	protected String doGetStadiumLocation() {
		return this.stadiumLocation;
	}

	@Override
	protected String doGetTeamMembers() {
		String teammembers = "";

		for (String member : HakaTeamMembers.toArray()) {
			teammembers += member + ",";
		}

		assert !(teammembers.equals("")) : "Teammembers empty!";

		return teammembers;
	}

	@Override
	protected void doSetCaptain(HakaTeamMembers captain) {
		if (!captainORLeaderIsTeamMember(captain))
			throw new RuntimeException("invariant violated");

		this.captain = captain.toString();

		assert (this.captain == captain.toString()) : "Captains name does not coincide!";
	}

	@Override
	protected String doGetCaptain() {
		return this.captain;
	}

	@Override
	protected void doSetOpponent(String opponent) {
		this.opponent = opponent;

		assert (this.opponent == opponent) : "Opponents does not coincide!";
	}

	@Override
	protected String doGetOpponent() {
		return this.opponent;
	}

	@Override
	protected void doSetLeader(HakaTeamMembers leader) {
		if (!captainORLeaderIsTeamMember(leader))
			throw new RuntimeException("invariant violated");

		this.leader = leader.toString();

		assert (this.leader == leader.toString()) : "Leaders name does not coincide!";
	}

	@Override
	protected String doGetLeader() {
		return this.leader;
	}

	@Override
	protected void doSetStadium(HakaStadium stadium) {
		this.stadium = stadium.toString();

		assert (this.stadium == stadium.toString()) : "Stadi name does not coincide!";

	}

	@Override
	protected String doGetStadium() {
		return this.stadium;
	}

	@Override
	protected void doSetVersionAndContent(HakaVersion version) {
		this.version = version.name().replace('_', ' ');
		this.content = version.toString();

		assert (this.version == version.name().replace('_', ' ')) : "Versions does not coincide!";
		assert (this.content == version.toString()) : "Contents does not coincide!";
	}

	@Override
	protected String[] doGetVersionAndContent() {
		return new String[] { this.version, this.content };
	}

	@Override
	protected String doGetTeamNickname() {
		return this.teamnickname;
	}

	@Override
	public void setCaptain() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setOpponent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLeader() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setStadium() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setVersionAndContent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setStadiumLocation() {
	}
}
