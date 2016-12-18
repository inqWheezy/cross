package ru.bismut.crossword;

import ru.bismut.crossword.CrossDict;
import ru.bismut.crossword.Field;
import ru.bismut.crossword.Placing;
import java.io.IOException;

public class Crossword {
    public static void main (String[] args) throws IOException {
	int count;
	CrossDict cd = new CrossDict();
	count = cd.fillDict("/home/inquis/data/java/cross.txt");
	for (int i = 0; i < count; i++) {
	    if (i % 10000 == 0)
		System.out.println(cd.getWord(i) + " - " + cd.getDesc(i));
	}
	System.out.println(cd.size());
	Field myField = new Field(30);
	myField.printField();
	Placing placing = new Placing(myField);
    }
}

