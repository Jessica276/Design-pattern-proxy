import java.util.*;

class Proxy implements Interface{
	private Real real;
	private List<String> siteInterdi = Arrays.asList("youtube.com", "twitter.com","instagram.com");

	public Proxy(){}
	
	public Proxy(Real real){
		this.real = real;
	}
	
	public void setReal(Real real){
		this.real = real;
	}
	
	public Real getReal(){
		return real;
	}
	
	@Override
	public void visiter(String url){
		if(siteInterdi.contains(url)){
			System.out.println("Non accès au site " + url);
		}
		else{
			real.visiter(url);
		}
	}
}
