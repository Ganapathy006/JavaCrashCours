package com.lao.conditionalExample;

public class WhosHero {

	
	String hero="iron Man";
	
	public void findMyHero(){
		
		if(hero.equalsIgnoreCase("Super Man")){
			System.out.println("You thought Super Man");
		}else if(hero.equalsIgnoreCase("Iron Man")){
			System.out.println("You thought Iron Man");
		}else if(hero.equalsIgnoreCase("Spider Man")){
			System.out.println("You thought Spider Man");
		}else{
			System.out.println("Sorry..Couldn't find the Hero");
		}
	}
	
	public static void main(String[] args) {
		
		WhosHero myHero = new WhosHero();
		myHero.findMyHero();
		
		

	}

}
