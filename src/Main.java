import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
//        System.out.println("-------------------");
//        System.out.println("Input first number");
        int firstNumber = number.nextInt();
//        System.out.println("-------------------");
        if (checkFirstNumber(firstNumber)){
//            System.out.println("Input");
            int[] arr = new int[firstNumber];
            for (int i = 0; i < firstNumber; i++) {
                arr[i] = number.nextInt();
            }
//            System.out.println("-------------------");
            Arrays.sort(arr);
//            System.out.println("-------------------");
            for ( int x: arr) {
                System.out.println(x);
            }
//            System.out.println("-------------------");
        }else {
            System.out.println("Number should more than 0");
        }
    }
    public  static  boolean checkFirstNumber(int x){
        if (x >= 0){
            return true;
        }
        return  false;
    }
}