class Aarthi
{
	private Object[] objArray=new Object[10];
	private int elementCount=0;
	private void add(Object obj)
	{
		if(elementCount==objArray.length)
		{
			increaseCapacity();
		}
		objArray[elementCount]=obj;
		elementCount++;
	}
	public void increaseCapacity()
	{
		int newCapacity=objArray.length*2;
		Object[] nextArray=new Object[newCapacity];
		for(int i=0;i<objArray.length;i++)
		{
			nextArray[i]=objArray[i];
		}
		objArray=nextArray;
	}
	public int capacity()
	{
		return objArray.length;
	}
	public int size()
	{
		return elementCount;
	}
	
	public Object get(int index)
	{
		if(index<0||index>=size())
		{
			System.out.println("IndexOutOfBound Exception");
		}
		return objArray[index];
	}
	public void replace(int index,Object obj)
	{
		if(index<0||index>=size())
		{
			System.out.println("IndexOutOfBound Exception");
		}
		objArray[index]=obj;
	}
	public void remove(int index)
	
	{
		
		if(index<0||index>=size())
		{
			System.out.println("IndexOutOfBound Exception");
		}
		while(index<size()-1)
		{
			objArray[index]=objArray[index+1];
			index++;
		}
		objArray[index]=null;
		elementCount--;
	}
	public void insert(int index,Object obj)
	{
		
		if(index<0||index>=size())
		{
			System.out.println("IndexOutOfBound Exception");
		}
		if(size()==capacity())
		{
			increaseCapacity();
		}
		for(int i=size()-1;i>=index;i--)
		{
			objArray[i++]=objArray[i];
		}
		objArray[index]=obj;
		elementCount++;
	}
	public void display(Object obj)
	{	
		System.out.println("Elements in the list");
		for(int i=0;i<size();i++)
		{
			System.out.println(objArray[i]);
		}
	}
	public static void main(String args[])
	{
 		Aarthi c=new Aarthi();
		c.add("Aarthi");
		c.add("cse");
		c.add("Gnit");
		c.add("jntu");
		c.add("hyderabad");
		c.add("chowdary");
		c.add("hastinapuram");
		c.add("ongole");
		c.add("kadapa");
		c.add("kurnool");
		c.display(c);
	}		
			
}
 

















