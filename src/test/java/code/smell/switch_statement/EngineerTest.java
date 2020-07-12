package code.smell.switch_statement;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class EngineerTest {
    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("Backend", 1.2, 1.056),
                Arguments.of("Backend", 2.2, 1.936),
                Arguments.of("Frontend", 3.2, 2.464),
                Arguments.of("FullStack", 8, 8.64));
    }

    @ParameterizedTest
    @MethodSource(value = "parameters")
    public void should_calc_competence_value(String type, double unit, double result) {
        Engineer engineer = new Engineer(type);

        assertThat(engineer.getCompetenceValue(unit)).isCloseTo(result, offset(0.1));
    }
}
