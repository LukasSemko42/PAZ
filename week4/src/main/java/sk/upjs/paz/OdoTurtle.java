package sk.upjs.paz;

import sk.upjs.jpaz2.Turtle;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Locale;

public class OdoTurtle extends Turtle {
    private double trajectoryLength;

    public double getTrajectoryLength(){
        return trajectoryLength;
    }

    public void resetTrajectoryLength(){
        this.trajectoryLength=0;
    }

    public void measuredStep(double length){
        this.step(length);
        this.trajectoryLength+=length;
    }
    public String camelFormat(String nazov) {
        nazov=nazov.toLowerCase().trim();
        String[] nazovOddeleny = nazov.split(" ");

        StringBuilder novyNazov = new StringBuilder();

        novyNazov.append(nazovOddeleny[0]);
        for (int i = 1; i < nazovOddeleny.length; i++) {
            String slovo = nazovOddeleny[i];
            if (!slovo.isEmpty()) {
                char velkyPrvyChar = Character.toUpperCase(slovo.charAt(0));
                String zvysokSlova = slovo.substring(1);
                novyNazov.append(velkyPrvyChar).append(zvysokSlova);
            }
        }
        return novyNazov.toString();
    }
}
