public class DadoObj extends Dado{

    private Object[] dado;

    public DadoObj(Object[] d){
        super(d.length);
        dado = d;
    }

    public Object sorteiaCar(){
        return dado[sorteia(0)-1];
    }
}
