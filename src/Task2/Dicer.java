package Task2;

public class Dicer implements Player {
    private int count;  // count of victories for one player
    Dicer (int count) {
        this.count = count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void upCount() {
        count++;
    }
}
