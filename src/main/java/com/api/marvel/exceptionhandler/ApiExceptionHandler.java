package com.api.marvel.exceptionhandler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.api.marvel.domain.model.exception.EntidadeNaoExisteException;

@ControllerAdvice
public class ApiExceptionHandler {
	
	@ExceptionHandler(EntidadeNaoExisteException.class)
	public ResponseEntity<?> handlerEntidadeExisteException(EntidadeNaoExisteException e){
		
		AplicacaoErro aplicacaoErro = criarErro(e.getMessage());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(aplicacaoErro);
	}
	
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<?> handlerUrlInformadaIncorreta(){
		
		AplicacaoErro aplicacaoErro = criarErro("Url informada está incorreta.");
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(aplicacaoErro);
	}

	private static AplicacaoErro criarErro(String message) {
		AplicacaoErro aplicacaoErro = new AplicacaoErro();
		aplicacaoErro.setDataHora(LocalDateTime.now());
		aplicacaoErro.setMessagem(message);
		return aplicacaoErro;
	}
}
