package Task3;

public class ExtendedClass {
    private byte b;
    private int i;
    private double d;
    private String s;

    public void setB(byte b) {
        this.b = b;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setS(String s) {
        this.s = s;
    }

    public byte getB() {
        return b;
    }

    public int getI() {
        return i;
    }

    public double getD() {
        return d;
    }

    public String getS() {
        return s;
    }

    @Override
    public boolean equals(Object anObject) {
        if (anObject == this) {
            return true;
        }
        if (anObject == null || anObject.getClass() != this.getClass()) {
            return false;
        }
        ExtendedClass e = (ExtendedClass) anObject;
        return (b == e.getB()) && (i == e.getI()) && (d == e.getD()) && (s != null && s.equals(e.getS()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result =1;
        result = prime * result + i;
        result = prime * result + b;
        int intD = (int) d;
        result = prime * result + intD;
        result = prime * result + ((s == null) ? 0 : s.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return (b + "-" + i + "-" + d + "-" + s);
    }
}
