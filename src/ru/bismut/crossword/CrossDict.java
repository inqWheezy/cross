package ru.bismut.crossword;

import java.util.ArrayList; 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CrossDict {

    private ArrayList<String> arrWords = new ArrayList<String>();
    private ArrayList<String> arrDesc = new ArrayList<String>();

    public int fillDict(String fileName) throws IOException {
	BufferedReader reader = new BufferedReader(new FileReader(fileName));
	String line;

	while ((line = reader.readLine()) != null)
	    add(parseWord(line), parseDesc(line));

	return arrWords.size();
    }

    private String parseWord(String line) {
	for (int i = 0; i < line.length(); i++)
	    if (line.charAt(i) == ' ')
	        return line.substring(0, i);
	return "";
    }

    private String parseDesc(String line) {
	for (int i = 0; i < line.length(); i++)
	    if (line.charAt(i) == ' ')
		return line.substring(i + 3, line.length());
	return "";
    }

    public void add(String word, String description) {
	arrWords.add(word);
	arrDesc.add(description);
    }

    public String getWord(int index) {
	return arrWords.get(index);
    }

    public String getDesc(int index) {
	return arrDesc.get(index);
    }

    public int size() {
	return arrWords.size();
    }

}
