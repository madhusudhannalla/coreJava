package com.nt.printwithoutnulls;

public class Test {
     int eid;
     String ename;
     public Test(int eid,String name) {
    	 this.eid=eid;
    	 this.ename=name;
     }

	public static void main(String[] args) {
        Test t1=new Test(1,"madhu");
        Test t2=new Test(2,"mahesh");
        Test t3=new Test(3,"mohan");
        
        Test test[]=new Test[5];
        test[1]=t1;
        test[3]=t2;
        test[4]=t3;
       
          for(Object o:test) {
        	if(o instanceof Test) {
        		Test tt=(Test)o;
        		System.out.println(tt.eid+"..."+tt.ename);
        	}
        	if(o==null)
        		System.out.println(o);
        }
		
		/*
		 * for(Test tt:test) { System.out.println(tt.eid+"..."+tt.ename); }
		 */
		/*
		 * for(int i=0;i<test.length;i++) { System.out.println(test[i]); }
		 */
	}

}
