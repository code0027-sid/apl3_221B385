abstract class VoiceTemplate {
    
    public final void templateMethod() {
        prepareVoice();
        hear();
    }

    abstract void prepareVoice();
    abstract void hear();
}

class Voice2 extends VoiceTemplate {
    private Animal[] animals;

    @Override
    void prepareVoice() {
        animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    @Override
    void hear() {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
}

abstract class Animal {
    abstract void makeVoice();
}

class Cow extends Animal {
    void makeVoice() {
        System.out.println("Moo");
    }
}

class Dog extends Animal {
    void makeVoice() {
        System.out.println("Woof");
    }
}

class Pig extends Animal {
    void makeVoice() {
        System.out.println("Oink");
    }
}

class Goat extends Animal {
    void makeVoice() {
        System.out.println("Baa");
    }
}

class Lion extends Animal {
    void makeVoice() {
        System.out.println("Roar");
    }
}

public class Test {
    public static void main(String[] args) {
        Voice2 voiceSystem = new Voice2();
        voiceSystem.templateMethod(); // Calls prepareVoice() first, then hear()
    }
}
