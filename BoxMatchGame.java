public class BoxMatchGame {
    public static void main(String[] args) {
        FighterBoxMatchGame fighter1 = new FighterBoxMatchGame("Ahmet", 15, 130,103, 30,0);
        FighterBoxMatchGame fighter2 = new FighterBoxMatchGame("Osman", 16, 160,105, 45,100);

        MatchCalculatorBoxMatchGame match = new MatchCalculatorBoxMatchGame(fighter1 , fighter2,110, 90);
        match.matchRun();


    }
}
