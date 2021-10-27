package main;

import classes.Kepping;

public class Main {



    public static void main(String[] args) {
        Kepping kep =  new Kepping(10,10);
        double avarageSquare = kep.getAverageSquare();
        System.out.println("Average square of quadrangles: "+ Double.toString(avarageSquare));
        System.out.println("Parallelogram with max square: " + kep.getMaxParallelogramSquare().toString() );
        System.out.println("Parallelogram with min square: " + kep.getMinParallelogramSquare().toString());
      }
}
