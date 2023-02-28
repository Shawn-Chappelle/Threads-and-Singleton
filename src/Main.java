import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ThreadThing> list = new ArrayList<>();
        ThreadThing R = new ThreadThing("thread-1");
        R.start();

        for(int i = 0; i <10; i++){
            list.add(new ThreadThing("thread-" +i));
        }

        for (ThreadThing t: list){
            t.start();
        }
    }
}
