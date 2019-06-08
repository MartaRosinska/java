// Marta Rosińska
package Zad3;

public abstract class Insurance {
    private String type;
    private double price;

    public Insurance(String type)
    {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public double getPrice() {
        return price;
    }
    public abstract void setCost();
    public abstract void display();
}