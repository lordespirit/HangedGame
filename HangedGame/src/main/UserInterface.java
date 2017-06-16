package main;

import util.Input;

public class UserInterface {

	final int facil = 10;
	final int normal = 5;
	final int dificil = 3;
	
	public static void showMenuInit(int actualStreak){
		
			System.out.println("*******************");
			System.out.println("JUEGO DEL AHORCADO");
			System.out.println("*******************");
			System.out.println("Racha actual de " + actualStreak);
			System.out.println("jugar\nsalir\ndificultad");
			System.out.print("Elige una opción : ");
			
			
	}
	
	public static void showMenuInit(int actualStreak, int maxStreak){

			System.out.println("*******************");
			System.out.println("JUEGO DEL AHORCADO");
			System.out.println("*******************");
			System.out.println("Racha actual de " + actualStreak + " | Racha record de : " + maxStreak);
			System.out.println("jugar\nsalir\ndificultad");
			System.out.print("Elige una opción : ");
	
	}
	
	public static void showMenuDifficult() {

			System.out.println("**********************");
			System.out.println("SELECTOR DE DIFICULTAD");
			System.out.println("**********************");
			System.out.println("facil\t 10 intentos");
			System.out.println("normal\t 5 intentos");
			System.out.println("dificil\t 3 intentos");
			System.out.print("Elige una opción : ");
			int difficult = scanMenudifficult();
	
	}
	
	public static String scanMenuInicio(){
		String option;
		do{
			option = Input.scannLine();
			if(!(option.toLowerCase().equals("jugar")||option.toLowerCase().equals("salir")||option.toLowerCase().equals("dificultad"))){
				System.out.println("Opción no válida. Vuelva a intentarlo: ");
			}
		}while(!(option.toLowerCase().equals("jugar")||option.toLowerCase().equals("salir")||option.toLowerCase().equals("dificultad")));
		return option;
	}
	
	public static String scanMenuBoard(){
		String valid=null;
		while(valid==null){
			String option=Input.scannLine().toLowerCase();
			
		
				if (option.equals("exit")){
					valid=option; 
					break;
				}else if(option.equals("reset")){
					valid=option;
					break;
				}else if(option.length()==1){
					valid=option;
					break;
				}else{
					System.out.println(option + " No es opcion valida. Vuelva a intentarlo: ");
				}
		}
		
		return hint;
		
	}
	
	public static String scanMenuEndGame(){
		return Input.scannLine();
	}
	
	
	public static String showMenuBoard(String wordPlayer, String hint, int attempts){
		
		System.out.println("Tablero:");
		System.out.println("\nPista: " +hint );
		
		System.out.println("\n" + wordPlayer);
		System.out.println("\nIntentos restantes: "+ attempts);
		
}
	
	public static void showMenuAgain(boolean winner){
		

	}
	
	public static int scanMenudifficult(){

		do{
			String difficult = Input.scannLine();
			switch(difficult){
			case "facil":
				return 10;
			case "normal":
				return 5;
			case "dificil":
				return 3;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		}while(true);

	}


}
