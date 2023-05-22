package sistemadecompras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaDeCompras {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int escolha;
		do {
			System.out.println("Digite 1 para Logar ou 0 para Sair");
			escolha = scanner.nextInt();

			switch (escolha) {
			case 1: {

				String login = "";
				BancoDeDados bd = new BancoDeDados();

				Usuario usuarioTeste = new Usuario(null, null);
				List<Usuario> dadosusuariosLogados = new ArrayList<>();

				Produto produtosTest = new Produto(login, 0);
				List<Produto> dadosDoCarrinho = new ArrayList<>();

				CarrinhoDeCompras carrinhoTeste = new CarrinhoDeCompras();

				List<Produto> produtosCarrinhos = new ArrayList<>();

				//Scanner scanner = new Scanner(System.in);

				while (login.isEmpty()) {
					System.out.println("Digite seu nome de usuário:");
					login = scanner.nextLine();
					System.out.println("Digite sua senha:");
					String senha = scanner.nextLine();

					if (usuarioTeste.validarUsuario(login, senha)) {
						System.out.println("Login bem-sucedido!");

						usuarioTeste.setLogin(login);
						usuarioTeste.setSenha(senha);
						dadosusuariosLogados.add(usuarioTeste);

						System.out.println("Usuario teste: " + usuarioTeste.getLogin() + usuarioTeste.getSenha());

						// Map<List<Usuario>, List<Produto>> produtosDoUsuario = new HashMap<>();

						int opcao;
						do {

							System.out.println("||                Escolha uma opção ");
							System.out.println("||                     Para sair digite 0:  ||");
							System.out.println("||       Para Consultar Produtos digite 1:  ||");
							System.out.println("||listar os Produtos no carrinho digite 2:  ||");
							System.out.println("||Adicionar Produtos ao carrinho digite 3:  ||");

							opcao = scanner.nextInt();
							Produto produtoLista = new Produto(senha, opcao);

							switch (opcao) {
							case 1: {

								produtoLista.listarProdutos();

								break;
							}
							case 2: {

								carrinhoTeste.listarCarrinho(usuarioTeste, produtosCarrinhos);

								break;
							}
							case 3: {

								System.out.println("Digite o nome do Produto a ser adicionado no carrinho: \n \n");

								String nomeProdutoCarrinho = scanner.next();

								if (produtosTest.validarProduto(nomeProdutoCarrinho)) {

									for (Produto produto : bd.getlistaProdutos()) {
										if (produto.getNomeProduto().equals(nomeProdutoCarrinho)) {
											String produtoNome = produto.getNomeProduto();
											Double produtoPreco = produto.getPrecoProduto();

											Produto produtoCopia = new Produto(produtoNome, produtoPreco);
											dadosDoCarrinho.add(produtoCopia);
											carrinhoTeste.addProdutos(usuarioTeste, dadosDoCarrinho);
										}

									}

								}

								break;
							}
							case 0: {
								System.out.println("Logoff ....");
								break;
							}

							default:
								System.out.println("Opção inválida. Tente novamente!");
								break;
							}

						} while (opcao != 0);

					} else {
						System.out.println("Nome de usuário ou senha incorretos.");
						login = "";

						System.out.println("\n");
						System.out.println("\n");
						System.out.println("\n");
					}

				}

				scanner.close();
				break;

			}
			case 0: {
				System.out.println("Tchau ....");
				break;

			}

			default:
				System.out.println("Opção inválida. Tente novamente!");
				escolha = 1;
			}

		} while (escolha <=1);
		scanner.close();
	}

}
