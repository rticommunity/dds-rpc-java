// This code is generated

package robot;

import java.io.IOException;
import java.util.concurrent.Future;

import org.omg.dds.core.Duration;
import org.omg.dds.pub.DataWriter;
import org.omg.dds.pub.DataWriterQos;
import org.omg.dds.rpc.*;
import org.omg.dds.sub.DataReader;
import org.omg.dds.sub.DataReaderQos;

public abstract class RobotControlSupport {

    public final static class RequestType {
        // omg.dds.rpc.RequestHeader header;
        // robot.RobotControl_Call data;
    }

    public final static class ReplyType {
        // omg.dds.rpc.ReplyHeader header;
        // data
    }

    public interface Client 
        extends RobotControl, 
                RobotControlAsync,
                RPCClientEndpoint<RequestType, ReplyType>  
    {       
        public ClientParams getClientParams();
        
    }
        
    public interface Service 
        extends RPCServiceEndpoint<RequestType, ReplyType>
    {
        public void pause();
        
        public void resume();
        
        public ServiceStatus status();
        
        public ServiceParams getServiceParams();

    }
    
    public static final RobotControlSupport.Client 
    createClient(
            String serviceName)
    {
        return null;
    }

    public static final RobotControlSupport.Client 
    createClient(
            String serviceName,
            String instanceName)
    {
        return null;
    }

    public static final RobotControlSupport.Client 
    createClient(
            ClientParams clientParams)
    {
        return null;
    }

    public static final RobotControlSupport.Service 
    createService(
            RobotControl serviceImpl, 
            Server server)
    {
        return null;
    }

    public static final RobotControlSupport.Service 
    createService(
            RobotControl serviceImpl, 
            Server server, 
            ServiceParams serviceParams)
    {
        return null;
    }

}
