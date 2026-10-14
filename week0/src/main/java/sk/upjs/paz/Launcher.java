package sk.upjs.paz;

import sk.upjs.jpaz2.*;

import java.awt.*;

public class Launcher {

	public static void main(String[] args) {
		WinPane sandbox = new WinPane();

		SmartTurtle franklin = new SmartTurtle();
		sandbox.add(franklin);

		ObjectInspector oi = new ObjectInspector();
		oi.inspect(franklin);
		oi.inspect(sandbox);

		SmartTurtle cecil = new SmartTurtle();
		oi.inspect(cecil);
		sandbox.add(cecil);

		}

	}