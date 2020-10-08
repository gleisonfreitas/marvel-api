package com.api.marvel.model.enums;

public enum StrengthLevelEnum {
	
	NORMAL("Normal"),
	MEDIA("Média"),
	GRANDE("Grande"),
	SUPER("Super"),
	MEGA("Mega");
	
	private String descricao;

	private StrengthLevelEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
