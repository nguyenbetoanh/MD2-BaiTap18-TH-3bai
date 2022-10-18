public class Main {
    public static void main(String[] args) {
        System.out.println("Chuỗi chính đang chạy....");
        RunnableDemo runnableDemo1=new RunnableDemo("Cơ sở dữ liệu");
        runnableDemo1.start();
        RunnableDemo runnableDemo2 = new RunnableDemo("Gửi Email");
        runnableDemo2.start();
        System.out.println("Chương trình kết thúc");
    }
}