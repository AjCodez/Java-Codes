import java.util.Scanner;
class Ques1
{
    void func1(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            String v1 = sc.next();
            int v2 = Integer.parseInt(v1);
            System.out.println("The square value is: "+ v2*v2);
            System.out.println("The work has been done successfully");
        }
        catch(Exception e){
            System.out.println("Entered input is not a valid format for an integer.");

        }
    }
    public static void main(String[] args) {
        Ques1 obj = new Ques1();
        obj.func1();
    }
}
