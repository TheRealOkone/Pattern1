package patternone.bruh;

public class Two implements Base{
    Two(Context c){
        this.c=c;
    }
    Context c;
    @Override
    public String run() {
        c.ch = new Three(c);
        return "2";
    }
}
