package model;

import java.time.LocalDate;

public class ContaCorrente extends Conta {
    private double taxaManutencao;

    public boolean sacar(double valor){
        double credito = super.getCliente().getLimiteCredito();
        if (super.getSaldo()+credito >= valor){
            super.setSaldo(getSaldo()-valor);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean aplicarTaxa(){
        if(super.getSaldo()+super.getCliente().getLimiteCredito() >= taxaManutencao){
            super.setSaldo(super.getSaldo()-taxaManutencao);
            return true;
        }
        return false;
    }

    public ContaCorrente(Cliente cliente, int agencia, int numero, double saldo, LocalDate dataAbertura,
            double taxaManutencao) {
        super(cliente, agencia, numero, saldo, dataAbertura);
        this.taxaManutencao = taxaManutencao;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }
    public boolean transferir(double valor, Conta conta){
        if(valor > super.getSaldo()+super.getCliente().getLimiteCredito()){
            return false;
        }
        else{
            super.setSaldo(super.getSaldo()-valor);
            conta.setSaldo(conta.getSaldo()+valor);
            return true;
        }
    }
}
