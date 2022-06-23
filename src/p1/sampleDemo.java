package p1;

public class sampleDemo {
int x=9;
}


class create extends sampleDemo{
	int x=7;
	sampleDemo sd;
	public void m1(int y){
	
		y=super.x;
		System.out.println(super.x+""+this.x+y);
		
	}
	

	
	public static void main(String[] args) {
		create cr= new create();
		cr.m1(4);
		
	}
}