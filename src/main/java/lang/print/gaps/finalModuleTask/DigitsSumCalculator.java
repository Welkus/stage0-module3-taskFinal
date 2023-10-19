package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

        int number1 = number/1000;
        int number2 = (number/100)%10;
        int number3 = (number/10)%10;
        int number4 = number%10;


        System.out.println(number4+number3+number2+number1);

    }
}
