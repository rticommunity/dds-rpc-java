package robot;

import org.omg.dds.rpc.ServiceImplBase;
import org.omg.dds.rpc.Replier;
import org.omg.dds.rpc.ServiceParams;
import java.io.IOException;

public interface RobotControl {

    public void command(Command command);
   
    public float setSpeed(float speed);
    
    public float getSpeed();
    
    public void getStatus(Status status);
    
    public static class RequestType {
        // header
        // data
    }
    
    public static class ReplyType {
        // header
        // data
    }
    
    public static abstract class ServiceImpl 
        extends ServiceImplBase 
        implements RobotControl
    {
        private Replier<RequestType, ReplyType> replier;
        private RobotControl userImpl; 
        
        @Override
        public void activate(ServiceParams params)
        {
            userImpl = this;
            // create Replier from ServiceParams here.
            super.activate(params);
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
    }
    
}
