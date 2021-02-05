public class Bless {
    public static String[] blessWord = new String[]{"新年快乐，孤寡孤寡","新年新对象，年年不一样"};
    public static int count = 999999998;


    public static void main(String[] args) {

            new Thread(() -> {
                for (int j = 0; j < count; j++) {
                    System.out.println(blessWord[0]);
                }
            }).start();


            new Thread(() -> {
                for (int j = 0; j < count; j++) {
                    System.out.println(blessWord[1]);
                }
            }).start();




    }
}
