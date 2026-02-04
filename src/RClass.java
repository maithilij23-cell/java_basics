import java.util.Random;

public class RClass {

    public static void main(String [] args){

        Random random = new Random();

        int number;
        double number1;
        boolean isHeads; // For flipping a coin

        number = random.nextInt(1 ,6); //6 is exclusive, wont count in the output
        number1  = random.nextDouble();
        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("You win");
        }
        else{
            System.out.println("You lose");
        }

        System.out.println(number);
        System.out.println(number1);

    }
}
