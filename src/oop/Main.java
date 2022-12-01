package oop;

public class Main {

	public static void main(String[] args) {
		Bottle obj = new Bottle();

		System.out.println("bottle type: " +obj.type);
		System.out.println("bottle weight: "+obj.weight);
		obj.open();
		System.out.println("the bottle is open: "+obj.opened);
		obj.close();
		System.out.println(obj.opened);
	}

}
