package Classes;

public class Sender extends Thread
{
    NodeClass nc;
    public Sender(NodeClass n)
    {
        nc=n;
    }
    public void run()
    {
        for(int i=0; i<10; i++)
        {
            nc.setVal(i);
        }
    }
}
