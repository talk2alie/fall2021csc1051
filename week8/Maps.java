import java.util.Hashtable;

public class Maps {
    public static void main(String[] args) {
        System.out.println();

        Hashtable<String,Boolean> squares = new Hashtable<>();
        fill(squares);
        print(squares);

        System.out.println();
    }

    private static void fill(Hashtable<String, Boolean> squares) {
        String[] columnHeaders = {"A", "B", "C", "D", "E"};
        int[] rowHeaders = {1, 2, 3, 4};

        for(int column = 0; column < columnHeaders.length; column++) {
            for(int row = 0; row < rowHeaders.length; row++) {
                String key = columnHeaders[column] + rowHeaders[row];
                squares.put(key, false);
            }
        }
    }

    private static void print(Hashtable<String, Boolean> squares) {
        String[] columnHeaders = {"A", "B", "C", "D", "E"};
        int[] rowHeaders = {1, 2, 3, 4};

        for(int column = 0; column < columnHeaders.length; column++) {
            for(int row = 0; row < rowHeaders.length; row++) {
                String key = columnHeaders[column] + rowHeaders[row];
                System.out.printf("%s\t%s\t", key, squares.get(key));
                System.out.println();
            }
        }
    }
}
