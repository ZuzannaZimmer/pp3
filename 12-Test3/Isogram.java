public class Isogram {

    public static boolean isogram(String s) {

        for (int i = 0; i < s.length(); i++) {
            char znak = s.charAt(i);

            if (Character.isLetter(znak)) {
                for (int j = i + 1; j < s.length(); j++) {
                    char nznak = s.charAt(j);

                    if (znak == nznak) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
