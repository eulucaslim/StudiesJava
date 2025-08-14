package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(3.0, 2.0));
        shapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));
        System.out.println("Total Area: " + totalArea(myCircles));
    }

    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;
        for (Shape s: list){
            sum += s.area();
        }
        return sum;
    }
}
