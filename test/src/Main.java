import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        // hardcoded test arrays
        int[] a1 = {3, 1, 2};
        int[] a2 = {4, 3, 5, 4};
        int[] a3 = {7, 5};
        int[] a4 = {4, 6};
        int[] a5 = {4, 4, 5, 5, 6, 6, 7};
        int[] a6 = {0, 0};
        int[] a7 = {};
        int[] a8 = {4, 3, 3, 4, 4};

        int[][] m1 = {{90, 69},{46,14}, {70,94}};
        int[][] m2 = {{0, 0, 0}, {0, 0, 0}};
        int[][] m3 = {{0, 0, 0}, {0, 90, 0}, {0, 0, 0}};

        String s1 = "dagligen";
        String s2 = "programmering";
        String s3 = "objektorientering";

        higherAverage hav = new higherAverage();
        out.println("----higherAverage----");
        out.println(hav.move(a1, a2)); // -1
        out.println(hav.move(a3, a4)); // 0
        out.println(hav.move(a1, a4)); // -4
        out.println(hav.move(a3, a1)); // 5

        out.println("\n----Parity----");
        out.println(Parity.p(a2)); // 1
        out.println(Parity.p(a5)); // 3
        out.println(Parity.p(a6)); // 1
        out.println(Parity.p(a7)); // 0
        out.println(Parity.p(a8)); // 1

        tenta2023Java p2 = new tenta2023Java();
        out.println("\n----Parity #2----");
        out.println(p2.parity(a2)); // 1
        out.println(p2.parity(a5)); // 3
        out.println(p2.parity(a6)); // 1
        out.println(p2.parity(a7)); // 0
        out.println(p2.parity(a8)); // 1

        Blur b = new Blur();
        out.println("\n----Blur----");
        b.blur(m1);
        printMatrix(m1);
        b.blur(m2);
        printMatrix(m2);
        b.blur(m3);
        printMatrix(m3);

        Bakslang bak = new Bakslang();
        out.println("\n---Bakslang---");
        out.println(bak.bakslang(s1));
        out.println(bak.bakslang(s2));
        out.println(bak.bakslang(s3));

    }


    // self-explanatory
    static void printMatrix(int[][] matrix) {
        for (int[] i : matrix) {
            for (int j : i) {
                out.print(j + " ");
            }
            out.println();
        }
        out.println();
    }

}