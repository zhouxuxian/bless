import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bless {
    public static String[] blessWord = new String[]{"新年快乐，孤寡孤寡","新年新对象，年年不一样"};
    public static int count = 10000;//每条线程打印的数目
    public static int threadCount=99999;//线程数
    public static int i = 0;//线程名
    public static int k = 0;//线程名
    public static ExecutorService fixedExecutor = Executors.newFixedThreadPool(threadCount);
    public static void main(String[] args) {

        for (;i<threadCount;i++){
            fixedExecutor.execute(() -> {
                for (int j=0;j<count;j++)
                System.out.println("打印第一种的线程 "+Thread.currentThread().getName()+blessWord[0]);
            });
        }

        for (;k<threadCount;k++){
            fixedExecutor.execute(() -> {
                for (int j=0;j<count;j++)
                System.out.println("打印第二种的线程 "+Thread.currentThread().getName()+blessWord[1]);
            });
        }
        //还差8条
        for (int m =0;m<8;m++){
            System.out.println("main"+blessWord[0]);
            System.out.println("main"+blessWord[1]);
        }

        fixedExecutor.shutdown();








    }
}
