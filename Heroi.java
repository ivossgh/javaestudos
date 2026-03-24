public class Heroi{
    String nome;
    int vida;
    int forca;
    int dano;


    void atacar(){
        System.out.println(nome + " Atacou e deu " + dano + " de dano ");
    }

    void recebeDano(int danoRecebido){
        vida = vida - danoRecebido;
        System.out.println(nome + " recebeu " + danoRecebido + " de dano! Vida restante " + vida);
    }
}

/*

No objeto h2 (Superman), você não definiu um valor para o atributo dano.
Em Java, variáveis numéricas de classe são iniciadas automaticamente com 0.
Por isso, ao chamar h2.recebeDano(), o resultado será 0 de dano e a vida continuará em 1000.
Além disso, para o método recebeDano ser dinâmico,
o ideal seria que ele aceitasse o dano de outro herói como parâmetro.
Aqui está uma sugestão rápida para corrigir e conectar os dois heróis:

 */