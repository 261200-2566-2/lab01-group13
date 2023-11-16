import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int firstNumber = number.nextInt();
        if (checkFirstNumber(firstNumber)){
            int[] arr = new int[firstNumber];
            for (int i = 0; i < firstNumber; i++) {
                arr[i] = number.nextInt();
            }
            Arrays.sort(arr);
            for ( int x: arr) {
                System.out.println(x);
            }
        }else {
            System.out.println("Number should more than 0");
        }
    }
    public  static  boolean checkFirstNumber(int x){
        if (x >= 0){
            return true;
        }
        return false;
    }
}