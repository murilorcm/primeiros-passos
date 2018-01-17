package jCode;

public class ProgramaEmpresa{
    public static void main(String[] args){
        Empresa e1 = new Empresa();
        Funcionario f = new Funcionario();
        Data data;

        f.nome = "Hugo";
        f.salario = 1000;
        f.recebeAumento(50);
        f.rg = "123456789";
        f.departamento = "Vendas";
        data = new Data(32, 03, 1950);
        f.setDataDeEntrada(data);

        e1.adicionarFuncionario(f);

        //e1.getFuncionarios(0).mostraFuncionario();

        f.nome = "Murilo";
        f.salario = 1450;
        f.recebeAumento(50);
        f.rg = "123456789";
        f.departamento = "Desenvolvimento";
        data = new Data (18, 12, 2017);
        f.setDataDeEntrada(data);

        e1.adicionarFuncionario(f);

        e1.mostraFuncionarios();

        System.out.println(f.getQtdFuncionarios() +" funcionários cadastrados.");
        Funcionario.getQtdFuncionarios();
        System.out.println("Funcionário código 0: ");
        e1.getFuncionarios(0).mostraFuncionario();

    }
}