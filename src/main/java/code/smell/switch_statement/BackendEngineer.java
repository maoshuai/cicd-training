package code.smell.switch_statement;

public class BackendEngineer implements  Engineer{
    @Override
    public double getCompetenceValue(double unit) {
        double craftSkill = unit * 0.8;
        double softSkill = craftSkill * 0.1;
        return craftSkill + softSkill;
    }
}
