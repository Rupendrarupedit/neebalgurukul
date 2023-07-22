package day5andDay6HomeWork;

import java.util.Scanner;

class Person{
	String name;
	int age;
	Person(){
		
	}
	
    Person(String name,int age){
    	this.name=name;
    	this.age=age;
    	}
    public String toString(){
		return "Name: "+name+"Age: "+age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
	class Employee extends Person{
		int id;
		int sal;
		Employee(String name,int age ,int id, int sal){
			super(name, age);
			this.id=id;
			this.sal=sal;
			
		}
		public String toString(){
			return "Name: "+name+"  Age: "+age+" Salary: "+sal;}
		
		public int getSal() {
			return sal;
		}
		
		
	}
	class Official extends Employee{
		
		String dept;
		Official(String name,int age ,int id, int sal,String dept){
			super(name, age, id,sal);
		}
		
		
	}
	class Teacher extends Employee{
		String subject;
		Teacher(String name,int age ,int id, int sal,String subject){
			super(name, age, id,sal);
			
		}
		
	}
	class Principal extends Teacher{
		int exp;
		Principal(String name, int age, int id, int sal, String subject,int exp) {
			super(name, age, id, sal, subject);
			this.exp=exp;
			
			
		}
		
	}
	
	
public class ArrrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Teacher T1=new Teacher("Rupendra", 34, 101,50000, "Chemistry");
       Teacher T2=new Teacher("Swapnil", 32, 102,40000, "Physics");
       Teacher T3=new Teacher("Khushal", 30, 103,30000, "Maths");
       Principal P=new Principal("Aadarsh", 33, 104,99000, "Chem", 15);
       Official O=new Official("Rupesh", 37, 105,35000, "Fianance");
       
       Employee X[]=new Employee[5];
       X[0]=T1;
       X[1]=T2;
       X[2]=T3;
       X[3]=P;
       X[4]=O;
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the min age of the employee");
      int minage= sc.nextInt();
      System.out.println("Enter the max age of the employee");
      int maxage= sc.nextInt();
      Employee t= new Employee(null, 0, 0, 0);
      //Employee max= new Employee(null, 0, 0, 0);
      //Employee min= new Employee(null, 0, 0, 0);
      for (int i=0; i<X.length; i++) {
    	  for (int j=0; j<X.length-1;j++) {
    		  if(X[j].getAge()>X[j+1].getAge()) {
    		  t=X[j];
    				  X[j]=X[j+1] ;
    				  X[j+1]=t;
    	  }
    	    }
      }
    	  
    for (int j=0; j<X.length; j++)
    	System.out.println(X[j]);
    
    
       
      int indmax=0;
      int indmin=0;
      
     
      int max=X[0].getSal();
      int min=X[0].getSal();
      for (int i=0;i<X.length;i++) {
			if (X[i].getSal()>max) {
					max=X[i].getSal();
					indmax=i;
			}
			if(X[i].getSal()<min) {
				min=X[i].getSal();
				indmin=i;
			}
			
		}
      System.out.println("The person with max salary is "+X[indmax].getName());
      System.out.println("The person with max salary is "+X[indmin].getName());
      

	
	}
}
