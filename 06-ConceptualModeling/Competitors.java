import java.util.*;


public class Competitors {

    static int score;
    static int suma = 0;

    
    public static String randomscore(){
        ArrayList<Integer> score = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < 5 ; i++){
            int scoree = random.nextInt(5) + 1;
            score.add(scoree);
        }
        Collections.sort(score);
        score.remove(0);
        score.remove(score.size() - 1);

        for (int liczba : score){
            suma +=  liczba;
        }
        double sumaa = suma;
        

        return String.format("lista ocen: %d, %d, %d, średnia ocen %.2f", score.get(0),score.get(1), score.get(2), (sumaa/3));
    }
}
