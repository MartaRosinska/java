// Marta Rosińska
package Zad7;

import java.util.Arrays;
import java.util.Random;

public class Pizzeria {
    private static Random rand = new Random();

    public static int main(String[] args)
    {
        Pizza[] pizzas = new Pizza[40];
        for(int i=0; i<40; i++)
        {
            Pizza pizzaToAdd = null;
            int whichPizza = rand.nextInt(3);
            switch (whichPizza) {
                case 0:
                    pizzaToAdd = new PizzaWoogy(500, "Woogy", 25);
                case 1:
                    pizzaToAdd = new PizzaSpecial(400, "Special",40);
                case 2:
                    pizzaToAdd = new PizzaDeluxe(600,"Deluxe",35);
            }

            pizzas[i] = pizzaToAdd;
        }

        Arrays.sort(pizzas);

        for(int j=0;j<40;j++)
        {
            System.out.println(pizzas[j].toString());
        }

        return 0;
    }
}
