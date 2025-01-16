/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Juet
{
     private int x;
     public void setage(int age)
     {
         x=age;
     }
     public int getage()
     {
         return x=10;
     }
     private String y;
     public void setname(String name)
     {
         y=name;
     }
     public String getname()
     {
         return y="shubhrajit";
     }
    
}
public class Main
{
	public static void main(String[] args) {
	    Juet obj = new Juet();
	   // obj.setage(10);
	    System.out.println(obj.getage());
	    Juet obj1 = new Juet();
	    //obj1.setname("shubhrajit");
	    System.out.println(obj1.getname());
	    
}
}
