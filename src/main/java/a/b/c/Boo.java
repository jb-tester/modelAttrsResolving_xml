package a.b.c;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/7/2016.
 * Project: modelAttrsResolving_xml
 * *******************************
 */
public class Boo {
    public String getBooStr() {
        return booStr;
    }

    public void setBooStr(String booStr) {
        this.booStr = booStr;
    }

    private String booStr;

    public Boo(String booSessionAttr1) {
        this.booStr = booSessionAttr1;
    }
}
