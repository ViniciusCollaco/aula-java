package br.edu.opet;

import java.util.HashSet;

import java.util.Random;

import com.opet.util.Reader;

public class Exercicio1 {

	public static void main(String[] args) {
		
		HashSet<String> alRander = new HashSet<String>();
		
		Random rand = new Random();
		
		while(alRand.size() < 100) {
			int r = rand.nextInt(100);
			String sRand = Integer.toString(r);
			if(!alRand.contains(sRand))
				alRand.add(sRand);
		}
		
		System.out.print("Infor um valor de 0 a 199 :");
		String sUser = Reader.readString();
		
		if(alRand.contains(sUser))
			System.out.println("Valor encontrado "+sUser);
		else
			System.out.println("Valor NAO encontrado "+sUser);
		
	}

}
