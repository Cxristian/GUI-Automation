package pivotal.entities;

public class ReaderIdInURL {

    public int getIdNumber(String value) {
        char [] value_div = value.toCharArray();
        String valueId = "";
        for (int i = 0; i < value_div.length; i++) {
            if (Character.isDigit(value_div[i])) {
                valueId += value_div[i];
            }
        }
        return Integer.parseInt(valueId);

    }

    public static ReaderIdInURL getInstance() {
        return new ReaderIdInURL();
    }
}
