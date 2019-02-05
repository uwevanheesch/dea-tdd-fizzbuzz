package nl.han.oose;

import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz();
        IntStream.range(0, 100).forEach(turn -> {
            System.out.println(fizzBuzz.say(turn));
        });
        // the following line will cause an exception. Note that the stacktrace is printed in the terminal
        fizzBuzz.say(-1);

    }
}
