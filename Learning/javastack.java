import java.util.*;
class javastack{
    void stack(){
        List ls = new ArrayList();

        Scanner sc = new Scanner(System.in);
        int ch;
        while (true) {
            System.out.println("press 1 for add element\npress 2 for pop element\npress 3 to print last element\npress 4 to display stack\npress other key to exit");
            ch = sc.nextInt();
            if(ch==1){
                int a = sc.nextInt();
                ls.add(a);
            }
            else if(ch==2){
                ls.remove(0);
            }       
            else if(ch==3){
                System.out.println(ls.get(ls.size()-1));
            }
            else if(ch==4){
                System.out.println(ls);
            }
            else{
                break;
            }
        }
    }
    public static void main(String[] args) {
        javastack obj = new javastack();
        obj.stack();
    }
}