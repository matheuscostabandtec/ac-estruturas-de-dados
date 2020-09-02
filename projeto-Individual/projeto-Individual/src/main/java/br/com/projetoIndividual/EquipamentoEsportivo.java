package br.com.projetoIndividual;

public class EquipamentoEsportivo extends Itens {

    private String modalidadeEquipamento;
    private String nomeEquipamento;

    public EquipamentoEsportivo(Integer codigoProduto, Integer qtdProduto, Double valorProduto, String modalidadeEquipamento, String nomeEquipamento) {
        super(codigoProduto, qtdProduto, valorProduto);
        this.modalidadeEquipamento = modalidadeEquipamento;
        this.nomeEquipamento = nomeEquipamento;
    }

    @Override
    public Double getValorCompra() {
        return (super.getValorItem() * super.getQtdItem()) * 1.10;
    }

    public String getModalidadeEquipamento() {
        return modalidadeEquipamento;
    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\n Equipamento esportivo: " +
                "\n Modalidade do equipamento: " + modalidadeEquipamento +
                "\n Nome do equipamento: " + nomeEquipamento +
                "\n Valor de venda: " + String.format("R$ %.2f", getValorCompra());
    }
}
