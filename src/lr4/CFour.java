package lr4;

import lr3.CThree;
import lr2.COne;

public class CFour extends CThree {
    private COne obj;


    // констукторы
    public CFour() {
        this.obj = new COne();
    }

    public CFour(COne obj) {
        this.obj = new COne(obj);
    }


    // геттер и сеттер
    @Override
    public COne getObj() {
        return obj;
    }

    @Override
    public void setObj(COne obj) {
        this.obj = obj;
    }


    public void print() {
        IO.println(String.format("CFour: | obj: %s | obj.l: %d | obj.s: %s |", obj, obj.getL(), obj.getS()));
    }
}
