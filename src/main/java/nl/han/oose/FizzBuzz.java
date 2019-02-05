package nl.han.oose;

public class FizzBuzz {

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


}
