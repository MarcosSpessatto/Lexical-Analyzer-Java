package lexical_analyzer;

import java.util.HashMap;

public class Output {

	private static HashMap<Integer, String> output = new HashMap<Integer, String>();
	
	public static void setIdentifier(int line, String value){
		int index;
		if((index = Symbols.getIndexIfExists(value)) != 0){
			output.put(line, "IDENTIFICADOR "+ index);
		}else{
			output.put(line, "IDENTIFICADOR " + Symbols.getIndexOfIdentifier(value));
		}
	}

	public static void setInt(int line){
		output.put(line, "INT");
	}
	
	public static void setFloat(int line){
		output.put(line, "FLOAT");
	}
	
	public static void setChar(int line){
		output.put(line, "CHAR");
	}
	
	public static void setDouble(int line){
		output.put(line, "DOUBLE");
	}
	
	public static void setReal(int line){
		output.put(line, "REAL");
	}
	
	public static void setBoolean(int line){
		output.put(line, "BOOLEAN");
	}
	
	public static void setIntegerIdentifier(int line, String value){
		int index;
		if((index = Symbols.getIndexIfExists(value)) != 0){
			output.put(line, "NÚMERO INTEIRO " + index);
		}else{
			output.put(line, "NÚMERO INTEIRO " + Symbols.getIndexOfIdentifier(value));
		}
	}
	
	public static void setFloatIdentifier(int line, String value){
		int index;
		if((index = Symbols.getIndexIfExists(value)) != 0){
			output.put(line, "NÚMERO REAL " + index);
		}else{
			output.put(line, "NÚMERO REAL " + Symbols.getIndexOfIdentifier(value));
		}
	}
	
	public static HashMap<Integer, String> getOutput(){
		return output;
	}
}
