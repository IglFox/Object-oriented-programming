package lr2;

public class COne {
    private long l;
    private String s;


    // конструкторы
    public COne() {
        this(0, "Empty");
    }

    public COne(long l) {
        this(l, "Empty");
    }

    public COne(String s) {
        this(0, s);
    }

    public COne(long l, String s) {
        this.l = l;
        this.s = s;
    }

    public COne(COne other) {
        this.l = other.l;
        this.s = other.s;
    }


    // геттеры и сеттеры
    public long getL() {
        return l;
    }

    public void setL(long l) {
        this.l = l;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }


    public void print() {
        IO.println(String.format("cone: | l: %d | s: %s |", l, s));
    }

}
