
public class amazon {

	public static void main(String[] args) 
	{
		amazon a= new amazon();
		a.myFun(9870);
		}
	int myFun(int n){
	int m=0;
	while(n>0) {
		m=10*m+n%10;
		n=n/10;
	}
	return m;
}
}


