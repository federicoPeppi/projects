package it.larusba.gestionestringhe.src;

public class TuttiUguali {

	public String myString;
	
	public boolean uguali(String stringToVerify){
		if(stringToVerify == null){
			throw new IllegalArgumentException();
		}
		if(stringToVerify==""){
			throw new IllegalStateException();
		}
		char firstChar=stringToVerify.charAt(0);
		for(int i=0;i<stringToVerify.length();i++){
			if(firstChar!=stringToVerify.charAt(i)) return false;
		}//for i
		return true;
	}//equals
	
}//class tuttiUguali
