
public class Dikdortgen implements Sekil{
	int a = 5;
	int b = 6;
	int sonuc ;
  
    @Override
    public String Yaz()
    {
	    System.out.println("Bu bir dikdörtgendir");
	    sonuc = a*b;
	    System.out.println(sonuc);
	    return null;
    }
}
