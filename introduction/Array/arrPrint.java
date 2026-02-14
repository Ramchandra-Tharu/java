package Array;

public class arrPrint {
    public static void main(String[] args) {
                    int sum = 0;

        
        int arry [] = {3, 5, 6, 4, 2, 3, 6};
        
        for(int i = 0; i<arry.length; i++){
            sum += arry[i];
            
        }
        System.out.println(" sum of array is = "+sum);
    }
}
