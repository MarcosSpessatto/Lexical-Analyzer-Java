package lexical_analyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LexicalAnalyzer {
	Automaton automaton = new Automaton();
	
	public void analyze(File file){
		String line = null;
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			int lineNumber  = 1;
			while((line = br.readLine()) != null) {
				automaton.identifyCharacter(line, lineNumber);
				lineNumber++;
			 }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
