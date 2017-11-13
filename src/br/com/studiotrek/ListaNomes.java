package br.com.studiotrek;

import java.util.Iterator;

public class ListaNomes implements Iterable<String> {

	private String[] nomes;
	private Integer length;
	
	public ListaNomes(String[] nomes) {
		this.nomes = nomes;
		this.length = this.nomes.length;
	}

	@Override
	public Iterator<String> iterator() {
		return new ListaNomesIterator();
	}

	
	private class ListaNomesIterator implements Iterator<String> {

		private Integer i = 0;
		
		@Override
		public boolean hasNext() {
			return (this.i) < ListaNomes.this.length;
		}

		@Override
		public String next() {
			return ListaNomes.this.nomes[i++];
		}
		
		@Override
		public void remove() {
			ListaNomes.this.nomes[i] = null;
			
			for (int j = i; (j + 1) < ListaNomes.this.length; j++) {
				ListaNomes.this.nomes[j] = ListaNomes.this.nomes[j + 1];
			}
			ListaNomes.this.length--;
		}
		
	}
	
}
