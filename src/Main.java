public class Main {
    public static void main(String[] args) {
        hooman Human1 = new hooman();
        hooman Human2 = new hooman();
        System.out.println(Human1.toString());
        System.out.println(Human2.toString());
        Human1.setRelationship(Human2, "friends");
        System.out.println(Human1.relationshipToString());

    }
}