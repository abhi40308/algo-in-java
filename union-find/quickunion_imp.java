import java.util.*;
public class quickunion_imp{
	private int[] id;
	private int[] wt;
	public quickunion_imp(int N){
		id = new int[N];
		wt = new int[N];
		for (int i=0;i<N; i++)
			{	id[i]=i;	wt[i]=1;}
	}
	private int root(int i)
	{
		while(id[i]!=i) {	
			id[i] = id[id[i]];
			i = id[i];}
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
		if(wt[a]>wt[b])
		{
			id[b]=a;
			wt[a] += wt[b];
		}
		else
		{
			id[a] = b;
			wt[b] += wt[a];
		}
	}
	public static void main(String [] args)
	{
		quickunion_imp obj = new quickunion_imp(10);
		obj.union(2,3);
		obj.union(5,6);
		obj.union(1,3);
		if(obj.connected(2,3))
			System.out.println("connected");
	}
}