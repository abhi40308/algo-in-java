import java.util.*;
public class quickunion{
	private int[] id;
	public quickunion(int N){
		id = new int[N];
		for (int i=0;i<N; i++)
			id[i]=i;
	}
	private int root(int i)
	{
		while(id[i]!=i) i = id[i];
		return i;
	}
	public boolean connected (int p,int q)
	{
		return root(p)==root(q);
	}
	public void union (int p,int q)
	{
		int a=root(p);
		int b=root(q);
		id[a]=b;
	}
	public static void main(String [] args)
	{
		quickunion obj = new quickunion(10);
		obj.union(2,3);
		obj.union(5,6);
		obj.union(1,3);
		if(obj.connected(2,3))
			System.out.println("connected");
	}
}