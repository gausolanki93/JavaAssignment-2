//Write a program to calculate area of a rectangle where length and width of the rectangle is entered by user using Scanner class
import java.util.*;
public class Q3 {
    public static void main (String[ ] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length Of Rectangle : ");
        int l = sc.nextInt();

        System.out.println("Enter Width Of Rectangle : ");
        int w = sc.nextInt();

        int area = l*w;

        System.out.println("Area Of Rectangle : " + area);
    }
}
