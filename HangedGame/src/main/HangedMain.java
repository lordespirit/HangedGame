package main;

import util.FileHelper;
import util.Input;

/**
 *  Aplicación para jugar Ahorcado similar a la publicada en: 
	http://pasatiempos.elmundo.es/ahorcado/ahorcado.html 
	 
	En este caso la interfaz de usuario se realizará mediante línea de comandos
	
	 Caracteristicas :
	 
	-Iniciar partida
	-Al inicio de cada partida debe mostrarse una pista para la palabra secreta (e.j pais, nombre, provincia, etc) 
	-Durante el juego el usuario podrá reiniciar  la palabra secreta, pero la racha ganadora se reiniciará también. 
	-Cuenta regresiva de fallos
	-Racha ganadora actual y récord de racha ganadora ganadora (con nick si es el caso)
	-Mensaje Partida ganada
	-Mensaje Partida perdida
	-Si el jugador supera el récord de la racha ganadora, mensaje felicitación y opción de guardar su nick (archivo).
	-Salir del juego
	-Diccionario con minimo 20 palabras
	

 * @author campino
 *
 */

public class HangedMain {
	
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		String difficult = "facil";
		
		HangedModel dictionary = new HangedModel("words.txt");
		HangedBoard board = new HangedBoard();
		String select;
		/*
		do{
		
			select = UserInterface.showMenuInit(board.getStreak());
			switch(select){
			case "jugar":
			case "JUGAR":
				
				HangedModel.SecretWord secretWord = dictionary.getNextWord();
				board.startGame(secretWord.word,10);
				System.out.println("PISTA : " + secretWord.hint);
				String wordPlayer = board.getWordPlayer().toString();
				UserInterface.menuBoard(wordPlayer, secretWord.hint, board.getCurrentfails());
				
				break;
				
				
			case "salir":
			case "SALIR":
				System.out.println("Gracias por jugar");
				if(board.getStreak()>0){
					System.out.println("Conseguiste una racha total de " + board.getStreak() + " FELICIDADES!");
				}
				break;	
			case "dificultad":
			case "DIFICULTAD":
				difficult = UserInterface.menuDifficult();
				break;
				}
		}while(!((select.equals("salir"))||(select.equals("SALIR"))));
		 */
	}
}
