package bullsandcows;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;

public class Guess {
    public static ArrayList<Guess> guessArrayList = new ArrayList<>();
    private SimpleIntegerProperty guessNum = new SimpleIntegerProperty(this, "guessNum");
    private SimpleStringProperty guessDigits = new SimpleStringProperty(this, "guessDigits");
    private SimpleIntegerProperty cowsNum = new SimpleIntegerProperty(this, "cowsNum");
    private SimpleIntegerProperty bullsNum = new SimpleIntegerProperty(this, "bullsNum");

    public int getGuessNum() {
        return guessNum.get();
    }

    public SimpleIntegerProperty guessNumProperty() {
        return guessNum;
    }

    public void setGuessNum(int guessNum) {
        this.guessNum.set(guessNum);
    }

    public String getGuessDigits() {
        return guessDigits.get();
    }

    public SimpleStringProperty guessDigitsProperty() {
        return guessDigits;
    }

    public void setGuessDigits(String guessDigits) {
        this.guessDigits.set(guessDigits);
    }

    public int getCowsNum() {
        return cowsNum.get();
    }

    public SimpleIntegerProperty cowsNumProperty() {
        return cowsNum;
    }

    public void setCowsNum(int cowsNum) {
        this.cowsNum.set(cowsNum);
    }

    public int getBullsNum() {
        return bullsNum.get();
    }

    public SimpleIntegerProperty bullsNumProperty() {
        return bullsNum;
    }

    public void setBullsNum(int bullsNum) {
        this.bullsNum.set(bullsNum);
    }

    static int checkBulls(String randomGuess, String guess) {
        int cowsNum = 0;

        return cowsNum;
    }
}

