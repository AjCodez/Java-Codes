class stringbufferexample{
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("Hello");
        StringBuffer s2=new StringBuffer("Ajit");
        System.out.println(s1);
        System.out.println("\n\n--------------------\n\n");
        s1.append(s2);
        s1.reverse();
        System.out.println(s1);
    }
}