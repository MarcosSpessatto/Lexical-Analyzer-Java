package lexical_analyzer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("teste.txt");
		if(file.exists()){
			LexicalAnalyzer lexical = new LexicalAnalyzer();
			lexical.analyze(file);
			
			printIdentifiers();
			printSymbols();
			printErrors();
		}else{
			System.out.println("Arquivo invalido");
		}
		
	}
	
	private static void printErrors(){
		System.out.println("\n");
		ArrayList<Integer> errors = new ArrayList<Integer>();
		errors = Error.getErros();
		int length = errors.size();
		if(length > 0){
			System.out.print("O programa possui erros nas linhas: ");
			for(int i = 0; i < length; i++){
				Integer error = errors.get(i);
				if(i + 1 == length){
					System.out.print(" e " + error);
				}else{
					System.out.print(error + ", ");
				}
			}
		}
	}
	
	private static void printSymbols(){
		System.out.println("\nTabela de Símbolos");
		ArrayList<String> symbols = new ArrayList<String>();
		symbols = Symbols.getSymbols();
		int length = symbols.size();
		if(length > 0){
			for(int i = 0; i < length; i++){
				String symbol = symbols.get(i);
				System.out.println((i + 1) + " " + symbol);
			}
		}
	}

	private static void printIdentifiers(){
		System.out.println("Tabela de Identificadores");
		HashMap<Integer, String> identifiers = new HashMap<Integer, String>();
		identifiers = Output.getOutput();
		int length = identifiers.size();
		if(length > 0){
			for(int i = 1; i < length; i++){
				String identifier = identifiers.get(i);
				System.out.println(identifier);
			}
		}
	}
}
