import entities.Departamento;
import entities.Empresa;
import entities.Funcionario;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Departamento dep= new Departamento();
        dep.setNome("Financeiro");
        Departamento dep2= new Departamento();
        dep2.setNome("Marketing");
        Departamento dep3= new Departamento();
        dep3.setNome("Limpeza");
        Departamento dep4= new Departamento();
        dep4.setNome("TI");


        Funcionario funcionario;
        dep4.adicionarFuncionario(funcionario= new Funcionario("a",100,"c"));
        dep4.adicionarFuncionario(funcionario= new Funcionario("a",200,"c"));

        dep4.aumentoSalario();
        Empresa empresa= new Empresa();
        empresa.setNome("Carrefour");
        empresa.setCNPJ("xxxxxx");

        empresa.adicionarDepartamento(dep);
        empresa.adicionarDepartamento(dep2);
        empresa.adicionarDepartamento(dep3);
        empresa.adicionarDepartamento(dep4);

        empresa.imprimirDepartamentos();
    }
}