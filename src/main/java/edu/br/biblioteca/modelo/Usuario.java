package edu.br.biblioteca.modelo;

public class Usuario {
	
	private String matricula;
	private String email;
	private String senha;
	
	
	
	public Usuario() {
		super();
	}

	public Usuario(String matricula, String email) {
		super();
		this.matricula = matricula;
		this.email = email;
	}

	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
