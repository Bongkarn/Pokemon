
class Pokemon{
    public final double maxHealth;
    public final double maxFeeling;
	protected double health,weight;
	protected String name;
	protected double feeling;

	public Pokemon(String name, double maxHealth,double maxFeeling,double health,double weight, double feel){
		this.name      = name;
		this.health    = health;
        this.maxHealth = maxHealth;
        this.maxFeeling = maxFeeling;
        this.weight    = weight;
        this.feeling   = feel;
	}
        
    public double getWeight(){
    	return this.weight;
    }
    
	public double getHealth(){
		return this.health;
	}
	
	public double getMaxHealth(){
		return this.maxHealth;
	}

	public String getName(){
		return this.name;
	}
	
	public double getFeeling(){
		return this.feeling;
	}
	
	public void eat(Food food){
		this.health += food.getRestoreValue();
		this.weight += (0.5)*food.getRestoreValue();
		if(this.health > this.maxHealth)
			this.health = this.maxHealth;
    }
    
    public void give(Toy toy){
        this.feeling += toy.getHappyValue();
        if(this.feeling > this.maxFeeling)
            this.feeling = this.maxFeeling;
    }
    
	public void goodFeeling() {
		this.feeling += 10;
	}
	
	public void badFeeling( ) {
		this.feeling -= 5 ;
		if(this.feeling < 0)
			feeling = 0;
	}

}