import java.util.Scanner;

public class Sliding{
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter target: ");
        int target = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] arr2 = new int[n];

        int temp = 0;
        int k = 1;
        for (int i = 0; i < n; i++) {
            while (temp <= target) {
                temp = temp + arr[i] + arr[k];
                if(temp == target){
                    System.out.println(i+" ,"+k);
                }
                k++;
            }
            k = 1;
        }

    }
}