package arrayL1;
import java.util.*;
public class J1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),sum=0;
                int a[]=new int[n];
		for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
        	sum+=a[i];
		System.out.println(sum);
		
	}

}
