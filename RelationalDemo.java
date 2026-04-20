public class RelationalDemo {
    public static void main(String[] args) {
        int x = 25;
        int y = 30;

        System.out.printf("x == y: %b\n", x == y);   // false
        System.out.printf("x != y: %b\n", x != y);   // true
        System.out.printf("x > y: %b\n", x > y);     // false
        System.out.printf("x < y: %b\n", x < y);     // true
        System.out.printf("x >= 10: %b\n", x >= 10); // true
        System.out.printf("y <= 20: %b\n", y <= 20); // true
    }
}
