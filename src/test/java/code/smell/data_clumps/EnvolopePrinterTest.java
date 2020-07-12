package code.smell.data_clumps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnvolopePrinterTest {

    @Test
    public void should_print_correct_envolope() {
        EnvolopePrinter printer = new EnvolopePrinter();
        String result = printer.printEnvolope(
                new Envelope("Xiaoming", "Li", "100007", "Beijing", "No.3 Dongzhimen South Street", "Room 1105, GuoHua Plaza", "18811111111"));

        assertEquals("Xiaoming, Li\n" +
                " (100007) Beijing\n" +
                "No.3 Dongzhimen South Street, Room 1105, GuoHua Plaza, 18811111111", result);
    }

}