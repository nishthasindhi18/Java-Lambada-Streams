package palindromestring;
import java.util.Scanner;
public class PalindromeString {
    public static void Palindrome()
    {
      String n,reverse="";
      int i,length;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any string");
      n=sc.nextLine();
        length= n.length();
    for(i=length-1;i>=0;i--)
    {
        reverse= reverse + n.charAt(i); 
    }
    if(reverse.equals(n)){
        System.out.println("palindrome");
    }
    else
    {
        System.out.println("not palindrome");
    }
    }    
    public static void main(String[] args) {
     Palindrome();
    }    
}
