
public class Food {
    private String name;
	private float restoreValue;
	private int type;

	public Food(int type){
		this.type = type;
		switch(type){
			case 0: this.name = "Berry";
				this.restoreValue = 10;
				break;
			case 1: this.name = "Vitamin";
				this.restoreValue = 5;
				break;
			case 2: this.name = "Roast Beef";
				this.restoreValue = 15;
				break;
		}

	}

	public String getName(){
		return this.name;
	}

	public float getRestoreValue(){
		return this.restoreValue;
	}
}