
class Animal {
    public void makeVoice() {
        System.out.println("This animal makes a sound.");
    }
}
class Cow extends Animal {
   
    public void makeVoice() {
        System.out.println("Moo!");
    }
}

class Dog extends Animal {
    
    public void makeVoice() {
        System.out.println("Woof!");
    }
}

class Pig extends Animal {
    
    public void makeVoice() {
        System.out.println("Oink!");
    }
}

class Goat extends Animal {
    
    public void makeVoice() {
        System.out.println("Baa!");
    }
}

class Lion extends Animal {
    
    public void makeVoice() {
        System.out.println("Roar!");
    }
}


class Voice {
    public Animal[] prepareVoice() {
        Animal[] animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();

        return animals;
    }

    public void hear(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
}