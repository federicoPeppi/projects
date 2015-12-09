
public abstract class AnimaleTerrestre extends Animale{
	public AnimaleTerrestre(String s){
		super(s);
	}
	public String vive(){
		return "sulla terraferma";
	}
    public abstract String si_muove();
    public String chi_sei(){
    	return "un animale terrestre";
    }
}
