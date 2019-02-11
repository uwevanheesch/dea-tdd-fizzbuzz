package nl.han.oose;

public class NameGeneratorImpl implements NameGenerator {
    @Override
    public String generateRandomName() {
        return new org.ajbrown.namemachine.NameGenerator().generateName().toString();
    }
}
