package Meningar;

public class Mening {
    private int antalMeningar = 0;
    private int antalTecken = 0;

    public void addMening(String mening) {
        antalMeningar++;
        antalTecken += mening.length();
    }

    public int getAntalMeningar() {
        return antalMeningar;
    }

    public int getAntalTecken() {
        return antalTecken;
    }
}
