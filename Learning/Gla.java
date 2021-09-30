class Gla
{
    Gla(){
        System.out.println("Non para const");
    }
    Gla(int a){
        System.out.println("Para const");
    }
    public static void main(String[] args) {
        Gla obj1=new Gla();
        Gla obj2=new Gla(10);
    }
}