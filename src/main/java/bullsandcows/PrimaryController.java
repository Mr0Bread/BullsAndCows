package bullsandcows;

import java.io.IOException;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;

public class PrimaryController {
    static Random random = new Random();

    public Spinner<Integer> num1;
    public Spinner<Integer> num2;
    public Spinner<Integer> num3;
    public Spinner<Integer> num4;
    public TableView<Guess> guessesTable;



    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    private int counter = 0;
    public void doTurn(ActionEvent actionEvent) {
        counter++;

        int n1Rand = random.nextInt(10);
        int n2Rand = random.nextInt(10);
        int n3Rand = random.nextInt(10);
        int n4Rand = random.nextInt(10);
        String randomGuessString = "" + n1Rand + n2Rand + n3Rand + n4Rand;



        int n1 = num1.getValue();
        int n2 = num2.getValue();
        int n3 = num3.getValue();
        int n4 = num4.getValue();
        String guessString = "" + n1 + n2 + n3 + n4;
        Guess.checkBulls(randomGuessString, guessString);

        Guess guess = new Guess();
        Guess.guessArrayList.add(guess);
        guess.setGuessDigits(guessString);
        guess.setGuessNum(counter);
        guessesTable.getItems().add(guess);
        guessesTable.sort();
        System.out.println(randomGuessString);
    }
}
