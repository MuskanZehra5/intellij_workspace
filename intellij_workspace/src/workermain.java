public class workermain {
    public static class worker implements Runnable {
        String name;

        public worker(String name) {
            this.name = name;
        }

        public void run() {
            for (int i = 0; i < 10; i++)
                System.out.println(name + " = " + i);

        }


    }
}
