//Write a program to calculate the area of a circle where the radius is accepted from user
import java.util.*;
public class Q4 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius Of Circle: ");

        int r = sc.nextInt();
        double  pi = 3.14;

        double area = (pi*r*r);

        System.out.println("Area Of Circle : " + area);


    }
}
