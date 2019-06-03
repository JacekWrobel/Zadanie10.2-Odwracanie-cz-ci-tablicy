import java.util.Arrays;

public class BackPart {
    public static void main(String[] args) {
        int[] arrayIn = {1,2,3,4,5,6,7,8,9,};
        int number = 7;
        System.out.println(Arrays.toString(arrayIn));


        if (arrayIn.length == 0 || number > arrayIn.length) {
            System.out.println("Błedne dane");
        } else System.out.println(Arrays.toString(changedArray(arrayIn, number)));
    }

    static int[] changedArray(int[] arrayIn, int number) {
        int[] newArray = new int[arrayIn.length];
        for (int i = 0; i < number; i++) {
            newArray[i] = arrayIn[number - 1 - i];
        }
        for (int i = number; i < newArray.length; i++) {
            newArray[i] = arrayIn[i];
        }
        return newArray;
    }
}
