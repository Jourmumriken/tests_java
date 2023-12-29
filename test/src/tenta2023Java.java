public class tenta2023Java {

    // Hitta kompileringsfel, kommenterat ut för att kunna kompilera lol
    /*
    public static int a = 1.0;

    public double j = 2;

    public static void doIt(int a) {
        if (a < 0) {
            tenta2023Java.j = a;
            doOther();
        }
        tenta2023Java.i = 5;
        new tenta2023Java().doOther();
        doIt(a-1);
        doOther();
    }
    public void doOther() {
        this.j = tenta2023Java.a;
        doIt(this.a);
    }
*/


    int parity(final int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int numSeen = 0;
            final int curr = arr[i];
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == curr) {
                    seen = true;
                    break;
                }
            }
            if (!seen) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] == curr) {
                        numSeen++;
                    }
                }
                if (numSeen % 2 == 0) {
                    sum++;
                }
            }
        }
        return sum;
    }
}