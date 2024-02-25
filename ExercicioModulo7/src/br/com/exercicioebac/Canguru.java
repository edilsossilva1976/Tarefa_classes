//Código referente ao exercicio do Módulo 7 da Ebac

package br.com.exercicioebac;

public class Canguru {
	private String nome;
    private float peso;
    private float altura;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	/**
	 * author: Edilson Alves Ferreira da Silva
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Canguru canguru = new Canguru();
		 
		 canguru.setNome("Joe");
		 canguru.setAltura(175);
		 canguru.setPeso(90);
		 
		 System.out.println("O canguru se chama: " + canguru.getNome());
		 System.out.println("O canguru pesa: " + canguru.getPeso());
		 System.out.println("O canguru mede: " + canguru.getAltura() + " metros de altura");
		  
		pular(6);
	}
	
	/* Comentário de uma linha */
	public static void pular(int qtd) {
		int pulos = qtd;
		System.out.println("O canguru pulou "+ pulos + " vezes");
	}

}
