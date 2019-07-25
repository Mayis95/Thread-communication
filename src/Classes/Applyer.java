package Classes;

public class Applyer extends Thread
{
    NodeClass nc;
    public Applyer(NodeClass n)
    {
        nc=n;
    }
    public void run()
    {
        for(int i=0; i<10; i++)
        {
            nc.getVal();
        }
    }
}
