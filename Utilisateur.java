class Utilisateur{
	public static void main(String[] args){
		Real site = new Real();
		Interface siteProxy = new Proxy(site);
	
		siteProxy.visiter("youtube.com");
		siteProxy.visiter("instagram.com");
		siteProxy.visiter("linkedin.com");
	}
}
