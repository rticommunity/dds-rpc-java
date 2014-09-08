package robot;

import org.omg.dds.core.Duration;
import org.omg.dds.rpc.*;

import java.io.IOException;

public interface RobotControl {

    public void command(Command command);
   
    public float setSpeed(float speed);
    
    public float getSpeed();
    
    public void getStatus(Status status);
    
    public final static class RequestType {
        // header
        // data
    }
    
    public final static class ReplyType {
        // header
        // data
    }

    public static class ServiceProxy 
        implements ServiceProxyBase, RobotControl 
    {
        // normative constructor
        public ServiceProxy() {
        }
        
        public boolean resolveService(
                Client client,
                String serviceName) {
            return false;
        }

        public boolean resolveServiceInstance(
                Client client,
                String serviceName,
                String instanceName) {
            return false;
        }
        
        public boolean resolveService(
                Client client,
                ServiceProxyParams params) {
            return false;
        }
        
        public boolean resolveService(
                Client client,
                String serviceName, 
                Duration maxWait) {
            return false;
        }
        
        public boolean resolveServiceInstance(
                Client client,
                String serviceName,
                String instanceName,
                Duration maxWait) {
            return false;
        }
        
        public boolean resolveService(
                Client client,
                ServiceProxyParams params, 
                Duration MaxWait) {
            return false;
        }
        
        public void bind(String instanceName) {
        }
        
        public void unbind() {
        }
        
        public boolean isBound() {
            return false;
        }
        
        public String getBoundInstance() {
            return null;
        }
        
        public ServiceProxyParams getServiceProxyParams() {
            return null;
        }
        
        public void command(Command command) {
        }
        
        public float setSpeed(float speed) {
            return 0;
        }
        
        public float getSpeed() {
            return 0;
        }
        
        public void getStatus(Status status) {
        }
    }
        
    public static abstract class ServiceImpl 
        extends ServiceImplBase 
        implements RobotControl
    {
        private Replier<RequestType, ReplyType> replier;
        private RobotControl userImpl; 
        
        public void activate()
        {
            // create Replier from super.getServiceParams() here.
            ServiceParams serviceParams = 
                    super.getServiceParams();
            
            RPCRuntime runtime 
                = serviceParams.getServer().getRPCRuntime();
            
            replier = runtime.createReplier(
                        RequestType.class,
                        ReplyType.class,
                        toReplierParams(serviceParams));
            
            userImpl = this;
        }
        
        public void close() throws IOException
        {
            try {
                replier.close();
            }
            catch(java.io.IOException ex)
            {
                
            }
        }
        
        private static final ReplierParams 
        toReplierParams(ServiceParams params) {
            return null;
        }
    }
    
}
