public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello Ishan!");
        int myFirstNumber = 5;
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = (myFirstNumber*mySecondNumber) + myFirstNumber % (mySecondNumber / myThirdNumber);
        int finalValue = 1000 - myTotal;
        System.out.println(finalValue);
    }
}
