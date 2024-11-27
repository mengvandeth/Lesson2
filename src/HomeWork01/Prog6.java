package HomeWork01;

public class Prog6 {

    public static void main(String[] args) {
        int[] arrayOfInts = {2,21,3,45,12,18,6,-3,-1,22};
        secondMin(arrayOfInts);
    }
    public static void secondMin(int[] arrayOfInts){
        int minValue = 2147483647;
        int secondMinValue = 2147483647;

        for (int number : arrayOfInts) {
            if (number < minValue) {
                minValue = number;
            }
        }
        for (int number : arrayOfInts) {
            if (number != minValue) {
                if (number < secondMinValue) {
                    secondMinValue = number;
                }
            }
        }
        System.out.println(secondMinValue);
    }
}
