public class Main {

    public static void printInc(int n){
        // 1 2 3 4 5 6 7 8 9 10
        if (n==1) {
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        int n = 10;
        printInc(n);
    }
    
}
