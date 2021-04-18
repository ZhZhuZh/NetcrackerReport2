package Task4;

import java.util.ArrayList;

public interface ThreeNumbers {
    void setX(int value);
    void setY(int value);
    void setZ(int value);
    int getX();
    int getY();
    int getZ();
    ArrayList<Integer> getLessThan(int value);
}
