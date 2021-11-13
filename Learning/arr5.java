import java.util.Scanner;
class arr5{
    public static void main(String[] args) {
        int ar[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            ar[i]=sc.nextInt();
        }
        int s=0;
        for (int a : ar) {
            s+=a;
        }
        System.out.println("Sum : "+s);
    }
}