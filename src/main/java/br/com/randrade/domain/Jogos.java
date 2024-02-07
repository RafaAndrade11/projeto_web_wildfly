/**
 * 
 */
package br.com.randrade.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author rafael.andrade
 *
 */
@Entity
@Table(name = "TB_JOGOS")
public class Jogos implements Persistente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="jogos_seq")
	@SequenceGenerator(name="jogos_seq", sequenceName="sq_jogos", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "NOME", nullable = false, unique = true, length = 50)
	private String nome;
	
	@Column(name = "PLATAFORMA", nullable = false, length = 50)
    private String plataforma;
    
	@Column(name = "ANO", nullable = false, length = 4)
    private int ano;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public int getDat() {
		return ano;
	}

	public void setDat(int ano) {
		this.ano = ano;
	}
	
}
