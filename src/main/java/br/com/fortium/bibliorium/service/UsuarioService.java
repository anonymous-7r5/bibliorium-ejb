package br.com.fortium.bibliorium.service;

import br.com.fortium.bibliorium.persistence.enumeration.TipoUsuario;

public interface UsuarioService {
	public TipoUsuario autenticarUsuario(String cpf, String senha);
}
