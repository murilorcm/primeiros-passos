package jCode;

public class Funcionario {
    protected String nome;
    protected String departamento;
    protected double salario;
    protected Data dataDeEntrada = new Data();
    protected String rg;
    protected int codFuncionario;
    protected static int qtdFuncionarios = 0;

    public Funcionario(Funcionario f) {
        this.nome = f.nome;
        this.departamento = f.departamento;
        this.salario = f.salario;
        this.dataDeEntrada = f.dataDeEntrada;
        this.rg = f.rg;
        this.codFuncionario = this.qtdFuncionarios;
        this.qtdFuncionarios++;
    }

    public Funcionario(){
    }
    public void recebeAumento(double valor) {
        this.salario += valor;
    }

    public void mostraFuncionario() {
        System.out.println("Código: " + this.codFuncionario);
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: " + salario);
        System.out.println("Salário Anual: " + getGanhaAnual());
        System.out.println("jCode.Data de entrada: " + getDataDeEntrada().getFormatada());
        System.out.println("RG: " + rg + "\n");
    }

    public static int getQtdFuncionarios(){
        return qtdFuncionarios;
    }

    public double getGanhaAnual() {
        return this.salario * 12;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Data getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(Data dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}