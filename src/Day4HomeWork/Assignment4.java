package Day4HomeWork;
class Complex{
	private double real, imag;
	Complex(double rn, double in){
		real=rn;
		imag=in;
		
		
	}
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImag() {
		return imag;
	}
	public void setImag(double imag) {
		this.imag = imag;
	}
	public String toString() {
		if(imag<0)
		return real+" - "+"i"+imag*(-1);
		else
			return real+" + "+"i"+imag;
		}
	
	Complex add(Complex t) {
		double res= getReal()+ t.getReal();
		double ims= getImag()+ t.getImag();
		Complex z= new Complex(res, ims);
		return z;
	}
	Complex sub(Complex t) {
		double res= getReal()- t.getReal();
		double ims= getImag()- t.getImag();
		
		Complex z= new Complex(res, ims);
		return z;
		
		
	}
	Complex mul(Complex t) {
		double a=getReal();
		double b=getImag();
		double c=t.getReal();
		double d=t.getImag();
		double res=(a*c-b*d);
		double ims=(a*d+b*c);
		Complex z= new Complex(res, ims);
		return z;
		
	}
	Complex div(Complex t) {
		double a=getReal();
		double b=getImag();
		double c=t.getReal();
		double d=t.getImag();
		double e= c*c + d*d;
		double res = (a*c+b*d)/e;
		double ims=(b*c-a*d)/e;
		Complex z= new Complex(res, ims);
		return z;
		
		
	}
	
}

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Complex x=new Complex(3,4);
          Complex y=new Complex(4,5);
          Complex a=x.add(y);
          Complex s=x.sub(y);
          Complex m=x.mul(y);
          Complex d=x.div(y);
          System.out.println(x); //3+i4
          System.out.println(y); //4+i5
          System.out.println(a);//7+i9
          System.out.println(s);//-1-i
          System.out.println(m);//-8+i31
          System.out.println(d);//.78+i0.02

	}

}
