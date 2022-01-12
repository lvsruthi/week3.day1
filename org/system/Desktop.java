package org.system;

public class Desktop extends Computer{

	public void desktopSize()
	{
		
		System.out.println(" Desktop size is 20*30");
		
	}
	public static void main(String args[])
	{
		
		Desktop samsung = new Desktop();
		samsung.desktopSize();
		samsung.computerModel();
	}
}
