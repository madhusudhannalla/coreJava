package com.nt.arrayswithnllindex;

public class Emp {
	        int eid;
	        String ename;
         public Emp(int eid,String name) {
         this.eid=eid;
         this.ename=name;
}
         
         public static void main(String args[]) {
        	 Emp e1=new Emp(1,"madhu");
        	 Emp e2=new Emp(2,"mahesh");
        	 
        	 Emp emp[]=new Emp[5];
        	 emp[0]=e1;
        	 emp[1]=e2;
        	 
        	 for(int i=0;i<emp.length;i++) {
        		 if (emp[i]==null){
        			 System.out.println(i);
        		 }
        	 }
         }
}