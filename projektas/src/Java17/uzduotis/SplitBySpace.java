package Java17.uzduotis;

import java.util.ArrayList;
import java.util.List;

public class SplitBySpace {
    public static void main(String[] args) {

        List<String> rezultatas = splitBySpace("Tekstas ilgas");
        System.out.println(rezultatas);

    }


    static List<String> splitBySpace(String text) {
        List<String> values = new ArrayList<>();
        String value = "";
        char[] symbols = text.toCharArray();

        for (int i = 0; i < symbols.length; i++) {

            if (symbols[i] == ' ') {
                values.add(value);
                value = "";

            } else {
                value += symbols[i];

            }

        }
        if (value.length() != 0) {
            values.add(value);
        }
        return values;
    }
}
