import java.util.Scanner;

public class ArrayOper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={10,20,30,40,50};
        System.out.println("Search for all elemnets ");
        int key = sc.nextInt();
        boolean found = false;
        for(int num : arr) {
            if(num == key) {
                found = true;
                break;
            }
        }
        System.out.println(found?"Element found":"Element Not found ");
       int sum= 0;
       for(int num : arr) {
           sum += num;
       }
       System.out.println("Sum of elements: " + sum);
    }
    
}
