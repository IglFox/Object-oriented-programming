package lr3;

import lr2.CTwo;

public class CThree extends CTwo {
    private String s;


    // конструкторы
    public CThree() {
        this.s = "Empty";
    }

    public CThree(String s) {
        this.s = s;
    }


    // геттер и сеттер
    @Override
    public String getS() {
        return s;
    }

    @Override
    public void setS(String s) {
        this.s = s;
    }


    @Override
    public void print() {
        IO.println(String.format("cthree: | s: %s |", s));
    }
}
