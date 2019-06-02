import java.util.Arrays;
import java.util.Random;

public class BackPart {
    public static void main(String[] args) {
        int[] arrayIn = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //int[] arrayIn = new int[10];
        //Random random = new Random();
        //for (int i = 0; i < arrayIn.length; i++){
        //    arrayIn[i] = random.nextInt(99);
        //}

        String arrayInString = Arrays.toString(arrayIn);
        System.out.println(arrayInString);

        String newArrayString = Arrays.toString(changing(arrayIn, 5));
        System.out.println(newArrayString);
    }

    static int[] changing(int[] arrayIn, int number) {

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
