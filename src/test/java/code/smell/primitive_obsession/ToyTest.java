package code.smell.primitive_obsession;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ToyTest {
    @Test
    public void should_compare_length() {
        Toy toy1 = new Toy(EToyType.CAR, 60, ELengthUnit.CENTIMETRE);
        Toy toy2 = new Toy(EToyType.TRAIN, 1, ELengthUnit.METRE);

        assertThat(toy2.length()).isGreaterThan(toy1.length());
    }
}