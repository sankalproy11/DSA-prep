package Arrays.MoveZeros.Optimal;

import java.util.Scanner;

public class Main {
    public static void MoveZerosOptimal(int[] arr){
        int n = arr.length;
        int j = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1) return;
        for (int i = j + 1; i < n; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
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

        MoveZerosOptimal(arr);
        System.out.println("New array after moving all the zeros: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

    }
}
