package nl.han.oose;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest {

    private FizzBuzz sut; // system under test


    @BeforeEach
    public void setUp() {
        sut = new FizzBuzz();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    public void returnsFizzIfNumberIsMultipleOfThree() {
        assertEquals("Fizz", sut.say(3));
        assertEquals("Fizz", sut.say(6));
        assertEquals("Fizz", sut.say(9));
    }


    @Test
    void addsRandomNameToPlayersList() {
        // arrange
        NameGenerator nameGeneratorFake = new NameGenerator() {
            @Override
            public String generateRandomName() {
                return "Uwe";
            }
        };

        FizzBuzz sut = new FizzBuzz(nameGeneratorFake);

        // act
        sut.addRandomPlayer();

        // assert
        Player expectedPlayer = new Player("Uwe");
        assertEquals(expectedPlayer, sut.players.get(0));
    }



    @Test
    public void returnsBuzzIfNumberIsMultipleOfFive() {
        assertEquals("Buzz", sut.say(5));
        assertEquals("Buzz", sut.say(10));
    }

    @Test
    public void returnsFizzBuzzIfNumberIsMultipleOfFiveAndThree() {
        assertEquals("FizzBuzz", sut.say(15));
        assertEquals("FizzBuzz", sut.say(30));
        assertEquals("FizzBuzz", sut.say(45));
    }

    @Test
    public void returnNumberIfNumberIsNotMultipleOfThreeOrFive() {
        assertEquals("1", sut.say(1));
        assertEquals("2", sut.say(2));
        assertEquals("4", sut.say(4));
        assertEquals("7", sut.say(7));
    }

    @Test
    public void returnZeroIfNumberIsZero() {
        assertEquals("0", sut.say(0));
    }

    @Test
    void throwsExceptionIfTurnIsNegative() {
        InvalidTurnException invalidTurnException =
                assertThrows(InvalidTurnException.class, () -> sut.say(-1));

        assertEquals(-1, invalidTurnException.getTurn());
    }
}