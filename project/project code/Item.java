//Dustin Peterson
//09/29/2029

public class Item 
{
    protected String name;
    protected int quantity;

    public Item(String name, int quantity) 
    {
        this.name = name.trim();
        this.quantity = quantity;
    }

    public String getName() 
    {
        return name;
    }

    public void addStock(int amount) 
    {
        quantity += amount;
    }

    public void removeStock(int amount) 
    {
        quantity -= amount;
        if (quantity < 0) quantity = 0;
    }

    public int getQuantity() 
    {
        return quantity;
    }

    public String toString()
    {
        return name + " | Qty: " + quantity;
    }

}
