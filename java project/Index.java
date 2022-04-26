
import java.text.NumberFormat;
import java.util.Scanner;

public class Index {

    public static void main(String... args) {
            /*
             String s1 = "Hello";
             String s2 = "Hello";
             String s3 = new String(s1);
             String s4 = new String("Hello");
             if (s1 == s2)
             System.out.println("s1==s2");
             if (s1 == s3)
                 System.out.println("s1==s3");
             if (s2.equals(s3))
                 System.out.println("s2 equals s3");
     }
*/
  /*      Scanner temp = new Scanner(System.in);
        String income = "";
       while(!income.equals("QUIT")){
           System.out.print("Input: ");
            income = temp.next().toUpperCase();
           System.out.println(income);
       }
      /* if (income % 5 == 0 && income % 3 == 0)
           System.out.println("fizzBuzz");
       else if (income % 3 == 0)
           System.out.println("buzz");
       else if(income % 5 == 0)
           System.out.println("fizz");
       else
           System.out.println(income);
*/
        System.out.println("please kindly enter your principal");
        final byte percent = 100;
        final byte yearInMonth = 12;
        Scanner loan = new Scanner(System.in);
        System.out.print("");

        long Principal = loan.nextLong();
        System.out.println("Principal: " + Principal);
        System.out.print("");
        System.out.println("please kindly enter your rated interest");
        float interest = loan.nextFloat();
        System.out.println("Annual Interest Rate:  " + interest);
        float annualInterest = interest / percent;
        System.out.println("annual interest: " + annualInterest);
        float monthlyInterest = annualInterest / yearInMonth;
        System.out.println("monthly interest: " + monthlyInterest);
        System.out.print("");
        System.out.println("please kindly enter your repay duration");
        long period = loan.nextLong();
        System.out.println("Period(years): " + period + " years");
        long monthlyPeriod = period * yearInMonth;
        System.out.println("duration in yearInMonth is: " + monthlyPeriod);
        double mortgage = (Principal * (monthlyInterest * Math.pow((1 + monthlyInterest), monthlyPeriod))) / (Math.pow((1 + monthlyInterest), monthlyPeriod) - 1);
        System.out.println("the Mortgage is: " + mortgage);
        String currency = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("mortgage is: " + currency);
    }
}