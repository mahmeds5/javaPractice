public class findMax {
    public static void main (String[] args){

        write(findMax(-134,222,1123));

    }

    public static int findMax (int n1, int n2, int n3){
        return findMax(findMax(n1,n2),n3);
    }

    public static int findMax (int n1, int n2){
        if (n1 > n2) return  n1; else return n2;
    }

    public static void write (String t){
        System.out.println(t);
    }

    public static void write (int t){
        System.out.println(t);
    }

}
