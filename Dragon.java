package cwk4;

public class Dragon extends Champion{
    private boolean canTalk;
    private final int entryFee;

    /** constructor
     * @param name - name of the dragon
     * @param canTalk - boolean to indicate whether the dragon can talk
     */
    public Dragon(String name, boolean canTalk)
    {
        super(name, 7);
        this.canTalk = canTalk;
        this.entryFee = 500;
    }


    @Override
    /** Implements toString from Champion class
     *
     * @return the dragon information as a String
     */
    public String toString()
    {
        String s = "Class: Dragon || State: " +
                super.toString() +
                "Can Talk: " + canTalk + "\n" +
                "Entry Fee: " + this.entryFee + "\n";
        return s;
    }

}
