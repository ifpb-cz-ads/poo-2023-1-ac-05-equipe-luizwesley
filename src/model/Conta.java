package model;

import java.time.LocalDate;

public abstract class Conta {
    private Cliente cliente;
    private int agencia;
    private int numero;
    private double saldo;
    private LocalDate dataAbertura;

    public abstract boolean sacar(double valor);
    
    public boolean depositar(double valor){
        saldo = saldo + valor;
        return true;
    }

    public boolean transferir(double valor, Conta conta){
        if(valor > saldo){
            return false;
        }
        else{
            saldo = saldo - valor;
            conta.setSaldo(conta.getSaldo()+valor);
            return true;
        }
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public LocalDate getDataAbertura() {
        return dataAbertura;
    }
    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    public Conta(Cliente cliente, int agencia, int numero, double saldo, LocalDate dataAbertura) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }
}
