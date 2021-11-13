import java.util.Scanner;
class arr4{
    public static void main(String[] args) {
        String ar[]=new String[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            ar[i]=sc.nextLine();
        }
        for (String s : ar) {
            System.out.print(s+" ");
        }
    }
}