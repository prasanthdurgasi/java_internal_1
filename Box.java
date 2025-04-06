import java.util.*;
class Box
{
	int width,height,depth;
	Box(int wid,int ht,int dpt)
	{
	  this.width = wid;
	  this.height = ht;
	  this.depth = dpt;
	}
	int volume()
	{
	  return width*height*depth;
	}
		
		public static void main(String[] args)
		{
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the width");
	          int wid = sc.nextInt();
		  System.out.println("Enter the height");
	          int ht = sc.nextInt();
		  System.out.println("Enter the depth");
	          int dpt = sc.nextInt();
		
		Box myBox = new Box(wid,ht,dpt);
		
		System.out.println("Volume of the Box:"+myBox.volume());
sc.close();
		}
}