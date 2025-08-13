public class Produto {

    // ATRIBUTOS

    private int codigoProduto;
    private String nomeProduto;
    private double valorProduto;

    // CONSTRUTOR

    public Produto(int codigoProduto,
                   String nomeProduto,
                   double valorProduto) {
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    // GETTERS & SETTERS

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    // MÉTODOS PARA EXIBIR E MANIPULAR OS DADOS

    public String exibirProduto() {
        return "Código Produto: " + codigoProduto + "\n" +
                "Nome Produto: " + nomeProduto + "\n" +
                "Valor Produto: R$ " + valorProduto;
    }

    public void editarValorProduto(double valor) {
        this.valorProduto = valor;
    }


}