class Demo implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"-->������");
	}
}
public class Dome6
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		Thread t1 = new Thread(d,"�߳�1");
		System.out.println("�߳�����֮ǰ��"+t1.isAlive());
		t1.start();
		System.out.println("�߳�����֮��"+t1.isAlive());
		for (int i=0;i<100000 ;i++ )
		{
			//һ���ӳ�
		}
		System.out.println("�ӳ��߳�֮��"+t1.isAlive());
	}
}
