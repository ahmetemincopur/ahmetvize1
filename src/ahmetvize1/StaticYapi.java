package ahmetvize1;


public class StaticYapi {
	public int a=0;
	public static String ad="�STE";
	private static String ad1="�STE";
	
	public static void StatikFonk(int i) {
		ad+="-"+i;
		//a=5;
		//this.a=i;
		ad1="";
	}
	public void StatikOlamayanFonk(int i) {
		this.a=i;
		ad+="**"+i;
	}

}