package serverr;
public class ServerMain {
    public static void main(String[] args)
    {
        Server s=new Server();  //it will invoke the GUI part
        s.waitingForClient();   //it will wait for the client
        s.setIoStreams();       //it will set the streams through which we will transfer the data
    }
}

    
}
