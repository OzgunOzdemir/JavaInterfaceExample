
public class Kare implements Sekil{
	
     int a=4;
     int sonuc;
	
	@Override
	public String Yaz()
	{
		System.out.println("Bu bir karedir");
		sonuc= a *a;
        System.out.println(sonuc);
		return null;
	}

}
