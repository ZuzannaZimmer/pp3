public class Day {
    static String str = "Have a nice day!";

    static public int numberOfCharakters(){
        return str.length();
    }
    static public String first9(){
        return str.substring(0,9);
    }
    static public String endDay(){
        return (str.endsWith("day!")) ? "yes" : "no";
    }
    static public boolean notEmpty(){
        return (!str.isEmpty());
    }
    static int lastIndexE(){
        return str.lastIndexOf("e");
    }
    static String space(){
        return str.replace(" ", "-");
    }
    static String upper(){
        return str.toUpperCase();
    }
}
