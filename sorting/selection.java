import java.util.*;
public class quickfind{
	private int[] id;
	public quickfind(int N){
		id = new int[N];
		for (int i=0;i<N; i++)
			id[i]=i;
	}
	public boolean connected (int p,int q)
	{
		return id[p]==id[q];
	}
	public void union (int p,int q)
	{
		int a=id[p];
		int b=id[q];
		for (int i=0;i<id.length;i++)
			if(id[i]==b)
				id[i]=a;
	}
	public static void main(String [] args)
	{
		quickfind obj = new quickfind(10);
		obj.union(2,3);
		obj.union(5,6);
		obj.union(1,3);
		if(obj.connected(2,3))
			System.out.println("connected");
	}
}