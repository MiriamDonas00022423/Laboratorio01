import java.util.Scanner;

public class Calculate {


    Scanner in = new Scanner(System.in);
    Operation operation = new Operation();

    int option = 0;

    public void menu(){

        double number_one = 0, number_two = 0;

        do {

            System.out.println("Choose one option from the menu: ");
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiply");
            System.out.println("4) Divide");
            System.out.println("5) Exit");
            option = in.nextInt();


            if(option>=1&&option<=4) {
                System.out.println("Enter the first number: ");
                number_one = in.nextDouble();
                System.out.println("Enter the second number: ");
                number_two = in.nextDouble();
            }

            switch (option) {
                case 1:
                    System.out.println("The result of the addition is: " + operation.addition(number_one, number_two));
                    break;
                case 2:
                    System.out.println("The result of the subtraction is: " + operation.subtraction(number_one, number_two));
                    break;
                case 3:

                    System.out.println("The result of the multiplication is: " + operation.multiply(number_one, number_two));
                    break;
                case 4:

                    System.out.println("The result of the subtraction is: " + operation.divide(number_one, number_two));
                    break;
                case 5:
                    System.out.println("Exit program...");
                    break;
                default:
                    System.out.println("Incorrect option, please select a valid one. ");
            }

        }while (option!=5);


    }
}
