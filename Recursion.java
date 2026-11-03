public class Recursion {
    public static void main (String[] args){
        //Recursion Factorial
        System.out.println(factorial(3));

        //Print Numbers in range, Recursion
        System.out.println(rangePrint(3,5));
        write(rangePrint(1,10));
        
        //"Addition Factorial"
        write(addFactorial(3));
        write(addFactorial(10));

        //Count Digits
        write(countDigits(312363, 3));

    }

    public static int countDigits (int num, int target){
        int lastNum = num % 10;
        int newNum = num / 10;
        int count = 0;
        if (num != 0){
            if (lastNum == target){
                count++;
            }
            return count + countDigits(newNum, target);
        }
        return count;
    }

    public static int factorial (int n){
        int f = 1;
        if (n > 0){
            f = f * n * factorial(n-1);
        }
        return f;
    }

    public static String rangePrint (int min, int max){
        String data = "";
        if (min <= max){
             data =  min + " " + rangePrint(min + 1, max);
         }
         return data;
    }

    public static int addFactorial (int n){
        int f = 0;
        if (n > 0){
            f = f + n + addFactorial(n-1);
        }
        return f;
    }



    //Just to make writing println easier.
    public static void write(String text){
        System.out.println(text);
    }

    public static void write (int n){
        System.out.println(n);
    }


}
