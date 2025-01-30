
 public class Main{
    public static void main(String[] args) {
        Voice voice = new Voice();

        Animal[] animals = voice.prepareVoice();

        voice.hear(animals);
    }
}