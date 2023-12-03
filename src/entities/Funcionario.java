package entities;

public class Funcionario {
    private String nome;
    private double salario;
    private String dataEmissao;

    public Funcionario(){}

    public Funcionario(String nome, double salario, String dataEmissao) {
        this.nome = nome;
        this.salario = salario;
        this.dataEmissao = dataEmissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", dataEmissao='" + dataEmissao + '\'' +
                '}';
    }
}
