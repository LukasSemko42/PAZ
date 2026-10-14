package sk.upjs.paz;

import sk.upjs.jpaz2.*;

public class Launcher {
	public static void main(String[] args) {
		ScientificTurtle franklin = new ScientificTurtle();
		ObjectInspector oi = new ObjectInspector();
//		WinPane sandbox = new WinPane();
//		sandbox.add(franklin);
//		oi.inspect(sandbox);
		oi.inspect(franklin);

	}
}
