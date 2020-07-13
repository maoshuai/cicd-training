package code.smell.switch_statement;

public class FrontendEngineer implements Engineer{
    @Override
    public double getCompetenceValue(double unit) {
        double craftSkill = unit * 0.7;
        double softSkill = craftSkill * 0.1;
        return craftSkill + softSkill;
    }
}
