public class UC3 {
    public static String[] OPattern() {
        String[] o = {
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        };
        return o;
    }
    
    public static String[] PPattern() {
        String[] p = {
                "******   ",
                "**    ** ",
                "**     **",
                "**    ** ",
                "******   ",
                "**       ",
                "**       ",
                "**       ",
                "**       "
        };
        return p;
    }

    public static String[] SPattern() {
        String[] s = {
                "   ***** ",
                " **      ",
                "**       ",
                " **      ",
                "   ***   ",
                "      ** ",
                "       **",
                "      ** ",
                " *****   "
        };

        return s;
    }
    public static void main(String[] args) {
        String[] o1 = OPattern();
        String[] o2 = OPattern();
        String[] p = PPattern();
        String[] s = SPattern();

        for (int i = 0; i < o1.length; i++) {
            System.out.println(String.join(" ", o1[i], o2[i], p[i], s[i]));
        }
    }
}
