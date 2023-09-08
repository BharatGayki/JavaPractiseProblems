package MachineCodePrograms;

public class PatternPrint {
    public static void main(String[] args) {
        // Create a 2D array
        char[][] pattern = new char[5][5];

        // Initialize all elements with space
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                pattern[i][j] = ' ';
            }
        }

        // Fill the appropriate positions with asterisks
        for (int i = 0; i < 5; i++) {
            pattern[i][i] = '*';
            pattern[i][4 - i] = '*';
        }

        // Print the final pattern
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//
//Algorithm:
//
//        Create a 2D array of size 5x5.
//        Initialize all elements of the array with space (" ") character.
//        Use for loops to fill the appropriate positions in the array with asterisks ("*").
//        Print the final pattern by iterating over the array.
//      * * * * *
//        * * *
//          *
//        * * *
//      * * * * *
