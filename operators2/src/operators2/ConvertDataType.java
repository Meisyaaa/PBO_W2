package operators2;

/**
 * 
 * @author Meisya Puteri Ghefira
 *
 */

class ConvertDataType {
	static short methodOne(long l)
	{
		int i = (int) l; //long dipersempit ke int
		return (short)i; //int dipersempit ke short
	}
	public static void main (String[] args)
	{
		double d = 10.25;
		float f = (float) d; //double secara eksplisit dipersempit menjadi float
		byte b = (byte) methodOne ((long) f); //float secara eksplisit dipersempit menjadi log dan short menjadi byte
		System.out.println(b);
	}
}
