import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Greeting {
    public String greet(String... names) {

        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> upperCaseNames = new ArrayList<>();
        ArrayList<String> lowerCaseNames = new ArrayList<>();

        // Requirement 2
        if (names == null) {

            return "Hello, my friend";
        }
        // Requirement 3
        if (names.length < 2 && names[0].equals(names[0].toUpperCase())) {

            return "HELLO, " + names[0].toUpperCase() + "!";
        }

        // Checking Array for names with ONLY uppercase letters and 2 names are separated by a comma
        for (String name : names) {

            if (name.contains(",") && !name.equals(name.toUpperCase())) {

                String[] commaSplitNames = name.replace(" ", "").split(",");
                Collections.addAll(lowerCaseNames, commaSplitNames);
                break;
            }

            if (name.equals(name.toUpperCase())) {
                upperCaseNames.add(name);
            }

            else {
                lowerCaseNames.add(name);
            }
        }

        // Requirement 6
        if (!upperCaseNames.isEmpty()) {

            for (int i = 0; i < lowerCaseNames.size(); i++) {

                if (i == lowerCaseNames.size()-2) {

                    stringBuilder.append(lowerCaseNames.get(i) + ", and " + lowerCaseNames.get(i+1) + ".");
                    break;
                }
                else {
                    stringBuilder.append(lowerCaseNames.get(i) + ", ");
                }
            }
            for (int i = 0; i < upperCaseNames.size(); i++) {

                stringBuilder.append(" AND HELLO " + upperCaseNames.get(i) + "!");

            }

            return "Hello, " + stringBuilder;

        }

        // Requirment 4
        if (lowerCaseNames.size() == 2) {

            return "Hello, " + names[0] + " and " + names[1] + ".";
        }

        // Requirement 5 and Requirement 7
        if (lowerCaseNames.size() > 2) {

            for (int i = 0; i < lowerCaseNames.size(); i++) {

                if (i == lowerCaseNames.size()-2) {

                    stringBuilder.append(lowerCaseNames.get(i) + ", and " + lowerCaseNames.get(i+1) + ".");
                    break;

                }
                else {
                    stringBuilder.append(lowerCaseNames.get(i) + ", ");
                }
            }
            return "Hello, " + stringBuilder;
        }

        // Requirement 1
        return "Hello, " + names[0];


    }

}
