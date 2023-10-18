package model;

import java.time.LocalDate;

public class ContaPoupanca extends Conta{
    private double taxaJuros;

    public boolean sacar(double valor){
        if(super.getSaldo() >= valor){
            super.setSaldo(getSaldo()-valor);
            return true;
        }
        return false;
    }

    public boolean renderJuros(){
        if(super.getSaldo()>0){
            super.setSaldo(super.getSaldo() + super.getSaldo()*taxaJuros);
            return true;
        }
        return false;
    }
    public ContaPoupanca(Cliente cliente, int agencia, int numero, double saldo, LocalDate dataAbertura,
            double taxaJuros) {
        super(cliente, agencia, numero, saldo, dataAbertura,"Popança");
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}
