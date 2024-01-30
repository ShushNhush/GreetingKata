public class Greeting {
    public String greet(String... names) {

        StringBuilder stringBuilder = new StringBuilder();

        if (names == null) {

            return "Hello, my friend";
        }

        if (names.length == 2) {

            return "Hello, " + names[0] + " and " + names[1] + ".";
        }

        if (names.length > 2) {

            for (int i = 0; i < names.length; i++) {

                if (i == names.length-2) {

                    stringBuilder.append(names[i] + ", and " + names[i+1] + ".");
                    break;

                }
                else {
                    stringBuilder.append(names[i] + ", ");
                }
            }
            return "Hello, " + stringBuilder;
        }

        if (names.length < 2 && names[0].equals(names[0].toUpperCase())) {

            return "HELLO, " + names[0].toUpperCase() + "!";
        } else {

        return "Hello, " + names[0];
        }

    }

}
