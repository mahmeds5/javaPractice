public class findMax {
    public static void main (String[] args){

        write(findMax(5,5,1123));
        write(findMin(123,2,2));

        int[] array = {1,200,3,4,5};
        write(findMax(array));


    }

    public static int findMax(int[] a){
        int max = 0;
        for (int i = 0; i < a.length; i++){
            max = findMax(max,a[i]);
        }
        return max;
    }


    public static int findMax (int n1, int n2, int n3){
        return findMax(findMax(n1,n2),n3);
    }

    public static int findMin (int n1, int n2, int n3){
        return findMin(findMin(n1,n2),n3);
    }

    public static int findMax (int n1, int n2){
        if (n1 > n2) return  n1; else return n2;
    }

    public static int findMin (int n1, int n2){
        if (n1 < n2) return  n1; else return n2;
    }

    //Junky stuff but not really
    public static void write (String t){
        System.out.println(t);
    }

    public static void write (int t){
        System.out.println(t);
    }

}
