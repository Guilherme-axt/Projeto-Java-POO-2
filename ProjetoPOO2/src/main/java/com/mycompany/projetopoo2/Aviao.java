/**
 *
 * @author Guilherme
 */
package com.mycompany.projetopoo2;
public class Aviao extends Veiculo {
    private String prefixo;
    private String dataRevisao;

    // Construtores
    public Aviao() {
    }

    public Aviao(String nome, int capacidadeTanque, int numeroPassageiros, float preco, String prefixo, String dataRevisao) {
        super(capacidadeTanque, numeroPassageiros, preco);
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
    }

    // Getters e Setters
    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getDataRevisao() {
        return dataRevisao;
    }

    public void setDataRevisao(String dataRevisao) {
        this.dataRevisao = dataRevisao;
    }

    // Método para reajustar o preço
    public void reajustarPreco(float percentual) {
        this.preco += this.preco * (percentual / 100);
    }

    // Sobrescrita do método imprimir
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Prefixo: " + prefixo);
        System.out.println("Data da Revisão: " + dataRevisao);
    }
}
