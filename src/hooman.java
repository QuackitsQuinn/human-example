
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class hooman {
    private final String[] hairLengths = {"short", "medium", "long"};
    private final String[] hairColors = {"black", "brown", "blonde", "red", "grey", "white"};
    private final String[] eyeColors = {"brown", "blue", "green", "hazel", "grey", "amber", "violet"};
    private final String[] genders = {"Male", "Female","Male", "Female","Male", "Female","Male", "Female", "Everything in between", "Everything", "yes","no","your mom","the universe itself", "endless void","the", "null"};

    private final String[] androgynousNames = {" Addison", "Aiden", "Aspen", "Alex", "Ali", "Ari", "Andie", "Ash", "Ashton", "Billie", "Blake", "Cameron", "Casey", "Charlie", "Dylan", "Drew", "Emerson", "Elliot", "Ellis", "Evan", "Frankie", "Gabriel", "Hayden", "Harper", "Hunter", "Jesse", "Jordan", "Jay", "Jaydon", "Jaime", "Jo", "Jude", "Kyle", "Keegan", "Kieran", "Morgan", "Nat", "Nell", "Parker", "Ray", "Reese", "Remy", "Riley", "Rory", "Robyn", "Rowan", "Sam", "Spencer", "Sasha", "Sidney", "Taylor", "Toni", "Tyler", "Max", "Marley", "Amari", "Amory", "Brooklyn", "Campbell", "Clay", "Easton", "Eden", "Ember", "Grayson", "Grey", "Harlow", "Indigo", "Jace", "Kai", "Kit", "Lane", "Lennon", "Marin", "Micah", "Monroe", "Ocean", "Paris", "Peyton", "Phoenix", "Quinn", "Rain", "Reed", "Rue", "Sage", "Sawyer", "Shae", "Sloane", "Stevie", "Storm", "Sutton", "Scout", "Shiloh", "Valentine", "Wren", "Xavi", "Yale", "Yardley", "Zane", "Zasha", "Zene"};

    private final String[] masculineNames = {" Liam", " Noah", " Oliver", " Elijah", " William", " James", " Benjamin", " Lucas", " Henry", " Alexander", " Mason", " Michael", " Ethan", " Daniel", " Jacob", " Logan", " Jackson", " Levi", " Sebastian", " Mateo", " Jack", " Owen", " Theodore", " Aiden", " Samuel", " Joseph", " John", " David", " Wyatt", " Matthew", " Luke", " Asher", " Carter", " Julian", " Grayson", " Leo", " Jayden", " Gabriel", " Isaac", " Lincoln", " Anthony", " Hudson", " Dylan", " Ezra", " Thomas", " Charles", " Christopher", " Jaxon", " Maverick", " Josiah", " Isaiah", " Andrew", " Elias", " Joshua", " Nathan", " Caleb", " Ryan", " Adrian", " Miles", " Eli", " Nolan", " Christian", " Aaron", " Cameron", " Ezekiel", " Colton", " Luca", " Landon", " Hunter", " Jonathan", " Santiago", " Axel", " Easton", " Cooper", " Jeremiah", " Angel", " Roman", " Connor", " Jameson", " Robert", " Greyson", " Jordan", " Ian", " Carson", " Jaxson", " Leonardo", " Nicholas", " Dominic", " Austin", " Everett", " Brooks", " Xavier", " Kai", " Jose", " Parker", " Adam", " Jace", " Wesley", " Kayden", " Silas"};

    private final String[] feminineNames = {"Olivia", "Emma", "Charlotte", "Amelia", "Ava", "Sophia", "Isabella", "Mia", "Evelyn", "Harper", "Luna", "Camila", "Gianna", "Elizabeth", "Eleanor", "Ella", "Abigail", "Sofia", "Avery", "Scarlett", "Emily", "Aria", "Penelope", "Chloe", "Layla", "Mila", "Nora", "Hazel", "Madison", "Ellie", "Lily", "Nova", "Isla", "Grace", "Violet", "Aurora", "Riley", "Zoey", "Willow", "Emilia", "Stella", "Zoe", "Victoria", "Hannah", "Addison", "Leah", "Lucy", "Eliana", "Ivy", "Everly", "Lillian", "Paisley", "Elena", "Naomi", "Maya", "Natalie", "Kinsley", "Delilah", "Claire", "Audrey", "Aaliyah", "Ruby", "Brooklyn", "Alice", "Aubrey", "Autumn", "Leilani", "Savannah", "Valentina", "Kennedy", "Madelyn", "Josephine", "Bella", "Skylar", "Genesis", "Sophie", "Hailey", "Sadie", "Natalia", "Quinn", "Caroline", "Allison", "Gabriella", "Anna", "Serenity", "Nevaeh", "Cora", "Ariana", "Emery", "Lydia", "Jade", "Sarah", "Eva", "Adeline", "Madeline", "Piper", "Rylee", "Athena", "Peyton", "Everleigh", "Vivian", "Clara", "Raelynn", "Liliana", "Samantha", "Maria", "Iris", "Ayla", "Eloise", "Lyla", "Eliza", "Hadley", "Melody", "Julia", "Parker", "Rose", "Isabelle", "Brielle", "Adalynn", "Arya", "Eden", "Remi", "Mackenzie", "Maeve", "Margaret", "Reagan", "Charlie", "Alaia", "Melanie", "Josie", "Elliana", "Cecilia", "Mary", "Daisy", "Alina", "Lucia", "Ximena", "Juniper", "Kaylee", "Magnolia", "Summer", "Adalyn", "Sloane", "Amara", "Arianna", "Isabel", "Reese", "Emersyn", "Sienna", "Kehlani", "River", "Freya", "Valerie", "Blakely", "Genevieve", "Esther", "Valeria", "Katherine", "Kylie", "Norah", "Amaya", "Bailey", "Ember", "Ryleigh", "Georgia", "Catalina", "Emerson", "Alexandra", "Faith", "Jasmine", "Ariella", "Ashley", "Andrea", "Millie", "June", "Khloe", "Callie", "Juliette", "Sage", "Ada", "Anastasia", "Olive", "Alani", "Brianna", "Rosalie", "Molly", "Brynlee", "Amy", "Ruth", "Aubree", "Gemma", "Taylor", "Oakley", "Margot", "Arabella", "Sara", "Journee", "Harmony", "Blake", "Alaina", "Aspen", "Noelle", "Selena", "Oaklynn", "Morgan", "Londyn", "Zuri", "Aliyah", "Jordyn", "Juliana", "Finley", "Presley", "Zara", "Leila", "Marley", "Sawyer", "Amira", "Lilly", "London", "Kimberly", "Elsie", "Ariel", "Lila", "Alana", "Diana", "Kamila", "Nyla", "Vera", "Hope", "Annie", "Kaia", "Myla", "Alyssa", "Angela", "Ana", "Lennon", "Evangeline", "Harlow", "Rachel", "Gracie", "Rowan", "Laila", "Elise", "Sutton", "Lilah", "Adelyn", "Phoebe", "Octavia", "Sydney", "Mariana", "Wren", "Lainey", "Vanessa", "Teagan", "Kayla", "Malia", "Elaina", "Saylor", "Brooke", "Lola", "Miriam", "Alayna", "Adelaide", "Daniela", "Jane", "Payton", "Journey", "Lilith", "Delaney", "Dakota", "Mya", "Charlee"};
    public String name;
    public int age;
    public String hairLen;
    public String hairCol;
    public String eyeCol;
    public String gender;

    public List<relationship> relationships = new ArrayList<relationship>();

    private Random random = new Random();

    public hooman() {
        hairLen = randomChoice(hairLengths);
        hairCol = randomChoice(hairColors);
        eyeCol = randomChoice(eyeColors);
        gender = randomChoice(genders);
        if (gender.equals("Male")){
            name = randomChoice(masculineNames);
        } else if (gender.equals("Female")) {
            name = randomChoice(feminineNames);
        } else {
            name = randomChoice(androgynousNames);
        }
        age = random.nextInt(13,60);
    }

    public hooman(String gender) {
        hairLen = randomChoice(hairLengths);
        hairCol = randomChoice(hairColors);
        eyeCol = randomChoice(eyeColors);
        if (gender.equals("Male")){
            name = randomChoice(masculineNames);
        } else if (gender.equals("Female")) {
            name = randomChoice(feminineNames);
        } else {
            name = randomChoice(androgynousNames);
        }
        age = random.nextInt(13,60);
    }

    @Override
    public String toString() {
        return "hooman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hairLen='" + hairLen + '\'' +
                ", hairCol='" + hairCol + '\'' +
                ", eyeCol='" + eyeCol + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static String randomChoice(String @NotNull [] array) {
        Random rand = new Random();
        int index = rand.nextInt(array.length);
        return array[index];

    }

    public void setRelationship(hooman person, String relationship){
        relationships.add(new relationship(person, this, relationship));
    }

    public String getName() {
        return name;
    }

    public String relationshipToString(){
        String output = "";
        for (relationship relationship : relationships) {
            output += relationship.toString() + " ";

}
        return output;
    }

    public void setAge(int age) {
        this.age = age;
    }
}