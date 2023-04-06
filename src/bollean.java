import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

    public class bollean {
    private static String java;
    public static void main(String[] args) {
        int [] number = {10, 1, 18, 14, 2};

        boolean isSorted = false;
        int position;
        while(!isSorted) {
            isSorted = true;
            Logger.getLogger("name.java.logging.SomeClass").log(Level.INFO,"Some message");
            for (int i = 0; i < number.length-1; i++) {
                if(number[i] > number[i+1]){
                    isSorted = false;
                    position = number[i];
                    number[i] = number[i+1];
                    number[i+1] = position;
                        }
                    }
                }
                System.out.println(Arrays.toString(number));
            }
        }
