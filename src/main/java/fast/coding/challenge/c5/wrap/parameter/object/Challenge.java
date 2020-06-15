package fast.coding.challenge.c5.wrap.parameter.object;

public class Challenge {
    //请将printEnvelope的所有参数包装成为一个Person对象
    public String printEnvolope(String firstName, String lastName, String areaCode, String city,
                                String street, String address, String phoneNo) {
        return String.format("%s, %s\n (%s) %s\n%s, %s, %s", firstName, lastName, areaCode, city, street, address, phoneNo);
    }

    public static void main(String[] args) {
        new Challenge().printEnvolope("Linb", "Wang", "028",
                "北京", "建国门", "118号", "15008225988");
    }


}
