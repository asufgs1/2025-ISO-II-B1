package org.Componente02.Persistencia;

import org.Componente02.Dominio.*;

public class Session {

	private User user;
	private String token;

	public boolean isAuthenticado() {
		// TODO - implement Session.isAuthenticado
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param u
	 */
	public void setUser(User u) {
		this.user = u;
	}

	/**
	 * 
	 * @param t
	 */
	public void setToken(String t) {
		this.token = t;
	}

	public void destruir() {
		// TODO - implement Session.destruir
		throw new UnsupportedOperationException();
	}

}