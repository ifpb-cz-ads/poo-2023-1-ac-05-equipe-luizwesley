package view;
import model.Cliente;
import model.ContaCorrente;
import model.Endereco;
import model.PessoaFisica;

import java.time.LocalDate;

public class Main{
        public static void main(String[] args) {
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