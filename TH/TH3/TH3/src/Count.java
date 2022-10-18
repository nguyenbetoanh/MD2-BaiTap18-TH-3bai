public class Count implements Runnable {
    private Thread myThread;

    public Count() {
        myThread = new Thread(this, "Chuỗi có thể chay đc của tôi");
        System.out.println("Chủ đề đc tạo ra  " + myThread);
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("in số lượng " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("luông bị dán đoạn");
        }
        System.out.println("luồng kết thusc");
    }
}


