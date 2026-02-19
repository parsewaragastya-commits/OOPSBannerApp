public class UC3 {

    public static void main(String[] args) {

        String[] O1 = {
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };

        String[] O2 = {
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };

        String[] P = {
                " ******* ",
                " *     * ",
                " *     * ",
                " ******* ",
                " *       ",
                " *       ",
                " *       "
        };

        String[] S = {
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        };

        for (int i = 0; i < 7; i++) {

            String line = String.join(" ",
                    O1[i],
                    O2[i],
                    P[i],
                    S[i]);

            System.out.println(line);
        }
    }
}
