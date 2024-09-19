public class Artist{
	private String name;
	
	
	public void setname(String name){
		
		this.name=name;
	}
    public String getname(){
	
	    return name;
    }
	
	public void display(){
		System.out.println("Artist's Name:" +name);
	}
	
}