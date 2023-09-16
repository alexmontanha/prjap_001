public class Peca {
    public int codigo;
    public String nome;
    public String descricao;
    public double precoUnitario;
    public int quantidadeEstoque;
    
    public int aumentarEstoque(int quantidade) {
        return alterarEstoque(quantidade);
    }

    public int diminuirEstoque(int quantidade) {
        return alterarEstoque(-quantidade);
    }

    public double calcularValorEstoque() {
        return quantidadeEstoque * precoUnitario;
    }

    private int alterarEstoque(int quantidade) {
        int quantidadeAnterior = quantidadeEstoque;
        quantidadeEstoque = quantidadeEstoque + quantidade;
        return quantidadeAnterior;
    }
}
