package Arrays.MoveZeros.Brute;

import java.util.Scanner;

public class Main {
    public static void MoveZerosBrute(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                temp[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");
        int[] arr = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }

        MoveZerosBrute(arr);
        System.out.println("New array after moving all the zeros: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

    }
}
