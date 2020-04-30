import java.util.ArrayList;

public class Trainer {
	ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

	public String showStatus(ArrayList<Pokemon> pokemons,int member){
        String name = "###############Status ############### \n"+"Pokemon Name: "+ pokemons.get(member).getName();
        String hp = "\nHealth: "+pokemons.get(member).getHealth() + "/" + pokemons.get(member).getMaxHealth();
        String weight = "\nWeight: " + pokemons.get(member).getWeight() + " kg";  
        String feeling = "\nFeeling: " + pokemons.get(member).getFeeling() + " points";
        return name+hp+weight+feeling;
    }
	
	public void eatBerry(int member){
        Food berry = new Food(0);
        pokemons.get(member).eat(berry);
	}
	
	public void eatVitamin(int member){
        Food vitamin = new Food(1);
        pokemons.get(member).eat(vitamin);
	}
	
	public void eatRoastBeef(int member){
        Food roastbeef = new Food(2);
        pokemons.get(member).eat(roastbeef);
    }
    
    public void giveBall(int member){
        Toy ball = new Toy(0);
        pokemons.get(member).give(ball);
	}
	
	public void giveShoppingl(int member){
        Toy shopping = new Toy(1);
        pokemons.get(member).give(shopping);
	}
	
	public void giveHaircut(int member){
        Toy haircut = new Toy(2);
        pokemons.get(member).give(haircut);
	}
	
	public double getFeeling(int member) {
		return pokemons.get(member).getFeeling();
	}
	
	public void goodFeeling(int member) {
		pokemons.get(member).goodFeeling();
	}
	
	public void badFeeling(int member) {
		pokemons.get(member).badFeeling();
	}
	
}