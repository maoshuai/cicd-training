package code.smell.magic_number;

public class Bar {

    public static final int AGE_FOR_DRINK = 21;
    public static final int STATUS_EXEMPT = 1;

    public boolean doSomething(int age, int status) {
        //Question: what does 21 and 1 means?
        return age > AGE_FOR_DRINK && status == STATUS_EXEMPT;
    }
}
