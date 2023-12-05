package projectOne;

public class character {
    String Name;
    int hitPoints;
    String Move;
    int damage;
    int attackSpeed;

    public character(String Name, String Move, int hitPoints, int damage, int attackSpeed) {
        this.Name = Name;
        this.hitPoints = hitPoints;
        this.Move = Move;
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public String getName(){
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    public int getHitPoints(){
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
    public void setHitPoints(int hitPoints, int damage){
        if (hitPoints - damage > 0){
            this.hitPoints = hitPoints - damage;
        }
        else {
            this.hitPoints = 0;
        }
    }

    public String getMove() {
        return Move;
    }
    public void setMove(String Move) {
        this.Move = Move;
    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }
    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }
}