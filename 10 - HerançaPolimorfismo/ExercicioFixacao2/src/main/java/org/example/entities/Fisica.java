package org.example.entities;

public class Fisica extends Pessoa {

    private Double gastoSaude;

    public Fisica(){
    }

    public Fisica(String nome, Double rendaAnual, Double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double imposto() {
        if(this.rendaAnual < 20000.00){
            return (rendaAnual * 0.15) - (this.gastoSaude * 0.5);
        }
        else return (rendaAnual * 0.25) - (this.gastoSaude * 0.5);
    }
}
