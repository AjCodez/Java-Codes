interface AKTU{
    abstract void btech();
}
interface LPU{
    abstract void mtech();
    public void mba();
}
class college implements AKTU,LPU{
    public void btech(){
        System.out.println("btech by AKTU");
    }
    public void mtech(){
        System.out.println("mtech by LPU");
    }
    public void mba(){
        System.out.println("mba by LPU");
    }
    public static void main(String[] args) {
        college obj=new college();
        obj.btech();
        obj.mtech();
        obj.mba();  
    }
}