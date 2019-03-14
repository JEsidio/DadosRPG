import java.util.Random;

public class Dado {

    int lados;
    Random r = new Random(System.currentTimeMillis());

    public Dado(int d){
        lados = d;
    }

    public int sorteia(int mod){
        int sort = r.nextInt(lados);
        return sort+1+mod;
    }
}
