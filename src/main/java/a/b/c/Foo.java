package a.b.c;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/7/2016.
 * Project: modelAttrsResolving_xml
 * *******************************
 */
public class Foo {
    private String fooStr;
    private long id;

    public Foo(String fooStr, long id) {
        this.fooStr = fooStr;
        this.id = id;
    }

    public String getFooStr() {
        return fooStr;
    }

    public void setFooStr(String fooStr) {
        this.fooStr = fooStr;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
