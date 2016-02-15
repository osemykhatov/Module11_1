package Module5;


public class MinMax {

    public static void main(String[] args) {
        int max = Max.maxValue (new int[] {5, 10, 200, -2, 2});
        int min = Min.minValue(new int[] {5, 10, 200, -2, 2});

        System.out.println("max value from tha array is " + max );
        System.out.print("min value from tha array is " + min );

    }

}
