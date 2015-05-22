
public class main {
	
	static int mediaInteraVett(int[] v, int diQuanti) {
		int somma=0;
		for(int i=0; i<diQuanti; i++)
			somma+=v[i];
		if (diQuanti!=0)	
		  return somma/diQuanti;
		else
			throw new IllegalArgumentException();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vettore = { 3,8,-78,19,56,0,41,88,12,13,14,90};
		
		
						
		try{
			System.out.println("Media: " + mediaInteraVett(vettore, 0));
		}
		
		catch (IllegalArgumentException eccezione){
			
		}
	}



}
