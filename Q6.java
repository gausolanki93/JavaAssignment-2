import java.util.*;
public class Q6 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value For A : ");       
        int a = sc.nextInt();
        
        System.out.println("Enter Value For B : ");
        int b = sc.nextInt();

        //Logic
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Before Swapping Value Of A : "+a);
        System.out.println("Before Swapping Value Of B : "+b);
    }
}
    

