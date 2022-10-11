import java.util.ArrayList;

public class TestBoxing {
    //Integer Object
    Integer i= new Integer(20);


    //unboxing
    int unbox = i;

    Character a ='a';
    char ch=a;

    public void testCollectBoxing() {
        Integer i= new Integer(30);
        int primitive = i.intValue();
        ArrayList<Integer> list = new ArrayList();
        int value= 2;
        list.add(value);
    }
}
