class Demo implements Runnable
{
	private int ticket = 10 ;
	// ����һ��ͬ������
	public synchronized void fun() 
	{
		// ����Ҫͬ���ĵط�����ͬ������֮��
		if(this.ticket>0)
		{
			try
			{
				Thread.sleep(100) ;
			}
			catch (Exception e)
			{
			}
			System.out.println(Thread.currentThread().getName()+" --> ��Ʊ��"+this.ticket--) ;
		}
	}
	public void run()
	{
		while(ticket>0)
		{
			this.fun() ;
		}
	}
};
public class Dome01
{
	public static void main(String args[])
	{
		Demo d = new Demo() ;
		Thread t1 = new Thread(d,"��Ʊ�� A") ;
		Thread t2 = new Thread(d,"��Ʊ�� B") ;
		Thread t3 = new Thread(d,"��Ʊ�� C") ;

		t1.start() ;
		t2.start() ;
		t3.start() ;
	}
};