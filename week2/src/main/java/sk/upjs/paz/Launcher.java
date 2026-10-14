package sk.upjs.paz;

import sk.upjs.jpaz2.*;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		WinPane sandbox = new WinPane();

		SmartTurtle franklin = new SmartTurtle();
		sandbox.add(franklin);

		ObjectInspector oi = new ObjectInspector();
		oi.inspect(franklin);
		oi.inspect(sandbox);

		Artist cecil = new Artist();
		sandbox.add(cecil);
		oi.inspect(cecil);

		
	}
}
