package patternone.bruh;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class Context {

    boolean fl = true;

    @GetMapping("/start")
    public String tfl() {
        fl = true;
        return "yes";
    }
    @GetMapping("/stop")
    public String ffl() {
        fl = false;
        return "no";
    }

    static Base ch;
    @Autowired
    Context(){
        this.active();
    }

    public void active(){
        ch = new One(this);
        Thread t = Thread.currentThread();
        Runnable task1 = new Runnable() {
            Thread p = t;
            public void run() {
                while(fl){
                    System.out.println(ch.run());
                    if(p.getState() == Thread.State.TIMED_WAITING){
                        break;
                    }
                }
            }};
        Thread thread1 = new Thread(task1);
        thread1.start();
    }


}
