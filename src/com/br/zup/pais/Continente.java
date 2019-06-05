package com.br.zup.pais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.br.zup.interfaces.interfacesContinente;

public class Continente implements interfacesContinente {

	private String nome = "";
	private List<Pais> ListaPaises = null;

	public Continente(String nome, List<Pais> listaPaises) {
		super();
		this.nome = nome;
		ListaPaises = listaPaises;
	}

	public String getNome() {
		return nome;
	}

	public Continente() {

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Pais> getListaPaises() {
		return ListaPaises;
	}

	public void setListaPaises(List<Pais> listaPaises) {
		ListaPaises = listaPaises;
	}

	public Scanner entrada() {
		Scanner entrada = new Scanner(System.in);
		return entrada;
	}

	@Override
	public void adicionaPais() {
		List<Pais> listaPais = new ArrayList<Pais>();
		int controle = 1;
		int opcao;
		Scanner scan = entrada();

		System.out.println("Deseja adicionar um pais para este continente?\n" + "Digite '1' para sim ou '0' para não");
		opcao = scan.nextInt();

		while (controle == 1) {
			Scanner scanWh = entrada();
			if (opcao == 1) {
				Scanner scanIf = entrada();
				System.out.println("Digite o Codigo ISO do pais");
				String codigoIso = scanIf.nextLine();

				System.out.println("Digite o nome do pais");
				String nome = scanIf.nextLine();

				System.out.println("Insira o numero populacional do pais");
				int populacao = scanIf.nextInt();

				System.out.println("Insira a dimensão terreste do pais");
				double dimensao = scanIf.nextDouble();

				Pais novoPais = new Pais(codigoIso, nome, populacao, dimensao);
				listaPais.add(novoPais);

			}

			System.out.println("deseja incluir mais um pais?" + "Digite '1' para sim ou '0' para não");
			controle = scanWh.nextInt();

		}
		this.setListaPaises(listaPais);

	}

	@Override
	public double dimensaoTotal() {
		double total = 0;

		for (Pais pais : this.getListaPaises()) {
			total += pais.getDimensao();

		}

		return total;

	}

	@Override
	public int pupulacaoTotal() {
		int total = 0;

		for (Pais pais : this.getListaPaises()) {
			total += pais.getPopulacao();

		}

		return total;
	}

	@Override
	public double densidadeTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Pais maiorPopulacao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pais menorPopulacao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pais maiorDimensao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pais menorDimensao() {
		// TODO Auto-generated method stub
		return null;
	}

}
