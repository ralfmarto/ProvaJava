package br.com.prova.livraria.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TemaBean {

	private String tema = "trontastic";

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String[] getTemas() {
		return new String[] {"le-frog", "vader", "trontastic","sunny","ui-lightness","afterdark" };
	}

}
