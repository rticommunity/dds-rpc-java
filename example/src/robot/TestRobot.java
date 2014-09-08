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
        
        ServerParams serverParams = runtime.createServerParams();
        // change serverParams here if you like
        Server server = runtime.createServer(serverParams);
        
        ServiceParams serviceParams = runtime.createServiceParams();
        // change serviceParams here if you like
        server.registerService(myRobot, serviceParams);
        
        server.run();

    }

    static void createRobotClient(RPCRuntime runtime) {
        
        ClientParams clientParams = runtime.createClientParams();
        // change params here if you like
        Client client = runtime.createClient(clientParams);

        RobotControl.ServiceProxy robotProxy = 
                new RobotControl.ServiceProxy();
        
        robotProxy.resolveService(client, "MyRobot");
        
        robotProxy.getSpeed();
    }

    static void createRobotRequester(RPCRuntime runtime) {
        
        RequesterParams reqParams = runtime.createRequesterParams();
        // change params here if you like
        Requester<RobotControl.RequestType, RobotControl.ReplyType>
             requester = runtime.createRequester(
                             RobotControl.RequestType.class,
                             RobotControl.ReplyType.class,
                             reqParams);

     }

    static void createRobotReplier(RPCRuntime runtime) {
        
        ReplierParams repParams = runtime.createReplierParams();
        // change params here if you like         
        Replier<RobotControl.RequestType, RobotControl.ReplyType>
             replier = runtime.createReplier(
                     RobotControl.RequestType.class,
                     RobotControl.ReplyType.class,
                     repParams);

     }

}
