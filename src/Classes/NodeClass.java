package Classes;

public class NodeClass
{
    private int val;
    boolean ValSet=false;
    public synchronized void setVal(int v)
    {
        while(ValSet)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(Thread.currentThread().getName()+" is interrupted");
            }
        }
        ValSet=true;
        notify();
        val=v;
        System.out.println("Value is set: "+v);
    }
    public synchronized int getVal()
    {
        while(!ValSet)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                System.out.println(Thread.currentThread().getName()+" is interrupted");
            }
        }
        ValSet=false;
        notify();
        System.out.println("Value get: "+val);
        return val;
    }
}
