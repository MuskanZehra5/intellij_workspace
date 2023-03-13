public class threadtest {
    public static void main(String args[]) {
        workermain.worker w1 = new workermain.worker("amna");
        workermain.worker w2 = new workermain.worker("eman");
        workermain.worker w3 = new workermain.worker("zabbu");

        Thread t1 = new Thread(w1);
        //thread ki priority set kr deta is k begair threads apni marzi se execute hoti
        t1.setPriority(Thread.MAX_PRIORITY);
        Thread t2 = new Thread(w2);
        t2.setPriority(Thread.MIN_PRIORITY);
        Thread t3 = new Thread(w3);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();


    }

}
