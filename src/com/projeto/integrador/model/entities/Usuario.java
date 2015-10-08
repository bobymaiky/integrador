package com.projeto.integrador.model.entities;

import java.beans.Transient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="tb_usuario" )
public class Usuario extends AbstractEntityBean {

	@Id
	@Column(name = "usuario_id", nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "usuario_nome")
    private String nome;
	
	@Column(name = "usuario_senha")
    private String senha;
	
	
	public Usuario(){
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	

    public static final String FIND_BY_EMAIL_SENHA =  "Usuario.findByEmailSenha"; 


}
