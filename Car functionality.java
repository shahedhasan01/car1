
public class t1 { 

//objects to create new object in main 

int noc; 

int car1; 

int car2; 

int car3; 

int car4; 

 // constractor 

 t1(){ 

 noc=4; 

 car1=30; 

 car2=40; 

 car3=40; 

 car4=10; 

 } 

// part of contractor 

 int sum(){ 

 return noc+car1+car2+car3+car4; 

 } 

  

 // method return type  

  

public int testm (int n, int c1, int c2, int c3, int c4) { 

 int rr =n+c1+c2+c3+c4; 

 return rr; 

} 

 	public void testn (int m,int v,int y,int f) { 

 	int er= m+v+y+f; 

 	System.out.println("\nTOTAL NUMBER OF CARS of wonnm :"+er); 


 	  

 	} 

} 

public class main { 

 

public static void main(String[] args) { 

  

t1 man = new t1(); 

man.car1=20; 

man.car2=40; 

man.car3=30; 

man.car4=10; 

int r=man.car1+man.car2+man.car3+man.car4; 

System.out.println("TOTAL NUMBER OF CARS man :"+r); 

 

// constractor 

  t1 wom =new t1(); 

  int re=wom.sum()-20; 

  System.out.println("\nTOTAL NUMBER OF CARS of wom :"+re); 

 

  // method int 

  int y=man.testm(10, 20,30,40,50); 

  System.out.println("\nTOTAL NUMBER OF CARS of wom :"+y);  

       

  //method void 

  wom.testn(1, 2, 3, 4); 
 

} 

} 
 

import java.util.Scanner; 

public class ttr { 

public static void main(String[] args) { 

  Scanner  nab =new Scanner(System.in); 

  System.out.println("1st integer:"); 

  int x= nab.nextInt(); 

  System.out.println("2nd integer:"); 

  int y=nab.nextInt(); 

  int z= x+y; 
  System.out.println("RESULT IS :"+z); 
  
  
  
} 
}
