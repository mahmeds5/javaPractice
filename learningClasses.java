public class Main {
    public static class Second {
        int x = 5;
    }
    public static void main() {
        Second obj = new Second();
        obj.x = 10;
        System.out.println(obj.x);
    }
}
