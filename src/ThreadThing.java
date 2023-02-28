public class ThreadThing implements Runnable{
    private Thread thread;
    private String threadName;

ThreadThing (String name){
    threadName = name;
}

    public void run(){
        System.out.println(LazyInitializedSingleton.getInstance().hashCode());
    }
    public void start() {
        if(thread == null){
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
