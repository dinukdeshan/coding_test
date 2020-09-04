public class Tax{

static double tax_excluder(double tax_inc, double tax_perc){
    return Math.round(tax_inc/(1+tax_perc/100));
}

     public static void main(String []args){
		 
		//Testing the function
        System.out.println(tax_excluder(110.00, 10));
     }
}