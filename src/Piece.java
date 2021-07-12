public class Piece 
{

	public String name;
	public int value;
	public int weight;
	
	public Piece(String name, int value, int weight)
	{
		this.name=name;
		this.value=value;
		this.weight=weight;
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public int getWeight() {
		return weight;
	}
}
