public class RunnableDemo implements Runnable{
    private Thread t;
    private final String threadName;

    public RunnableDemo(String name) {
        threadName = name;
        System.out.println("Da tao"+threadName);
    }

    @Override
    public void run() {
        System.out.println("Chay *** "+threadName);
        try {
            for (int i = 4; i >0 ; i--) {
                System.out.println("Thread:-----------------"+threadName+","+i);
                Thread.sleep(50);

            }
        }catch (InterruptedException e){
            System.err.println("Thread"+threadName+"bị dán đoạn");
        }
        System.out.println("Thread"+threadName+"thoát ra");
    }
    public void start(){
        System.out.println("Bắt đầu "+threadName);
        if (t ==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
}
