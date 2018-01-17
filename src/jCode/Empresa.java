package jCode;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    protected String nome;
    protected List<Funcionario> funcionarios = new ArrayList();
    protected String cpnj;

    public void adicionarFuncionario (Funcionario f){
        this.funcionarios.add(new Funcionario(f));
    }

    public void mostraFuncionarios(){
        for (Funcionario funcionario: this.funcionarios) {
            funcionario.mostraFuncionario();
        }
    }

    public Funcionario getFuncionarios(int posicao) {
        return funcionarios.get(posicao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }
}


