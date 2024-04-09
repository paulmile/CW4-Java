package cwk4;
import java.util.ArrayList;


public class Vizier{
    private final String name;
    private int treasury = 1000;
    private ArrayList<Champion> team = new ArrayList<Champion>();
    private boolean hasChampions;
    private boolean isTreasuryInDebt;

    public Vizier (String name){
       this.name = name;
       hasChampions = false;
       isTreasuryInDebt = false;
    }

    public int getTreasury(){
        return treasury;
    }

    public String viewReserveList(){
        String s = "";
        for (Champion champion : Tournament.reserveList) {
            s += champion.toString();
        }
        return s;
    }

    public String getVizierName(){
        return name;
    }

    public boolean hasChampion(Champion champion){
        for (Champion temp: team){
            if (temp.equals(champion)){
                return true;
            }
        }
        return false;
    }

    public String getChampion(Champion champ){
        String s = "";
        for (Champion champion : team){
            s += champion.toString();
        }
        return s;
    }

    public String getTeam(){
        String s = "";
        for (Champion champion : team){
            s += champion.toString();
        }
        return s;
    }

    public boolean isTreasuryInDebt(){
        return treasury < 0;
    }

    public int addChampionToTeam(Champion champion){
        if (hasChampion(champion)){
            return 0;
        }
        if (!team.inReserve(champion)) {
            return -1;
        }
        if (treasury < champion.getEntryFree()){
            return 2;
        }

        treasury -= Champion.getEntryFee;

        team.add(champion);

        return 0;
    }

    public String toString(){
        return "Vizier name: " + getVizierName() +
                "\nTreasury: " + getTreasury() +
                "\nTeam contains Champions? " + hasChampions +
                "\nIs Vizier in debt? " + isTreasuryInDebt +
                "\nVizier Team: " + getTeam();
    }
}
