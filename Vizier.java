package cwk4;
import java.util.ArrayList;


public class Vizier{
    private String name;
    private int treasury = 1000;

    //Changed ArrayList data type to store Champion objects instead of Integer
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

    public String getVizierName(){
        return name;
    }

    // Write hasChampions function that returns a boolean


    // Write isTreasuryInDebt function that returns a boolean


    //public String addChampionToTeam(Champion champion){
    //    if (treasury > 0){
    //        if (champion )
    //    }
    //}
}
