public class Lec14_stringMethods {
    public static void main(String[] args) {
        String name = "Nitin";
        System.out.println("name is: " + name);
        int value = name.length();
        System.out.println("The length of the string name is: " + value);

        String lstring = name.toLowerCase();
        System.out.println("Lowercase lstring is: " + lstring);

        String ustring = name.toUpperCase();
        System.out.println("Uppercase string ustring is: " + ustring);

        String nonTrimmedString = "     Nitin     ";
        System.out.println("Having space around the string: " + nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println("Removing the around the string: " + trimmedString);

        System.out.println("Substring having beginning index: " + name.substring(1));
        System.out.println("Starting from index 1 goes till index 5: " + name.substring(1,5));

        System.out.println("Example 1 replacing the oldChar with newChar: " + name.replace('r', 'p'));
        System.out.println("Example 2 replacing the target value with another new value: " + name.replace("r", "ier"));

        System.out.println("Checking string is starting with Nit or not: " + name.startsWith("Nit"));
        System.out.println("Checking string is ending with in or not: " + name.endsWith("in"));

        System.out.println("Verifying the index of char in a string: " + name.charAt(4));

        String modifiedName = "Nitinsokhal";
        System.out.println("Checking the index of tin in the modifiedName string: " +modifiedName.indexOf("tin"));
        System.out.println("Starting from a particular index from beginning: " + modifiedName.indexOf("tin", 4));
        System.out.println("Starting from a particular index from last: " + modifiedName.lastIndexOf("tin", 7));

        System.out.println("Evaluating one string to another string: " + name.equals("Nitin"));
        System.out.println("EqualsIgnoreCase: " + name.equalsIgnoreCase("NiTin"));

        System.out.println("I am escape sequence\tdouble quote");


    }
}
