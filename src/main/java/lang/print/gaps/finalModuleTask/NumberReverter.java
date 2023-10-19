package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int number1 = number/100;
        int number2 = ((number -(number1*100))/10)*10;
        int number3 = ((number -(number1*100))-(number2))*100;


        System.out.println(number3+number2+number1);
    }
}
