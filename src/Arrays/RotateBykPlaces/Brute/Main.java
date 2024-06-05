package Arrays.RotateBykPlaces.Brute;

import java.util.Scanner;

public class Main {
    public static void RotateByK(int[] arr, int k){
        k = k % arr.length;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = k; i < arr.length ; i++) {
            arr[i-k] = arr[i];
        }
        int j = 0;
        for (int i = arr.length - k; i < arr.length ; i++) {
            arr[i] = temp[j];
            j++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int k = sc.nextInt();
        String[] inputArr = input.split(" ");
        int[] arr = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }
        
        RotateByK(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
