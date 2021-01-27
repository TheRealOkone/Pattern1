package patternone.bruh;

public class One implements Base{
    One(Context c){
        this.c=c;
    }
    Context c;

    @Override
    public String run() {
        c.ch = new Two(c);
        return "1";
    }
}
