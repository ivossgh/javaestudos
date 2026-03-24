public class Funcionario{
    // Atributos
    String nome;
    String departamento;
    double salario;
    String contratado;
    String cpf;

    // Construtor
    public Funcionario(String nome, String departamento, double salario, String contratado, String cpf) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.contratado = contratado;
        this.cpf = cpf;
    }

    // Metodos
       public void status(){
            System.out.println("Funcionario: " + this.nome);
            System.out.println("Departamento: " + this.departamento);
            System.out.println("Salario " + this.salario);
            System.out.println("Data de Contratacao: " + this.contratado);
            System.out.println("Identidade: " + this.cpf);

        }

       public void recebeAumento(double aumento){
            this.salario += aumento;
            System.out.println("Aumento Recebido: " + aumento + "\nSalario Atual: " + salario);
        }
}