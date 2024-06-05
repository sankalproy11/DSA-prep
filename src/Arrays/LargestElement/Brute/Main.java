package Arrays.LargestElement.Brute;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int LargestBrute(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");
        int[] arr = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }

        System.out.println("The largest Element is: "+ LargestBrute(arr));

    }
}
