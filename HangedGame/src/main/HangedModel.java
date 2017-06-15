package main;

import java.util.Arrays;

import util.FileHelper;

/**
 * Esta clase funciona como diccionario de palabras. Las palabras se guardaran en un archivo, cada linea 
 * correspondera a un par palabra:pista
 * 
 * @author campino
 *
 */
public class HangedModel {
	final String fileDictionary; 
	
	private String[] newWord;
	private String[] oldWord;

	
	public HangedModel(String fileDictionary){
		this.fileDictionary = fileDictionary; 
	}
	
	
	/**
	 * Carga todo el diccionario de palabras desde el fichero
	 */
	private void loadWords(){
		
		String[] fileWords = FileHelper.readFile(fileDictionary);
		newWord = new String[fileWords.length];		
		for(int i=0;i<fileWords.length;i++){
			newWord[i]=fileWords[i];
		}
		
		this.oldWord = new String[0];		
	}
	
	/**
	 * retorna una palabra seleccionada aleatoriamente del arreglo newWord
	 * si no hay mas palabras disponibles en newWord, reinicia los arreglos. 
	 * es decir carga nuevamente las palabras desde el fichero con loadWords()
	 * @return
	 */
	public String getNextWord(){
		
		if(newWord.length==0)
			loadWords();
		
			// Genero un número aleatorio del tamaño del arreglo de newWord
			int randomWord = (int) (Math.random() * this.newWord.length);
			String nextWord = remove(randomWord);
			add(nextWord);
			return nextWord;
	}
	
	
	
	private String remove(int index ){
		String nextWord = this.newWord[index];
		String[] copyNewWords = new String[newWord.length-1];
		int newCounter = 0;
		for(int i=0;i<newWord.length;i++){
			if(!(newWord[i].equals(nextWord))){
				copyNewWords[newCounter++]=newWord[i];
			}
		}
		newWord = copyNewWords;
		return nextWord;
	}
	
	private void add(String usedWord){
		String[] copyOldWord = new String[oldWord.length+1];
		for(int i=0;i<oldWord.length;i++){
			copyOldWord[i]=oldWord[i];
		}
		copyOldWord[oldWord.length]=usedWord;
		oldWord = copyOldWord;
	}


	public String[] getNewWord() {
		return newWord;
	}


	public void setNewWord(String[] newWord) {
		this.newWord = newWord;
	}


	public String[] getOldWord() {
		return oldWord;
	}


	public void setOldWord(String[] oldWord) {
		this.oldWord = oldWord;
	}


	public String getFileDictionary() {
		return fileDictionary;
	}
	
}
