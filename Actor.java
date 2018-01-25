package src;

public class Actor {
	
	String firstname, lastname;

	public Actor(String first, String last) {
		// TODO Auto-generated constructor stub
	
	firstname = first;
	
	lastname = last;
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Actor actor = new Actor ("Dingle", "Chingle");
		
		System.out.println(actor.firstname + actor.lastname);
		

	}

}
