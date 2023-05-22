package sistemadecompras;

import java.util.List;

public class Produto {
	private String nomeProduto;
	private double precoProduto;

	public Produto(String nomeProduto, double d) {
		super();
		this.nomeProduto = nomeProduto;
		this.precoProduto = d;
	}

	public boolean validarProduto(String nomeProduto) {
		BancoDeDados baseDeDados = new BancoDeDados();
		List<Produto> produtos = baseDeDados.getlistaProdutos();
		
		for (Produto produto : produtos) {
			if (produto.nomeProduto.equals(nomeProduto)) {
				System.out.println("Produto Existe");
				//System.out.println("PRODUTO: " + produto.nomeProduto);
				//System.out.println("  VALOR: " + produto.precoProduto);
				return true;
			}
		}
		System.out.println("Produto Não Existe");
		return false;
	}
	
	public void listarProdutos() {
		BancoDeDados baseDadosProdutos = new BancoDeDados();
		List<Produto> listaProdutos = baseDadosProdutos.getlistaProdutos();
		
		for (int i = 0; i < listaProdutos.size(); i++) {

			System.out.println("PRODUTO: " + listaProdutos.get(i).getNomeProduto());
			System.out.println("  VALOR: " + listaProdutos.get(i).getPrecoProduto());
		}
	}
	

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

}
