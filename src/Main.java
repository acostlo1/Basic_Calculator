import java.util.Scanner;

/*This basic calculator works on performing simple calculations
by taking user inputs, using switch statements, and using if statements for
any invalid inputs.
 */

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //listed out my variables
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        //asking the user for the first number
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        //asking the user for the operator
        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        //asking the user for the second number
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        //below is the given results depending on the users choices
        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator!");
                validOperation = false;
            }
        }

        if (validOperation){
            System.out.println(result);
        }

        scanner.close();
    }
}