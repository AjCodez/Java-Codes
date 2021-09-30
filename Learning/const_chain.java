class Amity{
    Amity(){
        System.out.println("Base class non para");
    }
    Amity(int x){
        System.out.println("Base class para");
    }
}
class GLA extends Amity{
    GLA(){
        System.out.println("Derived class non para");
    }
    GLA(int a){
        super(a); //always in first line of function
        System.out.println("Derived class para");
    }
    public static void main(String[] args) {
        GLA obj = new GLA(10);
    }
}