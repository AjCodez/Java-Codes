import java.util.Scanner;
class exp2
{
    void func1(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("enter element 1");
            int v1 = sc.nextInt();
            System.out.println("enter element 2");
            int v2 = sc.nextInt();

            int res=v1/v2;
            System.out.println("result = "+res);
        }
        catch(Exception e){
            System.out.println("Exception occured: "+e);

        }
    }
    void func2(){
        System.out.println("function 2 is working");
    }
    public static void main(String[] args) {
        exp2 obj = new exp2();
        obj.func1();
        obj.func2();
    }
}