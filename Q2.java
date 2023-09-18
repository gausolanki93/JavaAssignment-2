//Write a program to calculate Simple Interest where user entered Principal amount, time and rate of interest. Take all the inputs in a single line and split the data.
import java.util.*;
public class Q2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal Time and Rate of Interest : ");
        int p  = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        int si = (p*r*n)/100;

        System.out.println("Simple Interst is" + si);
    }
}

