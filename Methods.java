public class Methods {
    public static void main(String [] args) {
        userInfo("hi",3,"January 1st, 2026",4);
        System.out.println("End of Prog");
    }


    public static void userInfo (String name, int age, String BD, int ID){
        System.out.println(name + spacer() + spacer() + BD + spacer() + ID);
    }

    public static String spacer(){
        return " ";
    }


}
