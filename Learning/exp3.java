import java.util.Scanner;
class exp4
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
        catch(ArithmeticException ae){
            System.out.println("Exception occured: "+ae);
        }
        catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println("Exception occured: "+aiobe);
        }
    }
    void func2(){
        System.out.println("function 2 is working");
    }
    public static void main(String[] args) {
        exp4 obj = new exp4();
        obj.func1();
        obj.func2();
    }
}