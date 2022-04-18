public class BinOps {

    public String sum(String a, String b) {
        try {
            int sum = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
            return Integer.toBinaryString(sum);
        } catch (NumberFormatException exception) {
            return "1 или 2 аргумента не являются числами!";
        }
    }

    public String mult(String a, String b) {
        try {
            int mult = Integer.parseInt(a, 2) * Integer.parseInt(b, 2);
            return Integer.toBinaryString(mult);
        } catch (NumberFormatException exception) {
            return "1 или 2 аргумента не являются числами";
        }
    }
}