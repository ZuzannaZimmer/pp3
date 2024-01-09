import java.util.ArrayList;

public class C7 {
    private String[] c;
    ArrayList<String> city = new ArrayList<>();
    int x = 0;

    public C7(String[] c) {
        this.c = c;
    }

    public C7(String[] c, ArrayList<String> city) {
        this.c = c;
        this.city = city;
    }

    public C7 filter(char a) {

        for (String e : c) {
            char b = e.charAt(0);
            if (a == b) {
                city.add(e);
            }

        }

        return this;
    }

    public String cities() {
        String s = "";
        for (String el : city) {
            s = s + el;
        }
        return s;
    }

}
