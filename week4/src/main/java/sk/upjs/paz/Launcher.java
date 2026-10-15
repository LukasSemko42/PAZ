package sk.upjs.paz;

import sk.upjs.jpaz2.*;

import java.util.Scanner;
import java.util.StringJoiner;

public class Launcher {

	public static void main(String[] args) {
		GridPane sandbox = new GridPane();
		OdoTurtle odo = new OdoTurtle();
//		StringTurtle franklin = new StringTurtle();

		sandbox.add(odo);
//		sandbox.add(franklin);

		ObjectInspector oi = new ObjectInspector();
//		oi.inspect(franklin);
//		oi.inspect(sandbox);
		oi.inspect(odo);


		sandbox.drawGrid();
		sandbox.resetColorSet();

	}
}
