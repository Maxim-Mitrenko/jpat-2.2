public class Main {

    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        System.out.println(binOps.sum("10", "01"));
        // 2 + 1 = 3
        // 3 в двоичной системе = 11
        System.out.println(binOps.mult("10", "11"));
        // 2 * 3 = 6
        // 6 в двоичной системе = 110
    }
}