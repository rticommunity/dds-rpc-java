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
        extends RobotControl, RobotControlAsync, ServiceProxy
    {               
        public <TReq> DataWriter<TReq> getRequestDataWriter(Class<TReq> requestType);

        public <TRep> DataReader<TRep> getReplyDataReader(Class<TRep> replyType);

        public ClientParams getClientParams();
        public ClientParams getClientParams(Class<?> interfaceType);
        
        public Dictionary<Class<?>, ClientParams> getClientHierarchyParams();
        
    }
        
    public interface Service extends RPCEntity
    {
        public void pause();
        public void pause(Class<?> interfaceType);
        
        public void resume();
        public void resume(Class<?> interfaceType);
        
        public ServiceStatus status();
        public ServiceStatus status(Class<?> interfaceType);
        
        public ServiceParams getServiceParams();
        public ServiceParams getServiceParams(Class<?> interfaceType);

        public Dictionary<Class<?>, ServiceParams> getServiceHierarchyParams();

        public <TReq> DataReader<TReq> getRequestDataReader(Class<TReq> requestType);

        public <TRep> DataWriter<TRep> getReplyDataWriter(Class<TRep> replyType);

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
    createClient(Dictionary<Class<?>, ClientParams> hierarchyParams)
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
            Dictionary<Class<?>, ServiceParams> hierarchyParams)
    {
        return null;
    }

}
