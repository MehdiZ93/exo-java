package TypeParametree;

import java.util.ArrayList;
import java.util.Random;

public class exo1 {
	
	public static void main(String[] args){
		ArrayList<Integer> a = new ArrayList<Integer>();
		Random r = new Random();
		int i;
		for(i=0;i<10;i++)
		{
			a.add(r.nextInt(10000)%100);
		}
		for(i=0;i<10;i++)
		{
			System.out.println(a.get(i));
		}
		
	}

}
