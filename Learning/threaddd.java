public class threaddd extends Thread{
    public void run(){
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
                sleep(1000);
            }
        } catch (Exception e) {
                System.out.println(e);
        }
    }
    public static void main(String[] args) {
        threaddd obj = new threaddd();
        obj.start();
    }
}
