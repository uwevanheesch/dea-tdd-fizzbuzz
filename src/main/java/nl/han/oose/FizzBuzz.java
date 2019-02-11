package nl.han.oose;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FizzBuzz {

    ArrayList<Player> players = new ArrayList<>();

    private NameGenerator nameGenerator;

    public FizzBuzz() {
        this.nameGenerator = new NameGeneratorImpl();
    }

    public FizzBuzz(NameGenerator nameGenerator) {
        this.nameGenerator = nameGenerator;
    }

    public void addRandomPlayer() {
        players.add(new Player(nameGenerator.generateRandomName()));
    }


    public String say(int turn) throws InvalidTurnException {
        if (turn < 0) {
            throw new InvalidTurnException("Invalid turn", turn);
        }
        if (turn == 0) {
            return String.valueOf(0);
        } else if (isMultipleOfFifteen(turn)) {
            return "FizzBuzz";
        } else if (isMultipleOfThree(turn)) {
            return "Fizz";
        } else if (turn % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(turn);
        }
    }

    private boolean isMultipleOfFifteen(int turn) {
        return turn % 15 == 0;
    }

    private boolean isMultipleOfThree(int turn) {
        return turn % 3 == 0;
    }

    public List<Player> getPlayers() {
        return Collections.unmodifiableList(players);
    }
}
