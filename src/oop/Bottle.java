package oop;

public class Bottle {

	int weight = 1;
	String type = "plastic";
	boolean opened = false;

	public void open() {
		opened = true;
	}

	public void close() {
		opened = false;
	}

}
