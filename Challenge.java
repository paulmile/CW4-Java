package cwk4;

public class Challenge {

    private int id;
    private String enemyName;
    private ChallengeType type;
    private int skillLevel;
    private int reward;

    public Challenge(int id, String enemyName, ChallengeType type, int skillLevel, int reward){
        this.id = id;
        this.enemyName = enemyName;
        this.type = type;
        this.skillLevel = skillLevel;
        this.reward = reward;
    }

    public int getId()
    {
        return id;
    }

    public String getEnemyName()
    {
        return enemyName;
    }

    public String getType()
    {
        return type.toString();
    }

    public int getSkillLevel()
    {
        return skillLevel;
    }

    public int getReward()
    {
        return reward;
    }


}
