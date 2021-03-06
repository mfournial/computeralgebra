package boll_verification;
public class start {

	private double xPos;
	private double yPos;
	private static double THRESHOLD_TO_TAKE_AS_INFINITY = 2;
	
	public static void main(String[] args) {
		/////////////////////////////////////////////DO THIS FOR CUBES AND HIGHER AND LOWER POWERS AND COMPLEX POWERS
		for(int i=0;i<15;i++){
			double epsilon = Math.pow(3, -1*i);
			System.out.println(epsilon*isConvergentWithin(-0.75,epsilon,1000000000));
			System.out.println("-");
		}
		System.out.println("___________________________________________________________");
		for(int i=0;i<15;i++){
			double epsilon = Math.pow(3, -1*i);
			System.out.println(Math.sqrt(epsilon)*isConvergentWithin(0.25+epsilon,0,1000000000));
			System.out.println("-");
		}
		System.out.println("___________________________________________________________");
		for(int i=0;i<15;i++){
			double epsilon = Math.pow(3, -1*i);
			System.out.println(epsilon*isConvergentWithin(-0.75,-1*epsilon,1000000000));
			System.out.println("-");
		}
		System.out.println("___________________________________________________________");
		for(int i=0;i<15;i++){
			double epsilon = Math.pow(3, -1*i);
			System.out.println(epsilon*isConvergentWithin(-1.25,-1*epsilon,1000000000));
			System.out.println("-");
		}
		System.out.println("___________________________________________________________");
		for(int i=0;i<15;i++){
			double epsilon = Math.pow(3, -1*i);
			System.out.println(epsilon*isConvergentWithin(-1.25,epsilon,1000000000));
			System.out.println("-");
		}
	}
	
	

	public static double isConvergentWithin(double a,double b,int iterations){
		double x=a,y=b,xt,yt;
		for(int i=0;i<iterations;i++){
			
			xt = reSquareC(x,y)+a;
			yt = imSquareC(x,y)+b;
			
			x = xt;
			y = yt;
			
			if(findMagnitude(x,y)>THRESHOLD_TO_TAKE_AS_INFINITY){
				return i;
			}
		}
		return -1;
	}
	
	public static double findMagnitude(double a,double b){
		return Math.sqrt(a*a+b*b);
	}
	
	public static double imSquareC(double a,double b){
		return 2*a*b;
	}
	
	public static double reSquareC(double a,double b){
		return a*a-b*b;
	}

}
