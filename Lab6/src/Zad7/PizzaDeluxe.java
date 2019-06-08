// Marta Rosińska
package Zad7;

public class PizzaDeluxe extends Pizza {
    private boolean haveOlives;
    private boolean haveBacon;
    private boolean haveMushrums;

    public PizzaDeluxe(double calories,String name,double price)
    {
        super(calories,name,price);

        this.haveOlives = true;
        this.haveBacon = true;
        this.haveMushrums = true;
    }

    public PizzaDeluxe(double calories,String name,double price,boolean haveOlives,boolean haveBacon,boolean haveMushrums)
    {
        super(calories, name, price);

        this.haveOlives = haveOlives;
        this.haveBacon = haveBacon;
        this.haveMushrums = haveMushrums;
    }

    public boolean isHaveOlives()
    {
        return haveOlives;
    }

    public boolean isHaveBacon()
    {
        return haveBacon;
    }

    public boolean isHaveMushrums()
    {
        return haveMushrums;
    }
}
