package task3.original;


public class CloudServer
{
    //---------------------------------------------------------------------
    private static final CloudServer INSTANCE = new CloudServer();

    //---------------------------------------------------------------------
    private CloudServer()
    {
        // This contains the implementation details
        // for initialising the cloud server

    }//close private CloudServer()
    //---------------------------------------------------------------------

    //---------------------------------------------------------------------
    public static CloudServer getInstance()
    {
        return INSTANCE;

    }// close public static CloudServer getInstance() method
    //---------------------------------------------------------------------


}// close public class CloudServer

