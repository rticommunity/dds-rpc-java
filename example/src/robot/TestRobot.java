package robot;

import org.omg.dds.rpc.RPCRuntime;
import org.omg.dds.rpc.*;

public class TestRobot {

    public static void main(String[] args) {

        RPCRuntime runtime = 
                RPCRuntime.getInstance(TestRobot.class.getClassLoader());
        
        if(args[0] == "server_rr")
            createRobotReplier(runtime);
        else if (args[0] == "client_rr")
            createRobotRequester(runtime);
        else if(args[0] == "server_func")
            createRobotServer(runtime);
        else if (args[0] == "client_func")
            createRobotClient(runtime);
        
    }
    
    static void createRobotServer(RPCRuntime runtime) {
        
        MyRobot myRobot = new MyRobot();
        
        Server server = runtime.createServer();

        RobotControlSupport.Service service = 
                RobotControlSupport.createService(myRobot, server);
        
        server.run();

    }

    static void createRobotClient(RPCRuntime runtime) {
        
        ClientParams clientParams = runtime.createClientParams();

        RobotControlSupport.Client robotClient = 
                RobotControlSupport.createClient(clientParams);
        
        robotClient.waitForService();
        
        robotClient.getSpeed();
    }

    static void createRobotRequester(RPCRuntime runtime) {
        
        RequesterParams reqParams = runtime.createRequesterParams();
        // change params here if you like
        Requester<RobotControlSupport.RequestType, 
                  RobotControlSupport.ReplyType>
             requester = runtime.createRequester(
                             RobotControlSupport.RequestType.class,
                             RobotControlSupport.ReplyType.class,
                             reqParams);

     }

    static void createRobotReplier(RPCRuntime runtime) {
        
        ReplierParams repParams = runtime.createReplierParams();
        // change params here if you like         
        Replier<RobotControlSupport.RequestType, 
                RobotControlSupport.ReplyType>
             replier = runtime.createReplier(
                     RobotControlSupport.RequestType.class,
                     RobotControlSupport.ReplyType.class,
                     repParams);

     }

}
