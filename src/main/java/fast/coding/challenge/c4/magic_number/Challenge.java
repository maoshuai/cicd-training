package fast.coding.challenge.c4.magic_number;

public class Challenge {
    //请将:
    // 魔法数字21抽取成常量：LEGAL_DRINKING_AGE
    // 魔法数字1抽取成常量：MALE
    public boolean allowEnterTheBar(int age, int sex) {
        if (age > 21 && sex == 1) {
            return true;
        } else {
            return false;
        }
    }
}
