public class PowerFunction{
	
static double power_function(double num, double power){
	
	try{
		double ans=1.0;
		double temp_power=power;//So that math.abs is not used
		if(power<0) temp_power=power*-1;
		int counter =(int)temp_power;
		
		while(counter>0){
			ans = ans * num;
			counter--;
		}
		//If the power is negative
		if(power<0){
			ans = 1/ans;
		}
		
		return ans;
	}
	
	catch(Exception e){
		System.out.print(e);
		return 0.0;
	}
	
}
	public static void main(String[] args){
		//Calling the function
		System.out.print(power_function(5,3));
	}
}
