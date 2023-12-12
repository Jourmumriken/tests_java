public class higherAverage {

    public int move(int[] a, int[] b) {
        double medValA = setMed(a);
        double medValB = setMed(b);
        if (findRetVal(a, medValA, medValB) > 0) {
            return findRetVal(a, medValA, medValB);
        } else if (findRetVal(b, medValB, medValA) > 0) {
            return -findRetVal(b,medValB,medValA);
        } else {
            return 0;
        }
    }

    private double setMed(int[] intArr) {
        int acc = 0;
        for (int j : intArr) {
            acc += j;
        }
        return (double) acc / intArr.length;
    }

    private int findRetVal(int[] arr, double medValA, double medValB) {
        int ret = 0;
        for (int j : arr) {
            if (j < medValA && j > medValB) {
                ret = j;
            }
        }
        return ret;
    }

}
