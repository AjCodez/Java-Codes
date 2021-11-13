import java.util.Scanner;
class exp3
{
    void func1(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("enter element");
            String v1 = sc.next();
            int v2 = Integer.parseInt(v1);


            v1=v1+5;
            v2=v2+5;
            System.out.println("Result :");
            System.out.println(v1);
            System.out.println(v2);
        }
        catch(Exception e){
            System.out.println("Exception occured: "+e);

        }
        finally
        {
            System.out.println("Final block is working");
        }
    }
    void func2(){
        System.out.println("function 2 is working");
    }
    public static void main(String[] args) {
        exp3 obj = new exp3();
        obj.func1();
        obj.func2();
    }
}