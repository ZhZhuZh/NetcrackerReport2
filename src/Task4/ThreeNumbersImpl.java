package Task4;

import java.util.ArrayList;

public class ThreeNumbersImpl implements ThreeNumbers {
    private int x;
    private int y;
    private int z;
    ThreeNumbersImpl (int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void setX(int value) {
        this.x = value;
    }

    @Override
    public void setY(int value) {
        this.y = value;
    }

    @Override
    public void setZ(int value) {
        this.z = value;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getZ() {
        return z;
    }

    @Override
    public ArrayList<Integer> getLessThan(int value) {
        ArrayList<Integer> valuesLessThan= new ArrayList();     // array for numbers which are less than value
        if (x < value) {
            valuesLessThan.add(x);
        }
        if (y < value) {
            valuesLessThan.add(y);
        }
        if (z < value) {
            valuesLessThan.add(z);
        }
        return valuesLessThan;
    }

    public void printLessThan(int value){
        ArrayList<Integer> valuesLessThan = getLessThan(value);     // get array of needed numbers and print them
        if (valuesLessThan.size() == 0){
            System.out.println("No values less than " + value);
        } else {
            System.out.println("You have " + valuesLessThan.size() + " values less than " + value + ": ");
            for(int val: valuesLessThan) {
                System.out.println(val);
            }
        }
    }
}
