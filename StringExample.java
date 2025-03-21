
public class StringExample {
    public static void main(String[] args) {
        // Creating a string
        String str = "Hello, World!";

        // 1. Length of the string
        System.out.println("Length: " + str.length());

        // 2. Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 3. Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // 4. Extract a substring
        System.out.println("Substring (7 to end): " + str.substring(7));

        // 5. Check if the string contains a word
        System.out.println("Contains 'World': " + str.contains("World"));

        // 6. Replace a word
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        // 7. Check if the string starts or ends with a particular word
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Ends with '!': " + str.endsWith("!"));

        // 8. Split string into an array
        String[] words = str.split(" ");
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }

        // 9. Trim leading and trailing spaces
        String spacedString = "   Java Programming   ";
        System.out.println("Trimmed: '" + spacedString.trim() + "'");

        // 10. Convert String to char array
        char[] charArray = str.toCharArray();
        System.out.println("Characters in the string:");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
    }
}
