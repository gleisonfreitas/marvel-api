package com.api.marvel.exceptionhandler;

import java.time.LocalDateTime;

public class AplicacaoErro {
	
	private LocalDateTime dataHora;
	private String messagem;
	
	/**
	 * @return the dataHora
	 */
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	/**
	 * @param dataHora the dataHora to set
	 */
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	/**
	 * @return the messagem
	 */
	public String getMessagem() {
		return messagem;
	}
	/**
	 * @param messagem the messagem to set
	 */
	public void setMessagem(String messagem) {
		this.messagem = messagem;
	}
}
