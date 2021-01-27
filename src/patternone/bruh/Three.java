package patternone.bruh;

public class Three implements Base{
    Three(Context c){
        this.c=c;
    }
    Context c;
    @Override
    public String run() {
        c.ch = new One(c);
        return "3";
    }
}
