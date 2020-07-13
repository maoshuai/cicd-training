package code.smell.switch_statement;

public class FullStackEngineer implements Engineer{
    @Override
    public double getCompetenceValue(double unit) {
        double craftSkill = unit * 0.9;
        double softSkill = craftSkill * 0.2;
        return craftSkill + softSkill;
    }
}
