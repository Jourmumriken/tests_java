public class Parity {

    public static int p(int[] arr) {
        // how many numbers we have seen that an even amm of times
        int counter = 0;
        // loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // how many times we see the current element
            // (ahead of itself in the array)
            int timesSeen = 0;
            // true if we  havent seen the current elem before
            boolean uniqe = true;
            // check all elements before and set unique to false if we hit
            // one that matches the current element
            for (int j = i-1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    uniqe = false; // element i isnt uniqe
                    break; // if we hit an element that matches we dont need
                    // to look further
                }
            }
            // if i hasnt been seen before we check if it appears later in
            // the array and if so increment the timesSeen variable
            if (uniqe) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] == arr[i]) {
                        timesSeen++;
                    }
                }
                // if we see the element an even ammount of times increment
                // the counter
                if (timesSeen % 2 == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
