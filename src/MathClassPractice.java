public class MathClassPractice {

    public static void main(String []args){
        System.out.println(Math.PI); //Prints the value of PI
        System.out.println(Math.E); //Prints euler constant

        double result;

        result = Math.pow(2,3); //power, raise base to a given power
        result = Math.abs(-5);//Gives number positive if negative(Absolute value)
        result= Math.sqrt(9);
        result = Math.round(4.5);
        result = Math.ceil(3.14); // Round up
        result = Math.floor(3.99); // Round down
        result = Math.max(10,20);
        result = Math.min(10,20);

        System.out.println(result);
    }
}
