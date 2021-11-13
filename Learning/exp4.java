import java.util.Scanner;
class exp5
{
    void func1(){
        try{
            Scanner sc = new Scanner(System.in);
            int ar[] = new int[5];
            for (int i = 0; i < 6; i++) {
                ar[i]=sc.nextInt();
            }
            System.out.println("Array elements : ");
            for (int i = 0; i < ar.length; i++) {
                System.out.println(ar[i]);
            }
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException ae){
            System.out.println("Exception occured: "+ae);
        }
    }
    void func2(){
        System.out.println("function 2 is working");
    }
    public static void main(String[] args) {
        exp5 obj = new exp5();
        obj.func1();
        obj.func2();
    }
}