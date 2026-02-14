public class Array{
    public static void main(String[] args) {
        int sum = 0;

        int arr [] = {3, 4, 5, 6, 7, 8, 64, 3, 3, 54};

        for( int i = 0; i<=arr.length; i ++){
            sum += arr[i];
            System.out.println("sum of arr is : " + sum);
        }
}
}
