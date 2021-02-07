package lesson4;

public class Homework4 {
<<<<<<< HEAD
    public static void main(String[] args) {
        int[][] values = returnMultidimensionalArray();
        drawArray(values);
    }

    public static void drawArray(int[][] values) {
        System.out.println("SIZE: " + values.length);
        System.out.println("CONTAINER SIZE: " + values[0].length);

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int[][] returnMultidimensionalArray() {
        return new int[][]
                {
                        {1, 2, 3}, // 0 index
                        {4, 5, 6}, // 1 index
                        {7, 8, 9}  // 2 index
                };
    }

    public static void drawArray(int[] values) {
        System.out.println("SIZE: " + values.length);
        for (int i = 0; i < values.length; i++) {
            System.out.println("[" + i + "] => " + values[i]);
        }
    }

    public static int[] returnMultipleValues() {
//        int[] values = new int[5];
//        values[0] = 123;
//        values[1] = -1;
//        values[2] = 80;
//        values[3] = 1241942;
//        values[4] = -1278461;
        int[] values = {123, -1, 80, 1241942, -1278461};

        return values;
    }

    /**
     * [0, N]
     */
    public static void doForLoopDemo() {
        int fin = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("[" + i + "]");
            fin += 10;
        }

        System.out.println("FIN: " + fin);
    }

    /**
     * [1, N]
     */
    public static void doDoWhileLoopDemo() {
        int fin = 0;
        int i = 0;

        do {
            System.out.println("[" + i + "]");
            fin += 10;
            i++;
        } while (i < 10);

        System.out.println("FIN: " + fin);
    }

    /**
     * [0, N]
     */
    public static void doWhileLoopDemo() {
        int fin = 0;
        int i = 0;
        while (i < 10) {
            System.out.println("[" + i + "]");
            fin += 10;
            i++;
        }
        System.out.println("FIN: " + fin);
    }

    public static String optSeason(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2: {
                return "Winter";
            }
            case 3:
            case 4:
            case 5: {
                return "Spring";
            }
//            default: {
//                return "Bogus season";
//            }
        }

        return "Bogus season";
    }
=======
>>>>>>> Lesson4
}

