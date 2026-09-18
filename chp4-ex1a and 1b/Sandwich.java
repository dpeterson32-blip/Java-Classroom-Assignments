//Dustin Peterson
//pg156 09/18/2026

public class Sandwich {
    private String ingredient;
    private String breadType;
    private double price;
    public void setIngredient(String ing){
        ingredient =ing;
    }
    public void setBreadType(String bt){
        breadType = bt;
    }
    public String getIngredient(){
        return ingredient;
    }
    public String getBreadType(){
        return breadType;
    }
    public double getPrice(){
        return price;
    }

    void setPrice(double price) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
