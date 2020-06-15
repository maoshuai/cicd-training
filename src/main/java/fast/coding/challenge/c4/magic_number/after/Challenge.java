package fast.coding.challenge.c4.magic_number.after;

public class Challenge {

    public static final int LEGAL_DRINKING_AGE = 21;
    public static final int MALE = 1;

    public boolean allowEnterTheBar(int age, int sex) {
        return age > LEGAL_DRINKING_AGE && sex == MALE;
    }
}
