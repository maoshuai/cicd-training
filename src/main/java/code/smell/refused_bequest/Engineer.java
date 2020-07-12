package code.smell.refused_bequest;

public class Engineer extends Employee {
    @Override
    public boolean hasSalesQuota(int quota) {
        return false;
    }
}
