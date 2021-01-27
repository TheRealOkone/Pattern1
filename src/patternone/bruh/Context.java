package patternone.bruh;

public class Context {

    static Base ch;
    private void check(){

    }

    public void active(){
        ch = new One(this);
        Thread t = Thread.currentThread();
        Runnable task1 = new Runnable() {
            Thread p = t;
            public void run() {
                while(true){
                    System.out.println(ch.run());
                    if(t.getState() == Thread.State.TIMED_WAITING){
                        break;
                    }
                }
            }};
        Thread thread1 = new Thread(task1);
        thread1.start();
    }


}
