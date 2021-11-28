import java.util.Scanner;
class Ques2
{
    void func1(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of elements in the array ");
            int len = sc.nextInt();
            int ar[] = new int[len];
            System.out.println("Enter the elements in the array");
            for (int i = 0; i < len; i++) {
                ar[i]=sc.nextInt();
            }
            System.out.println("Enter the index of the array you want to access ");
            int in = sc.nextInt();
            System.out.println("The array element at index "+in+" = "+ar[in]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occured: "+e);
        }
    }
    public static void main(String[] args) {
        Ques2 obj = new Ques2();
        obj.func1();
    }
}