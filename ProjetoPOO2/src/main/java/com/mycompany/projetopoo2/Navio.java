/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo2;

public class Navio extends Veiculo {
    private String nome;
    private int numeroTripulantes;
    private String dataLancamento;

    // Construtores
    public Navio() {
    }

    public Navio(String nome, int capacidadeTanque, int numeroPassageiros, float preco, int numeroTripulantes, String dataLancamento) {
        super(capacidadeTanque, numeroPassageiros, preco);
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
        this.dataLancamento = dataLancamento;
    }

    // Getters e Setters
    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    // Método para calcular passageiros por tripulante
    public float passageirosPorTripulante() {
        return (float) numeroPassageiros / numeroTripulantes;
    }

    // Sobrescrita do método imprimir
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de Tripulantes: " + numeroTripulantes);
        System.out.println("Data de Lançamento: " + dataLancamento);
    }
}
