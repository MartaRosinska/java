// Marta Rosińska
package Zad7;

public class PizzaWoogy extends Pizza {
    private boolean haveMeat;
    private boolean haveCorn;
    private boolean haveOnion;

    public PizzaWoogy(double calories,String name,double price)
    {
        super(calories,name,price);

        this.haveMeat = true;
        this.haveCorn = true;
        this.haveOnion = false;
    }

    public PizzaWoogy(double calories, String name, double price, boolean haveMeat, boolean haveCorn, boolean haveOnion)
    {
        super(calories, name, price);

        this.haveMeat = haveMeat;
        this.haveCorn = haveCorn;
        this.haveOnion = haveOnion;
    }

    public boolean isHaveMeat()
    {
        return haveMeat;
    }

    public boolean isHaveCorn()
    {
        return haveCorn;
    }

    public boolean isHaveOnion()
    {
        return haveOnion;
    }
}
