// This code is generated

package robot;

import java.io.IOException;
import java.util.concurrent.Future;
import java.util.Dictionary;

import org.omg.dds.core.Duration;
import org.omg.dds.pub.DataWriter;
import org.omg.dds.pub.DataWriterQos;
import org.omg.dds.rpc.*;
import org.omg.dds.sub.DataReader;
import org.omg.dds.sub.DataReaderQos;

public abstract class RobotControlSupport {

    public final static class RequestType {
        // omg.dds.rpc.RequestHeader header;
        // data;
    }

    public final static class ReplyType {
        // omg.dds.rpc.ReplyHeader header;
        // data
    }
        
    public interface Client 
        extends RobotControl, 
                RobotControlAsync, 
                ClientEndpoint 
                /* Also see CompositeClientEndpoint */
    {                       
    }
        
    public interface Service 
        extends ServiceEndpoint 
                /* Also see CompositeServiceEndpoint */
    {
    }
    
    public static final RobotControlSupport.Client 
    createClient()
    {
        return null;
    }

    public static final RobotControlSupport.Client 
    createClient(ClientParams clientParams)
    {
        return null;
    }

    public static final RobotControlSupport.Client 
    createClient(Dictionary<Class<?>, ClientParams> compositeClientParams)
    {
        return null;
    }

    public static final RobotControlSupport.Service 
    createService(RobotControl serviceImpl)
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

    public static final RobotControlSupport.Service 
    createService(
            RobotControl serviceImpl, 
            Server server, 
            Dictionary<Class<?>, ServiceParams> compositeServiceParams)
    {
        return null;
    }

}
