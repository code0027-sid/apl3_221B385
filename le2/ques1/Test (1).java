abstract class Animal {
    abstract void makeVoice();
}

class Cow extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Cow says: Moo Moo!");
    }
}

class Dog extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Dog says: Woof Woof!");
    }
}

class Pig extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Pig says: Oink Oink!");
    }
}

class Goat extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Goat says: Baa Baa!");
    }
}

class Lion extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Lion says: ROARRR!");
    }
}

class Voice {
    private Animal[] animals = new Animal[5];

    void prepareVoice() {
        System.out.println("Setting up the Voice Machine...");
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
        System.out.println("Voice Machine is ready!\n");
    }

    void hear() {
        System.out.println("Playing animal sounds...\n");
        for (Animal animal : animals) {
            animal.makeVoice();
        }
        System.out.println("\nAll animals have spoken!");
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println("Welcome to the Virtual Zoo!\n");

        Voice voiceSystem = new Voice();
        voiceSystem.prepareVoice();
        voiceSystem.hear();

        System.out.println("\nThanks for visiting the Virtual Zoo!");
    }
}
