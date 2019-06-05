package com.br.zup.teste;

import com.br.zup.pais.Continente;

public class AppContinente {

	public static void main(String[] args) {
		Continente continente = new Continente();
		continente.adicionaPais();
		
		System.out.println(continente.getListaPaises());

	}

}
