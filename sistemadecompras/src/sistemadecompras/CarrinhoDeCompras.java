package sistemadecompras;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarrinhoDeCompras {

	Map<Usuario, List<Produto>> itens;
	Map<String, String> usuario;

	public CarrinhoDeCompras() {
		itens = new HashMap<>();
	}

	public void listarCarrinho(Usuario user, List<Produto> listaProdutos) {
		for (Map.Entry<Usuario, List<Produto>> entry : itens.entrySet()) {
			Usuario usuarionovo = entry.getKey();
			List<Produto> produtos = entry.getValue();
			System.out.println("Produtos de " + usuarionovo.getLogin() + ":");
			for (Produto produto : produtos) {
				// System.out.println("-" + produto.getNomeProduto() +
				// produto.getPrecoProduto());
				System.out.println("- " + produto.getNomeProduto() + " " + produto.getPrecoProduto());

			}
		}
	}

	public void addProdutos(Usuario usuario, List<Produto> produtoLista) {
		itens.put(usuario, produtoLista);

		/*for (Map.Entry<Usuario, List<Produto>> entry : itens.entrySet()) {
			Usuario usuarionovo = entry.getKey();
			List<Produto> produtos = entry.getValue();
			System.out.println("Produtos de " + usuarionovo.getLogin() + ":");
			for (Produto produto : produtos) {
				// System.out.println("-" + produto.getNomeProduto() +
				// produto.getPrecoProduto());
				System.out.println("- " + produto.getNomeProduto() + " " + produto.getPrecoProduto());

			
		}*/

	}

}
