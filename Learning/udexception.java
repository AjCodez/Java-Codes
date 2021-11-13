import java.util.Scanner;

class AgeException extends Exception{
    AgeException(){
        System.out.print("under 18 problem ");
    }
}
class udexception {
    void func(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your age");
            int age = sc.nextInt();
             if (age>=18) {
                 System.out.println("vote done");
             } else {
                 throw new AgeException();
             }
        } catch (AgeException e) {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Function working");
        }
    }
    public static void main(String[] args) {
        udexception obj = new udexception();
        obj.func();
    }
}
