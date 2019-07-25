import Classes.*;

public class ThreadCom
{
    public static void main(String args[])
    {
        NodeClass ob=new NodeClass();
        Sender sd=new Sender(ob);
        Applyer ap=new Applyer(ob);
        sd.start();
        ap.start();
        try
        {
            sd.join();
            ap.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Interruption");
        }
    }
}
