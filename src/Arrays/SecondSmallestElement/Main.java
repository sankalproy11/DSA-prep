package Arrays.SecondSmallestElement;

import java.util.Scanner;

public class Main {
    public static int SecondSmallestOptimal(int arr[]){
        int n = arr.length;
        int smallest = arr[0];
        int secSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            if(arr[i]<smallest){
                secSmallest = smallest;
                smallest = arr[i];
            }
            if(arr[i]>smallest){
                if(arr[i]<secSmallest){
                    secSmallest = arr[i];
                }
            }
        }
        return secSmallest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");
        int[] arr = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }

        System.out.println("The second smallest Element is: "+ SecondSmallestOptimal(arr));

    }
}
