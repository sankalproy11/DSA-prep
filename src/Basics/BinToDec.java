package Basics;

import java.util.Scanner;

public class BinToDec {

    public static int len(int num){
        int count = 0;
        if(num == 0){
            return 1;
        }else{
            while(num!=0){
                count++;
                num /= 10;
            }
        }
        return count;
    }
    public static int convertToDec(int binNum){
        // get length of binary num
        // put a loop for extracting the digits and putting it in an array
        // inside another loop - multiply it with 2 ^ (0 to length - 1)
        // another loop for adding the elements
        // return

        int length = len(binNum);
        int temp = binNum;
        int digit, res = 0;
        int[] arr = new int [length];

        for(int i = 0; i < length;i++){
            int power = (int) Math.pow(2,i);
            digit = temp % 10;
            digit = digit * power;
            arr[i] = digit;
            temp /= 10;
        }
        for (int i = 0; i < length; i++) {
            res += arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number: ");
        int i = sc.nextInt();
        int temp = i;
        int length = len(i);
        int digit;
        boolean flag = false;
        for (int j = 0; j < length; j++) {
            digit = temp % 10;
            if(digit != 0 && digit!=1){
                flag = false;
                break;
            }else{
                flag = true;
            }
            temp/=10;
        }
        if(flag){
            System.out.println("Decimal No: " + convertToDec(i));
        }else{
            System.out.println("Not a valid Binary Number!");
        }
    }
}
