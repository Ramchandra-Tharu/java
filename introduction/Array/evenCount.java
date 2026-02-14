package Array;

public class evenCount {
        public static void main(String[] args) {
            int count = 0;
            int arr [] = { 1, 2, 3, 4, 5, 7, 8};
            for(int i = 1; i< arr.length; i++){
                if(arr[i] % 2 == 0){
                                System.out.println(arr[i]);

                    count++;
                }
            }
            System.out.println("eevn number is = " + count);

        }
}
