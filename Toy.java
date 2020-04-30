
public class Toy {
    private String name;
    private float happyValue;
    private int type;

    public Toy(int type){
        this.type = type;
        switch(type){
            case 0: this.name = "Ball";
                this.happyValue = 20;
                break;
            case 1: this.name = "Shopping";
                this.happyValue = 40;
                break;
            case 2: this.name = "HairCut";
                this.happyValue = 30;
                break;
        }

    }

    public String getName(){
        return this.name;
    }

    public float getHappyValue(){
        return this.happyValue;
    }
}