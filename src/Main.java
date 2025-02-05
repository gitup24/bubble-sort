import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int[] table = generateTable();
        System.out.print("Table      : ");
        print(table);
        sort(table);
        System.out.print("\nTable sorted : ");
        print(table);
    }

    private static void sort(int[] table) {
        boolean isExchange = true;
        int i = 1;
        while (isExchange ) {
            isExchange = false;
            for (int j = 0; j < table.length - i; j++) {
                if (table[j] > table[j + 1]) {
                    int temp = table[j];
                    table[j] = table[j + 1];
                    table[j + 1] = temp;
                    isExchange = true;
                }
            }
            i++;
        }
    }

    private static int[] generateTable() {
        Random myRandomizer = new Random();
        int[] table = new int[myRandomizer.nextInt(3, 10)];
        for (int i = 0; i < table.length; i++)
            table[i] = myRandomizer.nextInt(1, 99);
        return table;
    }

    private static void print(int[] table) {
        for (int value : table) {
            System.out.printf("%3d", value);
        }
    }
}