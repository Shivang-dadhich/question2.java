/* que - Make a program that prints the table of a number that is input by the user.  
 
*/
import java.util.*;
public class que2{
    public static void main(String []args){
    System.out.println("enter a number");
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     System.out.println("table of number"+num+"is");
     for(int i=1;i<=10;i++){
        System.out.println(num*i);
     }

    }
} 
