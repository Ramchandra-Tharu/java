package Array;

public class arrRev {
        public static void main(String[] args) {
            int arr [] = {2, 5, 7, 9, 10, 15};
        int max = arr[0];
        for(int i= 1; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                 
            }
           
            

        }
        System.out.println("maximum number in array is : " + max);


        }
}
