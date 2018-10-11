
public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c1 = 1;
		// short s = c; Não posso
		
		short s2 = 1;
		//char c2 = s2; não posso
		
		//Casting
		
		s2 = (short)c1;
		
		int i = 123;
		
		long l = i;
		
		i = (int)l;
		
		float f = 3.14F;
		double d = f;
		
		f = (float)d;
		
		int i2 = (int)d;
	}

}
