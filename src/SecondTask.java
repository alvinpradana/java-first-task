import java.util.ArrayList;

public class SecondTask {
    public static void main(String[] args) {
        int[] firstArray = { 2,3,4,5 };
        int[] secondArray = { 1,3,5,7 };
        ArrayList<Integer> arrayResult = new ArrayList<Integer>();

        for (int itemFirstArray : firstArray) {
            for (int itemSecondArray : secondArray) {
                if (itemFirstArray == itemSecondArray) {
                    arrayResult.add(itemFirstArray);
                }
            }
        }
        System.out.println(arrayResult);
    }
}
