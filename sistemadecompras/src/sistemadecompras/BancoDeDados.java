package sistemadecompras;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
	public List<Usuario> getListaUsuarios() {
		List<Usuario> listaUsuario = new ArrayList<>();

		listaUsuario.add(new Usuario("Walland", "1020"));
		listaUsuario.add(new Usuario("Fellipe", "1120"));
		listaUsuario.add(new Usuario("Luciano", "1220"));
		listaUsuario.add(new Usuario("Gustavo", "1320"));
		return listaUsuario;

	}

	public List<Produto> getlistaProdutos() {
		List<Produto> listaProdutos = new ArrayList<>();
		listaProdutos.add(new Produto("Bola", 10));
		listaProdutos.add(new Produto("Chuteira", 20));
		listaProdutos.add(new Produto("Luva", 30));
		listaProdutos.add(new Produto("Camisa", 40));
		return listaProdutos;
	}
}