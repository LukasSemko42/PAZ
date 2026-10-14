package sk.upjs.paz;

import sk.upjs.jpaz2.*;

import java.util.Scanner;
import java.util.StringJoiner;

public class Launcher {

	public static void main(String[] args) {
		GridPane sandbox = new GridPane();
//		StringTurtle franklin = new StringTurtle();

//		sandbox.add(franklin);

		ObjectInspector oi = new ObjectInspector();
//		oi.inspect(franklin);
		oi.inspect(sandbox);


		sandbox.drawGrid();
		sandbox.resetColorSet();

		StringBuilder meno = new StringBuilder();

		
	}
}
