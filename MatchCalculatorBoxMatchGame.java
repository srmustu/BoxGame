public class MatchCalculatorBoxMatchGame {
    FighterBoxMatchGame fighter1;
    FighterBoxMatchGame fighter2;
    int minWeight;
    int maxWeight;

    MatchCalculatorBoxMatchGame(FighterBoxMatchGame fighter1, FighterBoxMatchGame fighter2, int maxWeight, int minWeight) {
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    void matchRun() {
        if (isApproval()) {
            System.out.println("The match starts.");
            while (fighter1.health > 0 && fighter2.health > 0) {

                if (fighter1.firstDamage()){
                    fighter2.health = fighter1.damage(fighter2);
                    System.out.println(fighter2.name + " health : " + fighter2.health);
                } else if (fighter2.firstDamage()){
                    fighter1.health = fighter2.damage(fighter1);
                    System.out.println(fighter1.name +" health : " + fighter1.health);
                }


                fighter2.health = fighter1.damage(fighter2);
                System.out.println(fighter2.name + " health : " + fighter2.health);
                if (winner()){
                    break;
                }

                fighter1.health = fighter2.damage(fighter1);
                System.out.println(fighter1.name +" health : " + fighter1.health);

                if (winner()){
                    break;
                }

                System.out.println("==== Round end ====\n");
            }
        } else {
            System.out.println("Rule violation.");
        }
    }

    boolean isApproval() {
        return ((fighter1.weight <= maxWeight && fighter1.weight >= minWeight) && (fighter2.weight <= maxWeight && fighter2.weight >= minWeight));
    }

    boolean winner(){
        if (fighter1.health == 0){
            System.out.println(fighter2.name + " is win.");
            return true;
        } else if (fighter2.health == 0) {
            System.out.println(fighter1.name + " is win.");
            return true;
        }

        return false;
    }
}



