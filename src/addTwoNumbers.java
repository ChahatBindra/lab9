import java.util.Scanner;
public class addTwoNumbers
{
   public static void main(String[] args)
   {
      int num1, num2, sum;
      Scanner sc = new Scanner(System.in);
      System.out.println("First number : ");
      num1 = sc.nextInt();
      System.out.println("Second number : ");
      num2 = sc.nextInt();
      sum = addTwoNumbers(num1, num2);
      System.out.println("Sum : " + sum);
      sc.close();
   }
   static int addTwoNumbers(int a, int b)
   {
      return a + b;
   }
}

