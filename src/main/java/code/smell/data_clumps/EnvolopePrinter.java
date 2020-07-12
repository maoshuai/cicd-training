package code.smell.data_clumps;

public class EnvolopePrinter {
    public String printEnvolope(Envelope envelope) {
        return String.format("%s, %s\n (%s) %s\n%s, %s, %s", envelope.getFirstName(), envelope.getLastName(), envelope.getAreaCode(), envelope.getCity(), envelope.getStreet(), envelope.getAddress(), envelope.getPhoneNo());
    }
}
