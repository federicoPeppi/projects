package Provabis;

public class Prova {
		int x;
		String S;
		int[] Amedeo;
		
		public Prova(){
			x=0;
			S="Amedeo";
			for(int i=0;i<=5;i++){
				Amedeo[0]=i;
			}
		}
		
		public int giveInt(){
			return x;
		}
		public String giveS(){
			return S;
		}
		public int[] givesArray(){
			return Amedeo;
		}
		
}
