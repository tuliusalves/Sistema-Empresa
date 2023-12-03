package entities;

import java.util.ArrayList;

public class Departamento {
    private String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Departamento(){}

    public Departamento(String nome, ArrayList<Funcionario> funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void adicionarFuncionario(Funcionario funcionario){
        int tamanhoMaximo=4;
        if(funcionarios.size()<tamanhoMaximo){
            funcionarios.add(funcionario);
        }
    }

    public void aumentoSalario(){
        if(getNome()=="TI"){
           for(Funcionario funcionario : this.funcionarios){
               funcionario.setSalario(funcionario.getSalario()*0.10+ funcionario.getSalario());
           }
        }
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nome='" + nome + '\'' +
                ", funcionarios=" + funcionarios +
                '}';
    }
}
