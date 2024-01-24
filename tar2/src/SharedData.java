public class SharedData 
{
	private int [] arrayList;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	public SharedData(int[] arrayList, int b) {
		
		this.arrayList = arrayList;
		this.b = b;
	}

	public boolean[] getWinArray() 
	{
		return winArray;
	}

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	public int[] getArray() 
	{
		return arrayList;
	}

	public int getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
