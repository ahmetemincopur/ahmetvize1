package ahmetvize1;

public class Uygulama1 {
	public static int x=0;
	public int a=0;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StaticYapi.ad2; //Hata (Private tanimli)
		StaticYapi.StatikFonk(66);
		
		StaticYapi sd1=new StaticYapi();
		StaticYapi sd2=new StaticYapi();
		
		x=10;
		sd1.a=55;
		
		System.out.println("x deger:"+ x);
		System.out.println("sd1 a degeri:"+sd1.a);
		System.out.println("sd2 a degeri:"+sd2.a);
		System.out.println("sd1 ad degeri:"+sd1.ad);
		System.out.println("sd2 ad degeri:"+sd2.ad);
		System.out.println("sd2 ad degeri:"+StaticYapi.ad);
		System.out.println("-------------------");
		sd2.StatikFonk(5);
		sd1.StatikOlamayanFonk(44);
		
		System.out.println("x deger:"+ x);
		System.out.println("sd1 a degeri:"+sd1.a);
		System.out.println("sd2 a degeri:"+sd2.a);
		System.out.println("sd1 ad degeri:"+sd1.ad);
		System.out.println("sd2 ad degeri:"+sd2.ad);
		System.out.println("sd2 ad degeri:"+StaticYapi.ad);
		System.out.println("-------------------");
		
		
		StaticYapi.ad="�STE-BM";
		System.out.println("x deger:"+ x);
		System.out.println("sd1 a degeri:"+sd1.a);
		System.out.println("sd2 a degeri:"+sd2.a);
		System.out.println("sd1 ad degeri:"+sd1.ad);
		System.out.println("sd2 ad degeri:"+sd2.ad);
		System.out.println("sd2 ad degeri:"+StaticYapi.ad);
		System.out.println("-------------------");
		
		
	}

}
	
	
	
	
	
	
	
	
	
