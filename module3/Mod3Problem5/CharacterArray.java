package module3.Mod3Problem5;

public class CharacterArray {
    public static void main(String [] args) {
        String chArr = "6901 Sudley Road Manassas VA"; //String initialized

        // loop to check each char in string
        for (int i = 0; i < chArr.length(); i++) {
            char ch = chArr.charAt(i);

            System.out.print(ch);

            if (Character.isLowerCase(ch)) {
                // checks if char is lowerCase and prints it upperCase
                System.out.print(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                // checks if char is upperCase and prints it lowerCase
                System.out.print(Character.toLowerCase(ch));
            } else if (Character.isDigit(ch)) {
                // checks if char is a digit and prints and asterick (*)
                System.out.print('*');
            }

            System.out.println();
        }
    }
}
