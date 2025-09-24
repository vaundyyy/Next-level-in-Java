package Math;

public class multiplicationTableWork implements multiplicationNumbers{
    @Override
    public void showMultiplicationTable(int number) {
        System.out.println("Multiplication table of " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
