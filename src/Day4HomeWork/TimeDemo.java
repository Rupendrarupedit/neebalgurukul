package Day4HomeWork;

class Time
{
Time(){
		
	}
	private int Hr, Min, Sec;
	Time(int Hour, int Min, int Sec ){
		Hr= Hour;
		this.Min=Min;
		this.Sec=Sec;
		}
	public int getHr() {
		return Hr;
	}
	public void setHr(int hr) {
		Hr = hr;
	}
	public int getMin() {
		return Min;
	}
	public void setMin(int min) {
		Min = min;
	}
	public int getSec() {
		return Sec;
	}
	public void setSec(int sec) {
		Sec = sec;
	}
	public String toString() {
		if(Hr>24)
		return Hr%24 +": "+Min+": "+Sec;
		else
			return Hr +": "+Min+": "+Sec;
	}
	int getTimeinSeconds() {
		return Hr*3600+Min*60+Sec;
	}
	void setTimeinHr(int s) {
		Hr=s/3600;
		s=s%3600;
		Min=s/60;
		Sec=s%60;
		
		
		
	}
	Time add(Time t) {
		Time a= new Time();
		int res= (getTimeinSeconds()+t.getTimeinSeconds());
		a.setTimeinHr(res);
		return a;
	}
	String convrtIn12Hours() {
		int h=Hr%12;
		String tm;
		if(Hr>=12) {
			if( h==0 )
				h=12;
			tm= h+": "+Min+": "+Sec+ " PM";
			}
		else
			tm= h+": "+Min+": "+Sec+ " AM";
		return tm;
	
}



}

public class TimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time x= new Time(12,30,25);
		Time y= new Time(19,20,35);
		Time z=x.add(y);
		
		String timeMessage1= x.convrtIn12Hours();
				String timeMessage2= y.convrtIn12Hours();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(timeMessage1);
		System.out.println(timeMessage2);
				

	}

	}


