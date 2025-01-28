import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the first number:");
        double num1=scanner.nextDouble();

        System.out.print("enter the second number:");
        double num2=scanner.nextDouble();

        double addition=num1+num2;
        double subtraction=num1-num2;
        double multiplication=num1*num2;
        double division=num1/num2;

        System.out.println("Addition:" +addition);
        System.out.println("Subtraction:" +subtraction);
        System.out.println("Multiplication:" +multiplication);
        System.out.println("Division:" +division);

        scanner.close();
        




    }
}