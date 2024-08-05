public class Lec15_Ch3_PS {
    public static void main(String[] args) {
         // Question 1: Write a Java program to convert a string to lowercase.
        String name = "Nitin";
        name = name.toLowerCase();
        System.out.println("The string in lowercase is: " + name);

        // Question 2: Write a Java program to replace spaces with underscores.
        String text = "To My Friend";
        text = text.replace(" ", "_");
        System.out.println("Spaces is replace with underscores: " + text);

        /*
        Question 3: Write a Java program to fill in a letter template which looks like below:
                    letter = “Dear <|name|>, Thanks a lot”
                    Replace <|name|> with a string (some name)
         */
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Krishna");
        System.out.println("Replaced string in the sentence letter is: " + letter);

        // Question 4: Write a Java program to detect double and triple spaces in a string.
        String myString = "The course on youtube channel  named   CodeWithHarry is really awesome!";
        System.out.println("Double spaces is detected at index: " + myString.indexOf("  "));
        System.out.println("Triple spaces is detected at index: " + myString.indexOf("   "));

        /*
           Question 5: Write a program to format the following letter using escape sequence characters.
                       Letter = “Dear Nitin, This Java Course is nice. Thanks”
         */
        String myLetter = "Dear Nitin,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);


    }
}
