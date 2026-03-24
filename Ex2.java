public class Ex2 {
    public static void main(String[] args){
        Heroi h1 = new Heroi();
        h1.nome = "Batman";
        h1.vida = 550;
        h1.forca = 300;
        h1.dano = 100;
        h1.atacar();

        Heroi h2 = new Heroi();
        h2.nome = "Superman";
        h2.vida = 1000;
        h2.forca = 1000;
        h2.recebeDano(h1.dano);
    }
}