
package com.mycompany.projetopoo2;
public class Veiculo {
    // Atributos protegidos
    protected String nome;
    protected int capacidadeTanque;
    protected int numeroPassageiros;
    protected float preco;

    // Construtores
    public Veiculo() {
    
    }

    public Veiculo(int capacidadeTanque, int numeroPassageiros, float preco) {
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
    }

    // Métodos de acesso (getters e setters)
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    // Método para imprimir os dados
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Capacidade do Tanque: " + capacidadeTanque);
        System.out.println("Número de Passageiros: " + numeroPassageiros);
        System.out.println("Preço: " + preco);
    }
}