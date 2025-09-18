public class Produto {

    private String nome;
    private double valor;
    private int quantidadeEmEstoque;

    public Produto(String nome, double valor, int quantidadeEmEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void escreverDados() {
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Valor Unitário: R$ " + valor);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }

    public double calcularValorTotal() {
        return valor * quantidadeEmEstoque;
    }

    public void alterarQuantidade(int quantidade) {
        this.quantidadeEmEstoque = quantidade;
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Produto 1", 50.0, 100);
        
        produto.escreverDados();
        
        double valorTotal = produto.calcularValorTotal();
        System.out.println("Valor Total em Estoque: R$ " + valorTotal);
        System.out.println("\n");

        produto.alterarQuantidade(-20);
        produto.escreverDados();
        valorTotal = produto.calcularValorTotal();
        System.out.println("Valor Total em Estoque: R$ " + valorTotal);
    }
}
