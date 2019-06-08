// Marta Rosińska
package Zad8;

import java.lang.*;

public class UsedCar {
    public int vin;
    public String make;
    public int year;
    public double mileage;
    public double price;

    public UsedCar()
    {
        if(vin>9999&&vin<1000)
        {
            throw new UsedCarException();
        }
        if(make.equals("Ford")||make.equals("Honda")||make.equals("Toyota")||make.equals("Chrysler")||make.equals("Other"))
        {}
        else
        {
            throw new UsedCarException();
        }
        if(year<1997&&year>2017)
        {
            throw new UsedCarException();
        }
        if(mileage<0)
        {
            throw new UsedCarException();
        }
        if(price<0)
        {
            throw new UsedCarException();
        }
    }
}
