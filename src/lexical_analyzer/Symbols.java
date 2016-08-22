package lexical_analyzer;

import java.util.ArrayList;

public class Symbols {
	
	private static ArrayList<String> symbols = new ArrayList<String>();
	
	public static void addSymbol(String line){
		if(!symbols.contains(line)){
			symbols.add(line);
		}
	}
	
	public static ArrayList<String> getSymbols(){
		return symbols;
	}
	
	public static int getIndexIfExists(String line){
		int length = symbols.size();
		for(int i = 0; i< length; i++){
			if(line.equals(symbols.get(i))){
				return i + 1;
			}
		}
		return 0;
	}
	
	public static int getIndexOfIdentifier(String line){
		int length = symbols.size();
		boolean exists = false;
		int index = 0;
		for(int i = 0; i< length; i++){
			if(line.equals(symbols.get(i))){
				exists = true;
				index = i + 1;
				break;
			}
		}
		if(exists){
			return index;
		}else{
			return length + 1;
			}
		}
	}
