package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String inputArr[] = input.split(" ");
        int[] a = new int[inputArr.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(inputArr[i]);
        }
        frequencyOfAllElements(a);
        sc.close();
    }
    public static void frequencyOfAllElements(int a[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i])+1);
            }else{
                map.put(a[i], 1);
            }
        }
        System.out.println(map);
    }
}
