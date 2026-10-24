import java.util.*;
public class ArrayOperands {
    public static void main (String[] args){
        //Operations with all numbers in an array
        int[] a  = {21,5};
        int sum = 0;
        int differenceZero = 0;
        int differenceStart = a[0];
        int product = 1;
        int quotientInt = a[0];
        double quotientDouble = a[0];


        for (int i = 0; i < a.length; i++) sum = sum + a[i];
        for (int i = 0; i < a.length; i++) differenceZero = differenceZero - a[i];
        for (int i = 1; i < a.length; i++) differenceStart = differenceStart - a[i];
        for (int i = 0; i < a.length; i++) product = product * a[i];
        for (int i = 1; i < a.length; i++) quotientInt = quotientInt / a[i];
        for (int i = 1; i < a.length; i++) quotientDouble = quotientDouble / a[i];

        String sumString;
        String differenceZeroString;
        String differenceStartString;
        String productString;
        String quotientIntString;
        String quotientDoubleString;
        String lineBreak = ("--------------------------------------------------------");

        //SUM ------------------------------------------------------
        System.out.println("Sum Calculations:" + lineBreak);
        for (int i = 0; i < a.length; i++) {
            if (i == 0){
                System.out.print(a[i]);
            } else if (i == a.length - 1){
                System.out.print(" + " + a[i] + " = " + sum);
            } else {
                System.out.print(" + " + a[i]);
                  
            }
 
        }

        System.out.println();

        //DIFFERENCE FROM ZERO ------------------------------------------------------
        System.out.println("Difference from Zero:" + lineBreak);
        System.out.print("0");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1){
                System.out.print(" - " + a[i] + " = " + differenceZero);
            } else {
                System.out.print(" - " + a[i]);
                  
            }

        }

        System.out.println();

        //DIFFERENCE FROM ARRAY FIRST VAL ------------------------------------------------------
        System.out.println("Difference from First Array Index (" + a[0] + "):" + lineBreak);
        for (int i = 0; i < a.length; i++) {
            if (i == 0){
                System.out.print(a[i]);
            } else if (i == a.length - 1){
                System.out.print(" - " + a[i] + " = " + differenceStart);
            } else {
                System.out.print(" - " + a[i]);
            }
 
        }

        System.out.println();

        //PRODUCT ------------------------------------------------------
        System.out.println("Product:" + lineBreak);
        for (int i = 0; i < a.length; i++) {
            if (i == 0){
                System.out.print(a[i]);
            } else if (i == a.length - 1){
                System.out.print(" x " + a[i] + " = " + product);
            } else {
                System.out.print(" x " + a[i]);
                  
            }
 
        }

        System.out.println();

        //INTEGER DIVISION, FIRST VAL DIVIDEND ------------------------------------------------------
        System.out.println("Int Division with " + a[0] + " as the dividend:" + lineBreak);
        for (int i = 0; i < a.length; i++) {
            if (i == 0){
                System.out.print(a[i]);
            } else if (i == a.length - 1){
                System.out.print(" / " + a[i] + " = " + quotientInt);
            } else {
                System.out.print(" / " + a[i]);
                  
            }
 
        }

        System.out.println();

        //DOUBLE DIVISION, FIRST VAL DIVIDEND ------------------------------------------------------
        System.out.println("Double Division with " + a[0] + "as the dividend:" + lineBreak);
        for (int i = 0; i < a.length; i++) {
            if (i == 0){
                System.out.print(a[i]);
            } else if (i == a.length - 1){
                System.out.print(" / " + a[i] + " = " + quotientDouble);
            } else {
                System.out.print(" / " + a[i]);

            }
 
        }

        System.out.println();
        System.out.println();
        System.out.println("Summary" + lineBreak);


        System.out.println("sum " + sum);
        System.out.println("differenceZero " + differenceZero);
        System.out.println("differenceStart " + differenceStart);
        System.out.println("product " + product);
        System.out.println("quotientInt " + quotientInt);
        System.out.println("quotientDouble " + quotientDouble);


    }
}	
