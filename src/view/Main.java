package view;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.Endereco;
import model.PessoaFisica;
import model.PessoaJuridica;

import java.util.Scanner;

import java.time.LocalDate;

public class Main{

        static int numContaPoup = 0;
        static int numContaCorr = 1000;
        static Conta[] contas = new Conta[100];
        static int pos = 0;
        /**
         * @param args
         */
        public static void main(String[] args) {

                


                boolean flag = true;
                
                while(flag){
                        System.out.println("\n\n------------Bem vindo ao sistema do nosso banco!!!------------");
                        System.out.println("------------Escolha uma das ações:------------\n\n");
                        System.out.println("(1) - Para criar uma conta");
 
                        System.out.println("(2) - Para ver todos os clientes");

                        System.out.println("(3) - Para fazer uma tranferência");

                        System.out.println("(0) - Para encerrar sessão");
                        Scanner scan = new Scanner(System.in);
                        int choose = scan.nextInt();
                        
                        
                        switch(choose){

                                case 0:
                                System.out.println("Sessão encerrada!");
                                        flag = false;
                                        break;



                                case 1:
                                        System.out.println("(1) - Para conta Corrente.");
                                        System.out.println("(2) - Para conta Poupança.");
                                        int tipoConta = scan.nextInt();
                                        scan.nextLine();
                                        if(tipoConta == 1){
                                                // TODO
                                                System.out.println("Vamos criar sua conta Corrente!");
                                               
                                                System.out.println("Endereço:\n Rua:");
                                                String rua = scan.nextLine();
                                                System.out.println("Número:");
                                                int num = scan.nextInt();
                                                scan.nextLine();
                                                System.out.println("Cidade:");
                                                String cidade = scan.nextLine();                                                
                                                Endereco endereco = new Endereco(rua, num, cidade);
                                                System.out.println("Digite 1 para pessoa física:");
                                                System.out.println("Digite 2 para pessoa jurídica:");
                                                int escolhaPessoa = scan.nextInt();
                                                scan.nextLine();
                                                if(escolhaPessoa == 1){
                                                        System.out.println("Por favor nos informe o seu nome:");
                                                        String nome = scan.nextLine();
                                                        System.out.println("Ano de nascimento:");
                                                        int ano = scan.nextInt();
                                                        System.out.println("Mês de nascimento:");
                                                        int mes = scan.nextInt();
                                                        System.out.println("Dia de nascimento:");
                                                        int dia = scan.nextInt();
                                                        scan.nextLine();
                                                        System.out.println("Digite seu CPF:");
                                                        String cpf = scan.nextLine();
                                                        PessoaFisica novoClienteFisica = new PessoaFisica(100, endereco, cpf, nome, LocalDate.of(ano, mes, dia));
                                                        ContaCorrente novaContaCorrente = new ContaCorrente(novoClienteFisica, 1, numContaCorr, 0, LocalDate.now(), 30);
                                                        numContaCorr++;
                                                        contas[pos] = novaContaCorrente;
                                                        pos++;
                                                        System.out.println("Conta criada com sucesso");                                          
                                                }
                                                else if(escolhaPessoa == 2){
                                                        System.out.println("Digite seu CNPJ:");
                                                        String cnpj = scan.nextLine();
                                                        System.out.println("Digite a razão social");
                                                        String razao = scan.nextLine();
                                                        PessoaJuridica novoClienteJuridica = new PessoaJuridica(200, endereco, cnpj, razao);
                                                        ContaCorrente novaContaCorrente = new ContaCorrente(novoClienteJuridica, 1, numContaCorr, 0, LocalDate.now(), 60);
                                                        numContaCorr++;
                                                        contas[pos] = novaContaCorrente;
                                                        pos++;
                                                        System.out.println("Conta criada com sucesso\n\n");
                                                }       
                                                break;
                                        }
                                        else if(tipoConta == 2){
                                                // TODO
                                                System.out.println("Vamos criar sua conta Poupança!");
                                               
                                                System.out.println("Endereço:\n Rua:");
                                                String rua = scan.nextLine();
                                                System.out.println("Número:");
                                                int num = scan.nextInt();
                                                scan.nextLine();
                                                System.out.println("Cidade:");
                                                String cidade = scan.nextLine();                                                
                                                Endereco endereco = new Endereco(rua, num, cidade);
                                                System.out.println("Digite 1 para pessoa física:");
                                                System.out.println("Digite 2 para pessoa jurídica:");
                                                int escolhaPessoa = scan.nextInt();
                                                scan.nextLine();
                                                if(escolhaPessoa == 1){
                                                        System.out.println("Por favor nos informe o seu nome:");
                                                        String nome = scan.nextLine();
                                                        System.out.println("Ano de nascimento:");
                                                        int ano = scan.nextInt();
                                                        System.out.println("Mês de nascimento:");
                                                        int mes = scan.nextInt();
                                                        System.out.println("Dia de nascimento:");
                                                        int dia = scan.nextInt();
                                                        scan.nextLine();
                                                        System.out.println("Digite seu CPF:");
                                                        String cpf = scan.nextLine();
                                                        PessoaFisica novoClienteFisica = new PessoaFisica(100, endereco, cpf, nome, LocalDate.of(ano, mes, dia));
                                                        ContaPoupanca novaContaPoupanca = new ContaPoupanca(novoClienteFisica, 1, numContaPoup, 0, LocalDate.now(), 30);
                                                        numContaPoup++;
                                                        contas[pos] = novaContaPoupanca;
                                                        pos++;
                                                        System.out.println("Conta criada com sucesso");                                          
                                                }
                                                if(escolhaPessoa == 2){
                                                        System.out.println("Digite seu CNPJ:");
                                                        String cnpj = scan.nextLine();
                                                        System.out.println("Digite a razão social");
                                                        String razao = scan.nextLine();
                                                        PessoaJuridica novoClienteJuridica = new PessoaJuridica(200, endereco, cnpj, razao);
                                                        ContaPoupanca novaContaPoupanca = new ContaPoupanca(novoClienteJuridica, 1, numContaPoup, 0, LocalDate.now(), 60);
                                                        numContaPoup++;
                                                        contas[pos] = novaContaPoupanca;
                                                        pos++;
                                                        System.out.println("Conta criada com sucesso\n\n");


                                                
                                                }       
                                                break;
                                        }
                                        else{
                                                System.out.println("Desculpe, valor inválido!!\n\n");
                                                break;
                                        }
                                case 2:
                                        System.out.println("Contas cadastradas:");
                                        if(contas[0] != null){
                                                for (Conta conta : contas) {
                                                        if(conta == null){
                                                                break;
                                                        }
                                                        try {
                                                                PessoaFisica pessoa = (PessoaFisica) conta.getCliente();
                                                                System.out.println("\n---------------------------\n");
                                                                if(pessoa.getNome() != null){
                                                                        System.out.println("Cliente: "+pessoa.getNome());
                                                                        System.out.println(("Tipo Conta = "+conta.getTipo()));
                                                                        System.out.println("Saldo: "+conta.getSaldo());
                                                                        System.out.println("Número: "+conta.getNumero());
                                                                }
                                                        } catch (Exception e) {
                                                                PessoaJuridica empresa = (PessoaJuridica) conta.getCliente();
                                                                System.out.println("Empresa: "+empresa.getRazaoSocial());
                                                                System.out.println(("Tipo Conta = "+conta.getTipo()));
                                                                System.out.println("Saldo: "+conta.getSaldo());
                                                                System.out.println("Número: "+conta.getNumero());
                                                        }
                                                } 
                                        }         
                                        else{
                                                System.out.println("Nenhuma conta cadastrada!");
                                        }
                                        break; 
                                case 3:
                                        System.out.println("Informe o valor da tranferência:");
                                        double valor = scan.nextDouble();
                                        System.out.println("Número da conta do titular:");
                                        int numTitular = scan.nextInt();
                                        System.out.println("Número da conta de destino:");
                                        int numDestino = scan.nextInt();
                                        Conta contaTitular = null;
                                        Conta contaDestino = null;
                                        
                                        if(contas[0] != null){
                                                for (Conta conta : contas) {
                                                        if(conta != null){
                                                                if(conta.getNumero() == numTitular){
                                                                        contaTitular = conta;
                                                                }
                                                                if(conta.getNumero() == numDestino){
                                                                        contaDestino = conta;
                                                                }
                                                        }
                                                        
                                                }
                                                if(contaTitular != null && contaDestino != null){
                                                        contaTitular.transferir(valor, contaDestino);
                                                        System.out.println("Tranferência realizada com sucesso!");
                                                }
                                                else{
                                                        System.out.println("Conta não encontrada!");
                                                }
                                        }
                                        else{
                                                System.out.println("ERRO! Nenhuma conta cadastrada!");
                                        }
                                        break;                
                        }
                }






                /* 
                Endereco endereco = new Endereco("Rua dos cocos", 163, "Cajazeiras");
                PessoaFisica wesley = new PessoaFisica(1000.0f, endereco, "40344409880", "Wesley", LocalDate.of(1998, 5, 2));
                ContaCorrente wesleyCorrente = new ContaCorrente(wesley, 1, 10, 2000, LocalDate.now(), 500);
                System.out.println(wesley.getNome());
                System.out.println(wesleyCorrente.getSaldo());
                PessoaFisica luiz = new PessoaFisica(2000.0f, endereco, "11111111111", "Luiz", LocalDate.of(1998, 5, 3));
                ContaCorrente luizCorrente = new ContaCorrente(luiz, 1, 2, 5000, LocalDate.now(), 200);
                System.out.println(luiz.getNome());
                System.out.println(luizCorrente.getSaldo());
                wesleyCorrente.transferir(3000, luizCorrente);
                System.out.println(wesleyCorrente.getSaldo());
                System.out.println(luizCorrente.getSaldo());
                ContaPoupanca wesleyPoupanca = new ContaPoupanca(wesley, 1, 2, 3000, LocalDate.now(), 10);
                wesleyPoupanca.transferir(3001, wesleyCorrente);
                System.out.println(wesleyPoupanca.getSaldo());
                System.out.println(wesleyCorrente.getSaldo());
         */
        
        
        }       
}






/* package view;

import model.Cliente;
import model.ContaCorrente;
import model.Endereco;
import model.PessoaFisica;

import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new PessoaFisica(1000,
                new Endereco("Rua A", 30, "Cajazeiras"),
                "111.111.111-01", "João",
                LocalDate.of(1990,1,1));

        ContaCorrente contaCorrente = new ContaCorrente(1,1,
                0, LocalDate.now(), cliente,20);

        contaCorrente.depositar(500);
        contaCorrente.sacar(600);
        contaCorrente.aplicarTaxa();
        contaCorrente.sacar(800);

        System.out.println(contaCorrente.getSaldo());

//        //Para ajudar com as datas
//        DateTimeFormatter formatter = DateTimeFormatter
//                .ofPattern("dd/MM/yyyy");
//        String string = "29/02/2000";
//        //Ler
//        LocalDate localDate = LocalDate.parse(string, formatter);
//        //Escrever
//        System.out.println(localDate.format(formatter));

    }
} */