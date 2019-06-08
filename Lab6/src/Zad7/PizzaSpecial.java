// Marta Rosińska
package Zad7;

public class PizzaSpecial extends Pizza {
    private boolean havePineapple;
    private boolean haveTuna;
    private boolean doubleCheese;

    public PizzaSpecial(double calories,String name,double price)
    {
        super(calories,name,price);

        this.havePineapple = true;
        this.haveTuna = true;
        this.doubleCheese = false;
    }

    public PizzaSpecial(double calories, String name, double price, boolean havePineapple, boolean haveTuna, boolean doubleCheese)
    {
        super(calories, name, price);

        this.havePineapple = havePineapple;
        this.haveTuna = haveTuna;
        this.doubleCheese = doubleCheese;
    }

    public boolean isHavePineapple()
    {
        return havePineapple;
    }

    public boolean isHaveTuna()
    {
        return haveTuna;
    }

    public boolean isDoubleCheese()
    {
        return doubleCheese;
    }
}
