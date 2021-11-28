import java.util.*;
class listdemo {
    void func(){
        List ls = new ArrayList();
        ls.add("Coke");
        ls.add("Frooti");
        ls.add(10);
        ls.add(5.6);
        ls.add("Maggie");
        ls.add("Coke");

        System.out.println(ls);
        System.out.println("No. of items : "+ls.size());

        System.out.println(ls.get(1));
        //ls.set(1,"appyy");
        ls.add(100);
        ls.remove(2);
        System.out.println(ls);
        System.out.println("No. of items : "+ls.size());
    }
    public static void main(String[] args) {
        listdemo obj = new listdemo();
        obj.func();
    }
}
