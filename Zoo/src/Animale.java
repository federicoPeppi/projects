
public abstract class Animale {
	private String nome;
	protected String verso;
    public Animale(String nome){
    	this.nome=nome;
    }//costruttore, inizializzo il nome
    public abstract String si_muove();//mi dice come si muove l'animale
    public abstract String vive();//mi dice l'ambiente dove vive
    public abstract String chi_sei();
    public void mostra(){
    	System.out.println(nome + ", " +chi_sei() + ", " + verso +", si muove " +
    			si_muove() + " e vive " + vive()); ;
    } // mostra
    
    
}//classe animale


