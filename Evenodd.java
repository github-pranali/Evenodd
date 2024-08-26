import java.lang.*;
import java.util.*;
public class Evenodd
{
    public static void main(String[] args){
        int No=0;
        System.out.println("Enter a number");
        Scanner S= new Scanner(System.in);
        No= S.nextInt();

        if(No%2==0)
        {
            System.out.println("Number is even");
    
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}