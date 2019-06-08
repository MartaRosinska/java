// Marta Rosińska
package Zad7;

public class Pizza implements Comparable<Pizza> {
    private double calories;
    private String name;
    private double price;
    public Pizza(double calories,String name,double price)
    {
        this.calories = calories;
        this.name = name;
        this.price = price;
    }
    public double getCalories() {
        return calories;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String toString() {
        return name+", price: "+price+", calories: "+calories;
    }
    public int compareTo(Pizza another)
    {
        if(price == another.price)
            return 0;
        else if(price > another.price)
            return 1;
        else
            return -1;
    }
}