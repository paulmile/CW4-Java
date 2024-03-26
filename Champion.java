package cwk4;

public abstract class Champion {

    private String name;
    private int championID;
    private int skillLevel;
    private int entryFee;
    private ChampionState state;
    private static int nextChampID = 0;

    /** constructor
    * @param nme - name of the champion
    * @param skill - skill level of the champion
    * @param fee - fee amount to hire a champion
    */
    public Champion(String nme, int skill, int fee)
    {
        this.name = nme;
        this.skillLevel = skill;
        this.entryFee = fee;

        this.state = ChampionState.WAITING;
        this.championID = nextChampID;
        nextChampID ++;
    }

    /** Returns the champion's skill level
     * @return skill level
     */
    public int getSkillLvl()
    {
        return skillLevel;
    }

    /** Returns the champion's fee
     * @return fee amount
     */
    public int getEntryFee()
    {
        return entryFee;
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
            return True;
        }else{
            return False;
        }
    }
    

    /** Returns a String representation of the champion information
     *  @return the champion information as a String
     */
    public abstract String toString();
    
}
