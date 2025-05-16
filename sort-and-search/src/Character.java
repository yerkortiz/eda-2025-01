import java.lang.Math;
import java.util.Arrays;

class Character implements Comparable<Character> {

    String name;
    int strength;
    int agility;
    int intelligence;
    int stamina;
    int mana;

    static Character randomCharacter() {
        Character character = new Character();
        character.name = "John Doe";
        character.strength = (int) (Math.random() * 100);
        character.agility = (int) (Math.random() * 100);
        character.intelligence = (int) (Math.random() * 100);
        character.stamina = (int) (Math.random() * 100);
        character.mana = (int) (Math.random() * 100);
        return character;
    }

    static Character[] randomCharacters(int n) {
        Character[] characters = new Character[n];
        for (int i = 0; i < n; i++) {
            characters[i] = randomCharacter();
        }
        return characters;
    }

    static void printCharacters(Character[] characters) {
        for (Character character : characters) {
            System.out.println(
                character.name +
                " " +
                character.strength +
                " " +
                character.agility +
                " " +
                character.intelligence +
                " " +
                character.stamina +
                " " +
                character.mana
            );
        }
    }

    @Override
    public int compareTo(Character other) {
        return Integer.compare(this.stamina, other.stamina);
    }

    public static void main(String[] args) {
        Character[] characters = randomCharacters(3);

        // sort characters by strength
        Arrays.sort(characters);

        // sort characters by name
        Arrays.sort(characters, (a, b) -> a.strength - b.strength);
        printCharacters(characters);
    }
}
