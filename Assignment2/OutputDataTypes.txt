public class OutputDataTypes 
{
	public static void main(String[] args) 
	{
		int a, b, d, e;
		double c, f, g;
		String words;
		
		a = 1/2;
		b = 1%2; 
		c = 1.0/2; 
		d = 5+7/2;
		words = "Beat" + ' ' + "Army";
		e = 6+13/5-35%3;
		f = 3.5*(5/4);
		g = (3.5*5)/4;
		
		System.out.println(a+" "+b+" "+c+" "+d+" "+words+" "+e+" "+f+" "+g);
	}
}