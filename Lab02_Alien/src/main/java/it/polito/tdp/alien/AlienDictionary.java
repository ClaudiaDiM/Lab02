package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.List;

public class AlienDictionary {
	
	private List<Word> dictionary;

	public AlienDictionary() {
		super();
		dictionary = new ArrayList<Word>();
	}
	
	public void resetDictionary() {
		this.dictionary.clear();
	}
	
	public void addWord(String alien, String translation) {
		Word w = new Word(alien, translation);
		if(this.dictionary.contains(w)) {
			this.dictionary.get(dictionary.indexOf(w)).setTranslation(translation);
			return;
		}
		this.dictionary.add(w);
	}
	
	public String translateWord(String alien) {
		Word w = new Word(alien);
		if(this.dictionary.contains(w)) {
			return this.dictionary.get(this.dictionary.indexOf(w)).getTranslation();
		}
		return null;
	}
	
	public String translateWorldWildCard(String alienWildCard) {
		alienWildCard = alienWildCard.replace("\\?",".");
		
		int matchCounter = 0;
		StringBuilder sb = new StringBuilder();
		
		for(Word w : dictionary) {
			if(w.compareWild(alienWildCard)) {
				matchCounter ++;
				sb.append(w.getTranslation()+"\n");
			}
		}
		
		if(matchCounter!=0) {
			return sb.toString();
		}
		else 
			return null;
	}

	
	

}
