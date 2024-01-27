// Java program to convert Integers to Roman Numerals
public class Int_Roman_Numerals {
    public static void main(String[] args) {
        String[] symbols = {"I", "V", "X", "L", "C", "D", "M"};
        int[] values = {1, 5, 10, 50, 100, 500, 1000};

        System.out.println("Roman numerals are represented by seven different symbols: I, V, X, L, C, D, and M.\n");
        System.out.println("Symbol\tValue");

        for (int i = 0; i < symbols.length; i++) {
            System.out.println(symbols[i] + "\t" + values[i]);
        }
    }
}
