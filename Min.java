package Module5;

public class Min {

    public static int minValue(int[] values) {
        int min = Integer.MAX_VALUE;
        for (int i : values) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}


