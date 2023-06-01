package Main;

public class Main {
    public static void main(String[] args) {
        int newScore =  calculateScore("Diego", 40);
        System.out.println(newScore);
        int newScore2 = calculateScore( 30);
        System.out.println(newScore2);
        calculateScore();
    }
    public static int calculateScore( String playerName, int score){
        System.out.println("player name:"  + playerName + "score : " + score );
        return score * 1000;
    }
    public static int calculateScore (int score){
        System.out.println("score:" + score);
    return score * 200;

    }   public static int calculateScore (){
        System.out.println("no player data");
        return 0;
    }



}
