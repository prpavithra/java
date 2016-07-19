# java
public class aas {

	
	public static void main(String[] args) {
		int n1, n2, i, flag;
	   System.out.println("Enter two numbers(intevals): ");
	    n1=Integer.parseInt(args[0]);
	    n2=Integer.parseInt(args[1]);
	    System.out.println("Prime numbers between the" +n1+ "and" +n2+ "is: ");

	    while (n1 < n2)
	    {
	        flag=0;

	        for(i=2; i<=n1/2; ++i)
	        {
	            if(n1%i == 0)
	            {
	                flag=1;
	                break;
	            }
	        }

	        if (flag == 0)
	        {
	            System.out.println(n1);

	        }
	        ++n1;
	    }

	    System.out.println();
	}
	}
