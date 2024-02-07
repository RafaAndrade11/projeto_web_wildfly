/**
 * 
 */
package br.com.randrade.controller;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.randrade.domain.Jogos;
import br.com.randrade.service.IJogosService;

/**
 * @author rafael.andrade
 */
@Named
@ViewScoped
public class JogosController implements Serializable {
	
	private static final long serialVersionUID = 9124707447295250408L;	
	
	private Jogos jogos;
	
	private Collection<Jogos> jogos1;
	
	@Inject
	private IJogosService jogosService;
	
	private Boolean isUpdate;
	
	@PostConstruct
    public void init() {
		try {
			this.isUpdate = false;
			this.jogos = new Jogos();
			this.jogos1 = jogosService.buscarTodos();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao tentar listar os jogos"));
		}
	}

	public Jogos getJogos() {
		return jogos;
	}

	public void setJogos(Jogos jogos) {
		this.jogos = jogos;
	}

	public Collection<Jogos> getJogos1() {
		return jogos1;
	}

	public void setJogos1(Collection<Jogos> jogos1) {
		this.jogos1 = jogos1;
	}

	public Boolean getIsUpdate() {
		return isUpdate;
	}

	public void setIsUpdate(Boolean isUpdate) {
		this.isUpdate = isUpdate;
	}
	
	
}
