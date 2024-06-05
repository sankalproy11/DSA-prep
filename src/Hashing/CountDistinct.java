package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class CountDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String inputArr[] = input.split(" ");
        int[] a = new int[inputArr.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(inputArr[i]);
        }
        System.out.println(countDistinctElements(a));
    }
    public static int countDistinctElements(int a[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<a.length; i++){
            set.add(a[i]);
        }
        return set.size();
    }
}
