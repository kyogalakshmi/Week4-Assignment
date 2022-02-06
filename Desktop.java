package org.system;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("Desktop Size is 19 inches");
	}
	
	public static void main(String[] args) {
		System.out.println("Single inheritance");
		System.out.println("*******************************");
		Desktop obj = new Desktop();
		// Single Inheritance
		obj.computerModel();
		obj.desktopSize();

	}

}
