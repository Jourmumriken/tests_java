public class Blur {
    void blur (int[][] m) {
        // make a new matrix to write our values to
        int[][] newMatrix = new int[m.length][m[0].length];
        // loop over our matrix
        for (int x = 0; x < m.length; x++) {
            for (int y = 0; y < m[0].length; y++) {
                int[] neighbours = getNeighbours(x,y,m);
                // the new value is the average of all the point around the
                // current point and the current point.
                newMatrix[x][y] = (int) ((sum(neighbours) + m[x][y]) / 9.0);
            }
        }
        // copy all the values of the new matrix into the old one. A simple
        // assignment won't work since arrays are reference types
        System.arraycopy(newMatrix, 0, m, 0, m.length);
    }

    // self-explanatory
    int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    int[] getNeighbours(int x, int y, int[][] m) {
        int[] n = new int[8]; // any point has 8 neighbours
        int counter = 0; // counter to keep track of where in the n array we are
        for (int i = x-1; i < x+2; i++) {
            for (int j = y-1; j < y+2; j++) {
                // make sure were never outside the matrix
                int xCord = clamp(i,0,m.length);
                // the if statement makes sure we dont include the middle
                // (current point that we "are on")
                if(!(i == x && j == y)) {
                    // make sure were never outside the matrix
                    int yCord = clamp(j,0,m[0].length);
                    // add the value to our neighbours array and post-increment
                    // our counter
                    n[counter++] = m[xCord][yCord];
                }
            }
        }
        return n;
    }

    int clamp (int n, int min, int max) {
        // simply compare our value n with the highest and lowest allowed
        // values and return the higher/lower one respectively
        return Math.min(max - 1, Math.max(min,n));
    }
}
