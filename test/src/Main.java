import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        // hardcoded test arrays
        int[] a1 = {3, 1, 2};
        int[] a2 = {4, 3, 5, 4};
        int[] a3 = {7, 5};
        int[] a4 = {4, 6};
        int[] a5 = {4,4,5,5,6,6,7};
        int[] a6 = {0,0};
        int[] a7 = {};
        int[] a8 = {4,3,3,4,4};

        higherAverage hav = new higherAverage();
        out.println("----higherAverage----");
        out.println(hav.move(a1,a2)); // -1
        out.println(hav.move(a3,a4)); // 0
        out.println(hav.move(a1,a4)); // -4
        out.println(hav.move(a3,a1)); // 5

        out.println("\n----Parity----");
        out.println(Parity.p(a2)); // 1
        out.println(Parity.p(a5)); // 3
        out.println(Parity.p(a6)); // 1
        out.println(Parity.p(a7)); // 0
        out.println(Parity.p(a8)); // 1


    }

}