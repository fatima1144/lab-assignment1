public class Artwork{
	private String title;
	private int year;
	private Artist artist;
	
	
	
	
	
	Artwork (String title,int year, Artist artist){
		this.title=title;
		this.year=year;
		this.artist=artist;
		
	}
	Artwork (String title, int year){
		this.title=title;
		this.year=year;
		
	}
	
	
	public void settitle(String title){
		this.title=title;
		
	}
	public String gettitle(){
		return title;
		
	}
	
	public void setartist(Artist artist){
		this.artist=artist;
		
	}
	public Artist getartist(){
		return artist;
		
	}
	
	public void setyear(int year){
		this.year=year;
		
	}
	public int getyear(){
		return year;
		
	}
	public void display1(){
		System.out.println("Artwork's title:" +title);
		System.out.println("Artwork's year:" +year);
		System.out.println("Artwork's artist:" +artist);
		
	
	}
}