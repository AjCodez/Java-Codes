interface university{
    static void func(){
        System.out.println("static in interface");
    }
}
class college implements university{
    void diploma(){
        System.out.println("self course");
    }
    public static void main(String[] args) {
        college obj = new college();
        obj.diploma();
        university.func();
    }
}