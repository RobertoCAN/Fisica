package javaJseProgramacaoBasica;

import javax.swing.JOptionPane;

import java.util.Arrays;
import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				// TODO Auto-generated method stub
				String msg, msg2=null;
				int tam;
				boolean valor = false;
				
				Scanner ler = new Scanner(System.in);
				Scanner ler2 = new Scanner(System.in);
				
					msg = JOptionPane.showInputDialog(null,"Digite uma frase:");
					//System.out.println("Digite uma frase!");
					//msg = ler.nextLine();
					

				tam = msg.length();


				char a[] = new char[tam];
				char b[] = new char[tam];
				
				for (int i = tam - 1, x = 0; i >= 0; x++, i--) {
					//System.out.print(msg.charAt(i));
					a[i] = msg.charAt(i);
					b[x] = a[i];
					msg2 = Arrays.toString(b);
				}			
				
				//System.out.println(msg2);
				//System.out.println();
				for(int i = tam-1 , j = 0; i >=0; i--,j++){
					if(a[i] == msg.charAt(j)) valor = true;
					else{
						valor = false;
						break;
					}
				}
				
				if(valor == true) JOptionPane.showMessageDialog(null,"\nFrase: " + msg + " possui " + tam + " caracteres.\nInvertendo fica:\n"+ msg2+"\nPalavra palíndromo!");
				else JOptionPane.showMessageDialog(null,"\nFrase: " + msg + " possui " + tam + " caracteres.\nInvertendo fica:\n"+ msg2+"\nPalavra não palíndromo!");
				
				}
		}