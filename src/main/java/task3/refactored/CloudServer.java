package task3.refactored;


public class CloudServer
{
    //---------------------------------------------------------------------
    private static  CloudServer INSTANCE ;

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
        if (INSTANCE == null)
        {
            INSTANCE = new CloudServer();
        }
        return INSTANCE;

    }// close public static CloudServer getInstance() method
    //---------------------------------------------------------------------


}// close public class CloudServer

