package org.example.entities;

public class Juridica extends Pessoa{

    private Integer funcionarios;

    public Juridica(){
    }

    public Juridica(String nome, Double rendaAnual,Integer funcionarios) {
        super(nome, rendaAnual);
        this.funcionarios = funcionarios;
    }

    public Integer getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Integer funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public double imposto() {
        if(this.funcionarios <= 10){
            return (rendaAnual * 0.16);
        }
        else return (rendaAnual * 0.14);
    }
}
