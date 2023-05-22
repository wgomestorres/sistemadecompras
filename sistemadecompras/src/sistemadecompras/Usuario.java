package sistemadecompras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Usuario {
	private String login;
	private String senha;

	public boolean validarUsuario(String login, String senha) {
		BancoDeDados baseDeDados = new BancoDeDados();
		List<Usuario> usuarios = baseDeDados.getListaUsuarios();

		for (Usuario usuario : usuarios) {
			if (usuario.login.equals(login) && usuario.senha.equals(senha)) {
				return true;
			}
		}
		return false;
	}

	public Usuario(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
