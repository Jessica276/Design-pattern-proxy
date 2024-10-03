class Real implements Interface{
	public Real(){}
	
	@Override
	public void visiter(String url){
		System.out.println("url: " + url);
	}
}
