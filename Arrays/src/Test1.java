

public class Test1 {
    public static Double addValues (Double[] values)throws Exception {
        // return the total
    	double s;
    	s=values[0]+values[1];
    	return s;
 	
    }
    
    public static void main(String args[]) throws Exception {
    	
    	Double[] d= {10.2,21.2};
    	Double ss=Test1.addValues(d);
    	
    	System.out.println(ss);
    	
    	
    }
}
