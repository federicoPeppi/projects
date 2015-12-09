package it.larusba.myspringesprimario;


public class TuttiUguali {

	public String myString;
	
	public void setStringses(String myString){
        this.myString  = myString;
     }

	public boolean uguali(String myString){
		if(this.myString == null){
			throw new IllegalArgumentException();
		}
		if(this.myString==""){
			throw new IllegalStateException();
		}
		char firstChar=this.myString.charAt(0);
		for(int i=0;i<this.myString.length();i++){
			if(firstChar!=this.myString.charAt(i)) {System.out.println("Le lettere sono diverse");return false;}
		}//for i
		System.out.println("Le lettere sono tutte uguali");
		return true;
	}//equals
	
	
	
}//class tuttiUguali
