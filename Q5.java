import java.util.*;
public class Q5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter Value For A : ");
        int a =sc.nextInt();
        System.out.println("Eneter Value For B : ");
        int b = sc.nextInt();
        int temp;
        
        System.out.println("Before Swapping Value Of A : "+a);
        System.out.println("Before Swapping Value Of B : "+b);

        //Logic 
        temp = a;
        a = b;
        b = temp;

        System.out.println("Before Swapping Value Of A : "+a);
        System.out.println("Before Swapping Value Of B : "+b);
    }
}
