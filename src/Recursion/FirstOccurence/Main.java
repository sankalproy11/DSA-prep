public class Main {
    public static int findFirst(int[] arr, int i, int key){
        if(i == arr.length) return -1;
        if (arr[i] == key) return i;

        return findFirst(arr, i+1, key);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 99};
        int i = 0;
        int key = 99;
        System.out.println(findFirst(arr, i, key));
    }
}
