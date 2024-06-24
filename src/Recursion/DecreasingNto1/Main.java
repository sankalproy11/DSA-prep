public class Main {

    public static int print(int n){
        if(n == 1){
            return 1;
        }else{

            System.out.print(n+" ");
            return print(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(print(5));
    }
}
