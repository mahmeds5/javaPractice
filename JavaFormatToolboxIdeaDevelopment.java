public class JavaFormatToolboxIdeaDevelopment {
    public static void main(String [] args) {
        write("write() makes it easier to write text without having to write out a bunch of syntax.");
        write("Pretty neat, right?");

        lb();

        writesl("writesl() does the same, but on the same line");
        writesl("!");

        b();

        write("very neat!");
        b();

        write("We can use the b(int n) to introduce a number of line breaks, like this!");
        b(4);
        write("4 lines later, here we are. ");
        b(2);
        write("the border() function creates a border.");
        border();
        write("We can also control how large the border is with the border(int n) function.");
        border(5);
        write("that had a parameter of 5!");
        b();
        write("Border(char c, int n) creates a border with the selected char an n number of times");
        border('X',10);
        write("the same is possible with text!");
        border("This is some text", 2, true, true);
        write("Parameters control it. ");
        write("(The Text You Want, Repetition, T/F for a space, T/F for a divider.)");
        border("text", 3, true, false);
        border("text", 3, false, false);
        border("text", 3, false, true);
        write("You can also specify the character used in the text border");
        write("(The Text You Want, Repetition, T/F for a space, T/F for a divider, Char");
        border("text", 3, false, true, 'X');
        border("text", 3, true, true, '~');
        b(3);
        write("Formatting in Java has irritated me for a while.");
        write("I'll build a full toolbox soon!");
    }

    public static void write(String text){
        System.out.println(text);
    }

    public static void writeSL(String text){
        System.out.print(text);
    }

    public static void writesl (String text){
        writeSL(text); //this helps make sure that it works if it is capitalized or not
    }

    public static void lb(){
        write("");
    }

    public static void b(){ //shorthand for lb()
        lb();
    }

    public static void b(int n){
        for (int i  = 0; i < n; i++){
            b();
        }
    }

    public static void border(){
        write("-----------------------------------------");
    }

    public static void border(int n){
        for (int i  = 0; i < n; i++){
            System.out.print("-");
        }
        b();
    }

    public static void border(char c, int n){
        for (int i  = 0; i < n; i++){
            System.out.print(c);
        }
        b();
    }

    public static void border (String s, int n, boolean space, boolean divider){
        if (space && divider) {
            for (int i = 0; i < n; i++) {
                System.out.print(s + " | ");
            }
        } else if (space){
            for (int i  = 0; i < n; i++){
                System.out.print(s + " ");
            }
        } else if (divider){
            for (int i  = 0; i < n; i++){
                System.out.print(s + "|");
            }
        } else {
            for (int i  = 0; i < n; i++){
                System.out.print(s);
            }
        }
        b();
    }

    public static void border (String s, int n, boolean space, boolean divider, char c){
        if (space && divider) {
            for (int i = 0; i < n; i++) {
                System.out.print(s + " " + c + " ");
            }
        } else if (space){
            for (int i  = 0; i < n; i++){
                System.out.print(s + " ");
            }
        } else if (divider){
            for (int i  = 0; i < n; i++){
                System.out.print(s + c);
            }
        } else {
            for (int i  = 0; i < n; i++){
                System.out.print(s);
            }
        }
        b();
    }





}
