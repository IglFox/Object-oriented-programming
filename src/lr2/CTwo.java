package lr2;

public class CTwo {
    private String s;
    private COne obj;


    // конструкторы
    public CTwo() {
        this("Empty", new COne());
    }

    public CTwo(String s) {
        this(s, new COne());
    }

    public CTwo(COne obj) {
        this("Empty", obj);
    }

    public CTwo(String s, COne obj) {
        this.s = s;
        this.obj = new COne(obj);
    }


    // геттеры и сеттеры
    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public COne getObj() {
        return obj;
    }

    public void setObj(COne obj) {
        this.obj = new COne(obj);
    }


    public void print() {
        IO.println(String.format("ctwo: | s: %s | obj: %s | obj.l: %d | obj.s: %s |", s, obj, obj.getL(), obj.getS()));
    }
}
