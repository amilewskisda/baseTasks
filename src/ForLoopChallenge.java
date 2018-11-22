public class ForLoopChallenge {
    public static void main(String[] args) {
        int[][] tab = new int[5][5];

/*        printDoubleTab(tab);
        System.out.println();

        tab = new int[5][5];
        tab = addOneRow(tab);
        printDoubleTab(tab);
        System.out.println();

        tab = new int[5][5];
        tab = addCrossRow(tab);
        printDoubleTab(tab);*/
    }

    private static int[][] addOneRow(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (i == 2) {
                    tab[i][j] = 1;
                }
            }
        }
        return tab;
    }

    private static int[][] addCrossRow(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (j == i) {
                    tab[i][j] = i;
                }
            }
        }
        return tab;
    }

    private static void printDoubleTab(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
