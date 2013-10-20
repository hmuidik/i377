package projekt;

public class Unit {
	
	private int id;
	private String name;
	private String code;
	
	public Unit() {
		
	}
	
	public Unit(String name, String code) {
		
		this.name = name;
		this.code = code;
	}
	
	public Unit(int id, String name, String code){
		
		this.id = id;
		this.name = name;
		this.code = code;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString(){
		
		return "Unit [id=" + id + ", name=" + name + ", code=" + code + "]";
		
	}
	
	public boolean isEmpty(){
		return (name == null || name.length() == 0) && (code == null || code.length() == 0);
	}
	
}
