public class ArrayMethodsDoubleSquare {
    public static void main(String [] args) {
        int[] numList = {1,2,3,4,5};
        int[] resultList = new int [5];

        //Writing code to double values in an Array

        for (int i = 0; i < 5; i++){
            resultList[i] = doub(numList[i]);
        }

        System.out.println("Doubling");
        printArray(numList);
        printArray(resultList);

        //Writing code to square values in an Array
        for (int i = 0; i < 5; i++){
            resultList[i] = square(numList[i]);
        }

        System.out.println("Squaring");
        printArray(numList);
        printArray(resultList);


    }

    public static int doub (int n){
        return n * 2;
    }
    
    public static int square(int n){
        return n * n;
    }
    

    public static void printArray(int[] array){
        String result = "{";
        for (int i = 0; i < array.length; i++){
            result = result + " " + array[i] + ",";
        }
        result = result + "}";
        System.out.println(result);;
    }

}
