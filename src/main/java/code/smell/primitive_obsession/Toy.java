package code.smell.primitive_obsession;

public class Toy {
    private EToyType type;
    private int length;
    private ELengthUnit unit;

    public Toy(EToyType type, int length, ELengthUnit ELengthUnit) {
        this.type = type;
        this.length = length;
        this.unit = ELengthUnit;
    }


    public int length() {
        if (ELengthUnit.METRE == unit) {
            return length * 100;
        }

        return length;
    }
}
