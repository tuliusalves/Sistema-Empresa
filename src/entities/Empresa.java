package entities;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String CNPJ;
    private ArrayList<Departamento> departamentos= new ArrayList<>();

    public Empresa(){}

    public Empresa(String nome, String CNPJ, ArrayList<Departamento> departamentos) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = departamentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void adicionarDepartamento(Departamento departamento){
        int valorMaximo=4;
        if(departamentos.size()<valorMaximo){
            departamentos.add(departamento);
        }
    }

    //Lembre de postar no gitHub antes de fazer o método abaixo.
    //adicione funcionários através da empresa
    public void adicionarFuncionario(Departamento departamento, Funcionario funcionario){
        departamento.adicionarFuncionario(funcionario);
    }

    public void imprimirDepartamentos(){
        for(Departamento aux: departamentos){
            System.out.println(aux);
        }
    }
    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                ", departamentos=" + departamentos +
                '}';
    }
}
