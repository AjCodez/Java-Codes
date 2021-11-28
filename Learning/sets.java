import java.util.*;
class setdemo {
    void func(){
        Set set = new HashSet();
        set.add("Pepsi");
        set.add("perk");
        set.add(500);
        set.add(6.4);
        set.add("Zeherrr");
        set.add("Zeherrr");

        if (set.contains("Pepsi")) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        
        System.out.println(set);
        System.out.println("No. of item's : "+set.size());
    }    
    public static void main(String[] args) {
        setdemo obj = new setdemo();
        obj.func();
    }
}
