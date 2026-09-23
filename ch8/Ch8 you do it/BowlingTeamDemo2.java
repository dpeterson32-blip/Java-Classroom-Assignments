//Dustin Peterson
// Pg 280 09/21/2026
import java.util.*;

public class BowlingTeamDemo2
{
    public static void main(String[] args)
    {
        String name;
        BowlingTeam [] teams = new BowlingTeam[NUM_Teams];
        int x;
        int y;
        final int num_Team_Members = 4;
        Scanner input = new Scanner(System.in);
        for(y = 0; y < Num_Teams; ++y)
        {
            teams[y] = new BowlingTeam();
            System.out.print("Enter team name >>");
            name = input.nextLine();
            teams[y].setTeamName(name);
        for(x = 0; x < NUM_Team_Members; ++x)
        {
            System.out.print("Enter team member's name >>");
            name = input.nextLine();
            teams[y].setMember(x, name);
        }
    }
    for(y = 0; y < num_Teams; ++y)
    
        System.out.println("\nMembers of team " + bowlTeam.getTeamName());
          for(x = 0 ; x < NUMTEAMS; ++ x)
        System.out.print(bowlTeam.getMember(x) + " ");
        System.out.println();
    }
}
