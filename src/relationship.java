public class relationship {
    private hooman Human1;
    private hooman Human2;
    private String relationshipType;

    public relationship(hooman Human1, hooman Human2, String relationshipType) {
        this.Human1 = Human1;
        this.Human2 = Human2;
        this.relationshipType = relationshipType;
    }

    public hooman getHuman1() {
        return Human1;
    }

    public hooman getHuman2() {
        return Human2;
    }

    public String getRelationshipType() {
        return relationshipType;
    }

    public String toString() {
        return Human1.getName() + " is " + relationshipType + " to " + Human2.getName();
    }
}
