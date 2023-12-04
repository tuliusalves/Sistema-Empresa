import entities.Departamento;
import entities.Empresa;
import entities.Funcionario;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        Funcionario funcionarios= new Funcionario("b",300,"d");
        Departamento dep= new Departamento();
        Departamento dep2= new Departamento();
        Empresa empresa= new Empresa();
        //Setando o nome dos departamentos
        dep.setNome("Limpeza");
        dep2.setNome("TI");
        //Se a empresa for de TI, haverá aumento
        dep2.aumentoSalario();
       //Setando nome da empresa
        empresa.setNome("Carrefour");
        empresa.setCNPJ("xxxxxx");

      //Adicionando Funcionários a empresa
        empresa.adicionarDepartamento(dep);
        empresa.adicionarFuncionario(dep,funcionarios);

        empresa.imprimirDepartamentos();
    }
}