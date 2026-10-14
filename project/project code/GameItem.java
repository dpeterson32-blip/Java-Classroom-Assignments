//Dustin Peterson
// 10/14/2026

public class GameItem extends Item
{
    private String consoleType;
    public GameItem(String name, int quantity, String consoleType)
    {
        super(name, quantity);
        this.consoleType = consoleType;
    }
    public String getConsoleType()
    {
        return consoleType;
    }
    public String toString()
    {
        return super.toString() + " Console Type: " + consoleType;
    }
}