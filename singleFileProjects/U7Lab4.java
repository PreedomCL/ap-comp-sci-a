import java.util.Scanner;

public class U7Lab4 {
    public static void main(String[] args) {
        System.out.println(checkSSN("463-44-5678"));
        System.out.println(checkSSN("46-144-5678"));
    }
    public static String checkSSN(String ssn) {
        String[] groups = ssn.split("-");

        if(groups.length != 3)
            return "bad";
        if(groups[0].length() != 3 || groups[1].length() != 2 || groups[2].length() != 4)
            return "bad";

        return groups[2];
    }
}
