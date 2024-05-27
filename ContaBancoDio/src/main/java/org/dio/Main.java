package org.dio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("nome: " + nomeCliente);

        System.out.println("Insira a agencia da conta: ");
        String agencia = scanner.nextLine();
        System.out.println("agencia: " + agencia);

        System.out.println("Insira o numero da conta: ");
        int numero = scanner.nextInt();
        System.out.println("numero: " + numero);

        System.out.println("Insira o saldo da conta: ");
        float saldo = (float) scanner.nextInt();
        System.out.println("saldo: " + saldo);

        scanner.close();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}