public class uc4 {

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

                // Create Banner Array
                String[] banner = new String[7];

                // Populate Banner Using String.join()
                for (int i = 0; i < 7; i++) {
                        banner[i] = String.join(" ",
                                        O1[i],
                                        O2[i],
                                        P[i],
                                        S[i]);
                }

                // Print Using Enhanced For Loop
                for (String line : banner) {
                        System.out.println(line);
                }
        }
}