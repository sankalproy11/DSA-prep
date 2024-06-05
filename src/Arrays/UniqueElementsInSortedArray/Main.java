package Arrays.UniqueElementsInSortedArray;

import java.util.Scanner;

public class Main {
    public static int uniqueCount(int[] arr){
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[j]!=arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+ 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");
        int[] arr = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }

        System.out.println("The second smallest Element is: "+ uniqueCount(arr));

    }
}