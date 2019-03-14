public class Main {

    public static void main(String[] args) {

        Dado dado1  = new Dado(40);
        System.out.println(dado1.sorteia(100));

        Dado dado2  = new Dado(10);
        System.out.println(dado2.sorteia(0));

        DadoObj dado3  = new DadoObj(new String[] {"@","%","&","!","?"});
        System.out.println(dado3.sorteiaCar());

        DadoObj dado4  = new DadoObj(new String[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"});
        System.out.println(dado4.sorteiaCar());
    }
}


