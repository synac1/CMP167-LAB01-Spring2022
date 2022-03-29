/** 
 * 
 */

	public class Mammal{
		//Attributes
		private int numOfLegs;
		private boolean hasFur;
		private String species;
		
		//Default Constructor
		public Mammal(){
			this.numOfLegs = 2;
			this.hasFur    = true;
			this.species   = "bear";
		}
		
		//Overloaded Constructor
		public Mammal(int numOfLegs, boolean hasFur, String species){
			this.numOfLegs = numOfLegs;
			this.hasFur    = hasFur;
			this.species   = species;
		}
		
		//Setter
		public void setNumOfLegs(int numOfLegs){
			this.numOfLegs = numOfLegs;
		}
		
		
		//getter
		public int getNumOfLegs(){
			return this.numOfLegs;
		}
		
		// Create the other 2 setters and getters, for hasFur, species
		
		
		public static void main(String[] args) {
			
			Mammal mammal1 = new Mammal();
			
			Mammal mammal2 = new Mammal(4,false, "cat");
			
			System.out.println(mammal2.species);
			
		}
	}