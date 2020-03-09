package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    private Pattern pattern;

    private static final String EMAIL_PATTERN =
            "^([_A-Za-z0-9-.]+)@([a-zA-Z0-9_-]+)\\.([a-zA-Z]{2,})$";

    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    public boolean validate(String str) {
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public void parseAndPrint(String str) {
        Matcher matcher = pattern.matcher(str);
        // For every match in str
        while(matcher.find()) {
            System.out.println("Match start index: " + matcher.start());
            System.out.println("Match end index: " + matcher.end());
            System.out.println("Match: " + matcher.group(0)); // Entire matched string
            System.out.println("Username: " + matcher.group(1)); // First group -- the username
            System.out.println("Domain name: " + matcher.group(2)); // Second group -- the domain name (e.g. gmail)
            System.out.println("Top level domain: " + matcher.group(3)); // Third group -- the top level domain (e.g. com)
        }
    }
}
