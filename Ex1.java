public class Ex1 {
    public static void main(String[] args){
        Heroi h1 = new Heroi();
        h1.nome = "Bataman";
        h1.vida = 200;
        h1.forca = 300;
        h1.atacar();

        Heroi h2 = new Heroi();
        h2.nome = "Flash";
        h2.vida = 250;
        h2.forca = 500;
        h2.atacar();
    }
}