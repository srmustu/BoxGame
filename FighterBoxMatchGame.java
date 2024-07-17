public class FighterBoxMatchGame {
    String name;
    int power;
    int health;
    int weight;
    int block;
    int agility;

    FighterBoxMatchGame(String name, int power, int health, int weight, int block ,int agility ){
        this.name = name;
        this.power = power;
        this.weight = weight;
        this.health = health;
        this.block = block;
        this.agility = agility;
    }

    boolean isBlock(){
        double randomValue = (Math.random() * 100);
        if (randomValue <= this.block){
            return true;
        }
        else {
            return false;
        }
    }

    int damage(FighterBoxMatchGame rivalFighter){
        System.out.println(this.name + " dealt " + this.power + " to " + rivalFighter.name);
        if (rivalFighter.isBlock()){
            System.out.println(rivalFighter.name + " blocked the imcoming damage.");
            return rivalFighter.health;
        }

        if (rivalFighter.health - this.power < 0){
            return 0;
        }
        return rivalFighter.health - this.power;
    }

    boolean firstDamage(){
        double randomValue = (Math.random() * 100);
        if (randomValue <= this.agility){
            return true;
        }else {
            return false;
        }

    }
}
