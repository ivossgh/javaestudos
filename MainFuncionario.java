public class MainFuncionario {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario(
                "Marcao",
                "Backend",
                3500.00,
                "11/01/2027",
                "06994916336"
        );

        f1.status();
        f1.recebeAumento(500.00);
    }
}