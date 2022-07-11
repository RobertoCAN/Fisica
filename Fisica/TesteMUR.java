package br.com.Fisica;

import java.util.Scanner;

public class TesteMUR {

	public static void main(String[] args) {
		Mur mur = new Mur();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a distancia em Km:");
		mur.distancia = scan.nextInt();
		
		System.out.println("Digite o tempo em min:");
		mur.tempo = scan.nextInt();

		System.out.println(mur.velocidadeMedia());
	}

}
