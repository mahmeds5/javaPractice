public class Main {
    public static void main() {
        System.out.println("Some Text!"); //No method used
        lineBreak();
        System.out.println("Here is a text after a line break.");
        text();

        for (int i = 0; i < 3; i++){
            lineBreak();
            text();
        }

    }

    public static void lineBreak(){
        System.out.println();
    }

    public static void text(){
        System.out.println("Some Text");
    }


}
