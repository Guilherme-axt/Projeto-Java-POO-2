
package com.mycompany.projetopoo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aviao[] avioes = new Aviao[2]; // Vetor de Aviões
        Navio[] navios = new Navio[2]; // Vetor de Navios

        try {
            // Entrada de dados para os aviões
            for (int i = 0; i < avioes.length; i++) {
                System.out.println("Digite os dados do avião " + (i + 1) + ":");
                System.out.print("Prefixo: ");
                String prefixo = scanner.nextLine();
                System.out.print("Capacidade do Tanque: ");
                int capacidadeTanque = scanner.nextInt();
                System.out.print("Número de Passageiros: ");
                int numeroPassageiros = scanner.nextInt();
                System.out.print("Preço: ");
                float preco = scanner.nextFloat();
                scanner.nextLine(); // Limpar buffer
                System.out.print("Data de Revisão: ");
                String dataRevisao = scanner.nextLine();

                avioes[i] = new Aviao(prefixo, capacidadeTanque, numeroPassageiros, preco, prefixo, dataRevisao);
            }

            // Entrada de dados para os navios
            for (int i = 0; i < navios.length; i++) {
                System.out.println("Digite os dados do navio " + (i + 1) + ":");
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Capacidade do Tanque: ");
                int capacidadeTanque = scanner.nextInt();
                System.out.print("Número de Passageiros: ");
                int numeroPassageiros = scanner.nextInt();
                System.out.print("Número de Tripulantes: ");
                int numeroTripulantes = scanner.nextInt();
                System.out.print("Preço: ");
                float preco = scanner.nextFloat();
                scanner.nextLine(); // Limpar buffer
                System.out.print("Data de Lançamento: ");
                String dataLancamento = scanner.nextLine();

                navios[i] = new Navio(nome, capacidadeTanque, numeroPassageiros, preco, numeroTripulantes, dataLancamento);
            }

            // Exibição dos dados
            System.out.println("\nDados dos Aviões:");
            for (Aviao aviao : avioes) {
                aviao.imprimir();
            }

            System.out.println("\nDados dos Navios:");
            for (Navio navio : navios) {
                navio.imprimir();
                System.out.println("Passageiros por Tripulante: " + navio.passageirosPorTripulante());
            }

        } catch (Exception e) {
            System.out.println("Erro de entrada de dados: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
