package Arrays.RotateBykPlaces.Optimal;

import java.util.Scanner;

public class Main {
    public static void RotateByKLeft(int[] arr, int k){
        int n = arr.length;
        reverse(0,k-1, arr);
        reverse(k,n-1, arr);
        reverse(0, n-1,arr);
    }
    public static void RotateByKRight(int[] arr, int k){
        int n = arr.length;
        reverse(0,(n-k)-1, arr);
        reverse(n-k,n-1, arr);
        reverse(0, n-1,arr);
    }

    public static void reverse(int start, int end, int[] arr){
        int i = start;
        int j = end;

        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
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