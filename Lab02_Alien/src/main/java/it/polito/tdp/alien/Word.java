package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.List;

public class Word {
	
	private String alienWord;
	private List<String> translations;
	
	public Word(String alienWord, String translation) {
		super();
		this.alienWord = alienWord;
		this.translations = new ArrayList<String>();
		this.translations.add(translation);
		
	}
	
	public Word(String alienWord) {
		super();
		this.alienWord = alienWord;
	}
	
	public boolean compareWild(String alienWild) {
		if(alienWord.matches(alienWild))
			return true;
		return false;
	}
	
	public String getTranslation() {
		String s = "";
		for(String ss : this.translations) {
			s += ss + "\n";
		}
		return s;
	}


	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	

	public void setTranslation(String translation) {
		if(!this.translations.contains(translation))
		this.translations.add(translation);
		}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienWord == null) ? 0 : alienWord.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (alienWord == null) {
			if (other.alienWord != null)
				return false;
		} else if (!alienWord.equals(other.alienWord))
			return false;
		return true;
	}

	
	
	
	

}
