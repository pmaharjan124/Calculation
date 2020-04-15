import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculations {
    public static void main(String [] args){
    int num1, num2, sum;
    String message1, message2;
Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number: ");
num1 = sc.nextInt();

System.out.println("Enter Second Number: ");
num2 = sc.nextInt();

sc.close();
sum = num1 + num2;
System.out.println("Sum of these numbers: "+sum);

int product = num1*num2;
System.out.println("Product of the given two numbers: "+product);

double square = Math.pow(num1, 2);
        System.out.println("Square of " + num1 + "is: "+Math.pow(num1, 2));










    }
}
