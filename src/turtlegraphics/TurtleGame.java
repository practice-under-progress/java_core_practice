package turtlegraphics;
import java.util.*;

public class TurtleGame {
	static int[][] myArr = new int[20][20];
	static int m=0;
	static int n=0;
	static int direction = 0;
	static boolean penStatus = false;
	
	public static void main(String args[])
	{
		
		for(int i=0;i<myArr.length-1;i++)
		{
			for(int j=0;j<myArr.length-1;j++)
			{
				myArr[i][j]=0;
			}
		}
		String[] Array = new String[7];
			Array[0] = "1. pen Up";
			Array[1] = "2. pen Down";
			Array[2] = "3. Turn Right";
			Array[3] = "4. Turn Left";
			Array[4] = "5. Move Forward";
			Array[5] = "6. Display Array";
			Array[6] = "9. End of Data";

			for(int k = 0 ; k<Array.length; k++){
			System.out.println(Array[k]);
			}
		
		while(true)
		{
		System.out.println("Enter your input");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		switch(input)
		{
		case "1" : penStatus = false;	break;
		case "2" : penStatus = true;	break;
		case "3" : direction = (direction+1)%4;System.out.println("Direction:"+direction);	break;
		case "4" : direction = (direction-1)%4;System.out.println("Direction:"+direction);	break;
		case "5" : System.out.println("Enter digits to shift");int z = sc.nextInt(); draw(z);	break;
		case "6" : print();	break;
		case "9" : System.exit(0);
		default: System.out.println("The input you have given does not correspond with any command, please choose from the given commands"); break;
		}
		}
	}

	private static void draw(int z) {
		// TODO Auto-generated method stub
		while(z!=0)
		{
			if(penStatus)
			{
				if(direction==0)
				{
					if( n != 19){ myArr[m][n++]=1; }else{ System.out.println("You've reached the end of the array, please change the direction"); break; }
				}
				else if(direction==1 || direction== -3)
				{
					if( m!=19){ myArr[m++][n]=1;}else{ System.out.println("You've reached the end of the array, please change the direction");break; }
				}
				else if(direction==2 || direction==-2)
				{
					if ( n!=0){ myArr[m][n--]=1;}else{ System.out.println("You've reached the end of the array, please change the direction"); break; }
				}
				else
				{
					if ( m != 0 ){ myArr[m--][n]=1; }else{ System.out.println("You've reached the end of the array, please change the direction"); break; }
				}
			}
			else
			{
				if(direction==0)
				{
					if ( n != 19) { n++; }else{ System.out.println("You've reached the end of the array, please change the direction"); break;}
				}
				else if(direction==1 || direction== -3)
				{
					if ( m != 19) { m++; }else{ System.out.println("You've reached the end of the array, please change the direction"); break;}
				}
				else if(direction==2 || direction== -2)
				{
					if (n!= 0 ) { n--; }else{ System.out.println("You've reached the end of the array, please change the direction");break;}
				}
				else
				{
					if ( m != 0 ) { m--; }else{ System.out.println("You've reached the end of the array, please change the direction"); break;}
				}
			}
			z--;
		}
	}

	
	private static void print() {
		
		for(int i=0;i<myArr.length-1;i++)
		{
			for(int j=0;j<myArr.length-1;j++)
			{
				System.out.print(myArr[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
