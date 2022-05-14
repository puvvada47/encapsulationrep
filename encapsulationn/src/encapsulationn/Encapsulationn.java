package encapsulationn;

 class Student{  
private String name;
private int age;
   
public String getName(){  
return name;  
}  
public void setName(String name){  
this.name=name;  
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age>100)
	this.age = age;
	
}
@Override
public String toString() {
	return (name+"|"+age);
	
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}


}
	 
 class Encapsulationn {
	public static void main(String[] args){  
		Student s=new Student();  
		s.setName("vijay");
		s.setAge(120);
		System.out.println(s.getName()+" "+s.getAge());  
		System.out.println("override tostring method: "+s.toString());
	
	

}
}