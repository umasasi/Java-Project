package Allassignments;

public class Constructors 
{
		
			int x;
			float y;
			double z,t,rh;
			Constructors()
			{
				
			}
		    Constructors(int s)
		    {
				x=(s*s);
			}
	      Constructors(float l, float b)
	      {
				
				y=(l*b);
				
			}
			Constructors(double r)
			{
				z=(3.14*r*r);
			}
			void displaySquare()
			{
				System.out.println("area of square is " +x);
			}
			void displayRect()
			{
				System.out.println("area of rectangle is " +y);
			}
			void displayCircle()
			{
				System.out.println("area of circle is " +z);
			}
			void area(float k, float l)
			{
				t=(0.5*k*l);
				System.out.println("area of triangle is " +t);
			} 
			void area(double d1, double d2)
			{
				rh=(0.5*d1*d2);
				System.out.println("area of rhombus is " +rh);
			}
			

			

	public static void main(String[] args) 
	{
		Constructors s1=new Constructors(14);
		Constructors s2=new Constructors(5,2);
		Constructors s3=new Constructors(6.5);
		Constructors s4=new Constructors();
		Constructors s5=new Constructors();
		s1.displaySquare();
		s2.displayRect();
		s3.displayCircle();
		s4.area(21.5,10.2);
		s5.area(21,10);
		
	}


	}


