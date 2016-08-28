package lexical_analyzer;

import java.util.LinkedHashMap;

public class Output {

	private static LinkedHashMap<Integer, String> output = new LinkedHashMap<Integer, String>();
	
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
	
	public static void setCommentIdentifier(int line, String value){
		output.put(line, "COMENTÁRIO");
	}
	
	public static LinkedHashMap<Integer, String> getOutput(){
		return output;
	}
}
