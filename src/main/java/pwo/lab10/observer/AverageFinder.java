package pwo.lab10.observer;

import pwo.lab10.observer.Publisher.Subscriber;

public class AverageFinder implements Subscriber {
    Integer sum = 0;
    Integer count = 0;

    @Override
    public void action(int x) {
        sum = sum == null ? x : sum + x;
        count++;
    }

    public float getAverage() {
        return (float)sum/count;
    }
}
