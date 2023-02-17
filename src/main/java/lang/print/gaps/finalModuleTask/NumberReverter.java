package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public static void revert(int number) {
        String result = "";
        result += number % 10;
        number /= 10;
        result += number % 10;
        number /= 10;
        result += number % 10;
        System.out.println(result);
    }
}
