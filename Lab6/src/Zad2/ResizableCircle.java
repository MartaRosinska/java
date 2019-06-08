// Marta Rosińska
package Zad2;

public class ResizableCircle extends Circle implements Resizable {
    public double resize(int percent)
    {
        radius = radius + (radius * percent);
        return radius;
    }
}
