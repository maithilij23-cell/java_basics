import java.util.Scanner;

public class UserInput {

    public static void main(String[] args){

        Scanner scanner  = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your fav decimal number : ");
        double favNumber = scanner.nextDouble();

        System.out.println("Are you a human (true/false): ");
        boolean yesHuman = scanner.hasNextBoolean();

        System.out.println("Your name is : " + name);
        System.out.println("Your age is : " + age + ", Senior");
        System.out.println("Your favourite number is: " +favNumber + ", Lucky Num!");

        if(yesHuman) {
            System.out.println("Hello");
        }
        else{
            System.out.println("Robot");
        }

        scanner.close();


    }


        }







