package assignment.personalityTest;

public enum PersonalityTrait {
    INTROVERT("I"),
    EXTROVERT("E"),
    FEELER("F"),
    THINKER("T"),
    JUDGING("J"),
    SENSITIVE("S"),
    INTUITION("N"),
    PERCEPTION("P");

    private final String code;

    PersonalityTrait(String code){
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
