package Arrays.RotateBykPlaces.Brute;

import java.util.Scanner;

public class Main {
    public static void RotateByKLeft(int[] arr, int k){
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
    public static void RotateByKRight(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] temp = new int[n];
        for (int i = n-k; i < n; i++) {
            temp[i-(n-k)] = arr[i];
        }
        for (int i = k; i < n;  i++) {
            temp[i] = arr[i-k];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
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
        int[] arr2 = new int[inputArr.length];
        System.arraycopy(arr, 0, arr2, 0, inputArr.length);

        RotateByKLeft(arr, k);
        RotateByKRight(arr2, k);
        System.out.println("Rotated Left by "+k+" places");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Rotated Right by "+k+" places");
        for (int j : arr2) {
            System.out.print(j + " ");
        }
    }
}
