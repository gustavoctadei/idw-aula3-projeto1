/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unir.idw.bean;

import java.io.Serializable;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;


/**
 *
 * @author Gustavo
 */

@ManagedBean
@Named
@SessionScoped
public class UsuarioBean implements Serializable {
    
    private String nome;
    private String email;
    private String senha;
    private String confirmaSenha;
    private Date dataNascimento;
    
    public String novo() {
        return "usuario";
    }
    
    public String salvar() {
        FacesContext context = FacesContext.getCurrentInstance();
        
        if (!this.senha.equals(this.confirmaSenha)) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Senha não confirmada", ""));
            return "usuario";
        }
        
        return "mostraUsuario";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getConfirmaSenha() {
        return confirmaSenha;
    }

    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha = confirmaSenha;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
}
