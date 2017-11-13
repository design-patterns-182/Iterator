package br.com.studiotrek;

import java.util.Calendar;
import java.util.Iterator;

public class Main {

	private static long startTime;
    private static long endTime;
	
    public static String[] createArray() {
    	
    	int qtdElementos = 10;
    	
    	String[] nomes = new String[qtdElementos];
    	
    	for (int i = 0; i < qtdElementos; i++) {
    		nomes[i] = "Nome " + i;
		}
    	
    	return nomes;
    }
    
	public static void main(String[] args) {
		String[] nomes = createArray();
		
		ListaNomes listaNomes = new ListaNomes(nomes);
		Iterator<String> iterator = listaNomes.iterator();
		iterator.hasNext();
		iterator.remove();
		
		startTime = Calendar.getInstance().getTimeInMillis();
		
		while (iterator.hasNext()) {
			String nome = iterator.next();
			System.out.println(nome);
		}
		
		endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("Iterator loop : " + (endTime - startTime) + " ms");
		
		System.out.println("--------------------------------");
		System.out.println("Testando o foreach");
		
		startTime = Calendar.getInstance().getTimeInMillis();
		
		for (String nome : listaNomes) {
			System.out.println(nome);
		}
		
		endTime = Calendar.getInstance().getTimeInMillis();
		System.out.println("For each loop : " + (endTime - startTime) + " ms");
	}
	
}
