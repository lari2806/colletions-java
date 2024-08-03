import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }
    
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                valorTotalEstoque = p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(12345, "Leite", 4, 6.99);
        estoqueProdutos.adicionarProduto(234624, "Manteiga", 4, 3.50);
        estoqueProdutos.exibirProdutos();

        System.out.println(estoqueProdutos.calcularValorTotalEstoque());
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
    }
}
