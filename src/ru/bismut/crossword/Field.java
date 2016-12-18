package ru.bismut.crossword;

public class Field {

    private int size;
    // массив для хранения поля
    // первые два измерения - "x" и "y" поля
    // третье хранит букву в ячейке и состояние ячейки
    // например в field[15][15][0] лежит буква 'а'
    // а в field[15][15][1] лежит состояние VERTICAL,
    // это значит что эта буква в слове по вертикали
    private char[][][] field;

    // состояния ячейки
    final static char EMPTY = 0; // ячейка пустая
    final static char VERTICAL = 1; // слово по вертикали
    final static char HORIZONTAL = 2; // по горизонтали
    final static char FULL = 3; // по вертикали и по горизонтали, т.е. пересечение занято

    Field(int size) {
	this.size = size;
	field = new char[size][size][2];
	
	for (int i = 0; i < size; i++)
	    for (int j = 0; j < size; j++)
		field[i][j][0] = ' ';
    }

    public void printField() {
	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++)
		System.out.printf("%c ", field[i][j][0]);
	    System.out.println();
	}
    }

    public void setValue(int x, int y, char value, char state) {
	field[x][y][0] = value;
	field[x][y][1] = state;
    }

    public char getValue(int x, int y) {
	return field[x][y][0];
    }

    public char getState(int x, int y) {
	return field[x][y][1];
    }

    public int getSize() {
	return size;
    }
        
}
