package fast.coding.challenge.c5.wrap.parameter.object.after;

public class Challenge {
    public String printEnvolope(Person person) {
            return String.format("%s, %s\n (%s) %s\n%s, %s, %s", person.getFirstName(), person.getLastName(),
                    person.getAreaCode(), person.getCity(), person.getStreet(), person.getAddress(),
                    person.getPhoneNo());
    }

    public static void main(String[] args) {
        new Challenge().printEnvolope(
                new Person("Linb", "Wang", "028", "北京", "建国门", "118号", "15008225988"));
    }


}
