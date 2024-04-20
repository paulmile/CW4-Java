package cwk4;

public abstract class Champion {

    private String name;
    private int championID;
    private int skillLevel;
    private ChampionState state;
    private static int nextChampID = 0;

    /** constructor
     * @param name - name of the champion
     * @param skillLevel - skill level of the champion
     */
    public Champion(String name, int skillLevel)
    {
        this.name = name;
        this.skillLevel = skillLevel;
        this.state = ChampionState.WAITING;
        this.championID = nextChampID;
        nextChampID ++;
    }

    /** Returns the champion's ID number
     * @return ID number
     */
    public int getChampionID()
    {
        return championID;
    }

    /** Returns the champion's name
     * @return ID number
     */
    public String getName()
    {
        return name;
    }

    /** Returns the champion's skill level
     * @return skill level
     */
    public int getSkillLvl()
    {
        return skillLevel;
    }

    /** Returns the champion's current state
     * @return champion state
     */
    public ChampionState getState()
    {
        return state;
    }


    /** Checks whether champion is skilled enough to win the challange
     * @param requirement - skill level of the enemy
     * @return True if champion wins, False if champion loses
     */
    public boolean wonChallange(int requirement)
    {
        if (skillLevel >= requirement)
        {
            return true;
        }else{
            return false;
        }
    }


    /** Returns a String representation of the champion information
     *  @return the champion information as a String
     */
    public String toString()
    {
        String s = getState() + "\n" +
                "Champion ID: " + getChampionID() + "\n" +
                "Name: " + getName() + "\n" +
                "Skill Level: " + getSkillLvl() + "\n";
        return s;
    }

}
