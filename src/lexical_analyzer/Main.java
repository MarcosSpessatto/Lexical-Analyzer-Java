package lexical_analyzer;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.swing.JFileChooser;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = null;
		JFileChooser chooser = new JFileChooser();
		int returnValue = chooser.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
		   file = chooser.getSelectedFile();
			if(file.exists()){
				LexicalAnalyzer lexical = new LexicalAnalyzer();
				lexical.analyze(file);
				
				printIdentifiers();
				printSymbols();
				printErrors();
			}else{
				System.out.println("Arquivo invalido");
			}
	    }else{
	    	System.out.println("Houston, we have a problem");
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
					System.out.print("e " + error);
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
		LinkedHashMap<Integer, String> identifiers = new LinkedHashMap<Integer, String>();
		identifiers = Output.getOutput();
		List<Integer> indexes = new ArrayList<Integer>(identifiers.keySet()); 
		int length = identifiers.size();
		if(length > 0){
			for(int i = 0; i < length; i++){
				int index = indexes.get(i);
				String identifier = identifiers.get(index);
				if(identifier != null){
					System.out.println("[" + index + "] " +identifier);
				}
			}
		}
	}
}
