import java.util.Arrays;

public class Thirdtask {
    public static void main(String[] args) {
        int[] array = { 3,2,4,1,5 };
        
        // first method
        Arrays.sort(array);
        System.out.println("First method:");
        System.out.println(Arrays.toString(array));
        System.out.println();

        // second method (mannually)
        for (int i = 0; i < array.length;  i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = 0;
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Second method:");
        System.out.println(Arrays.toString(array));
    }
}
