package cwk4;

public class Dragon extends Champion{
     private int entryFee = 500;
     private int skillLevel = 7;
     private boolean canTalk;
     
    /** constructor
     * @param nme - name of the dragon
     * @param talk - boolean to indicate whether the dragon can talk
     */ 
     public Dragon(String nme, boolean talk)
     {
          super(nme, this.skillLevel, this.entryFee);
          this.canTalk = talk;
     }

     /** Implements toString from Champion class
     * 
     * @return the dragon information as a String
     */
     public String toString()
     {
          String s = "Class: Dragon || State: " + getState() + "\n" +
          "Champion ID: " + getChampionID() + "\n" +
          "Name: " + getName() + "\n" +
          "Skill Level: " + getSkillLevel() + "\n" +
          "Entry Fee: " + getEntryFee() + "\n" +
          "Can Talk: " + canTalk;
          return s;
     }
     
}
