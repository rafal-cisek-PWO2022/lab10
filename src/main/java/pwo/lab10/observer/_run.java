package pwo.lab10.observer;

public class _run {
    public static void main(String[] args) {
        NumberGetter numberGetter = new NumberGetter();
        MaxFinder maxFinder = new MaxFinder();
        SumFinder sumFinder = new SumFinder();
        numberGetter.add(maxFinder);
        numberGetter.add(sumFinder);
        numberGetter.getNumbers(3);
        System.out.println("Max: " + maxFinder.getMax());
        System.out.println("Sum: " + sumFinder.getSum());
    }
}
