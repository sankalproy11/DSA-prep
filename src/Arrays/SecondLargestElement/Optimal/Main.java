package Arrays.SecondLargestElement.Optimal;

import java.util.Scanner;

public class Main {
    public static int SecondLargestOptimal(int arr[]){
        int n = arr.length;
        int largest = arr[0];
        int secLargest = -1;

        for (int i = 1; i < n; i++) {
            if(arr[i]==largest){
                continue;
            }
            if(arr[i]>largest){
                secLargest = largest;
                largest = arr[i];
            }
            if(arr[i]<largest){
                if(arr[i]>secLargest){
                    secLargest = arr[i];
                }
            }
        }
        return secLargest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");
        int[] arr = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }

        System.out.println("The second largest Element is: "+ SecondLargestOptimal(arr));

    }
}
