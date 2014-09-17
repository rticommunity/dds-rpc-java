package org.omg.dds.rpc;

import java.util.Dictionary;
import org.omg.dds.pub.DataWriter;
import org.omg.dds.sub.DataReader;

/* NOTE: CompositeClientEndpoint is extended only by the derived
 *       interfaces when using the basic profile. 
 */
public interface CompositeClientEndpoint extends ServiceProxy {
    
    public ClientEndpoint<?,?> getClientEndpoint(Class<?> interfaceType);
    
    public Dictionary<Class<?>, ClientEndpoint<?,?>> getAllClientEndpoints();

    public <TReq> DataWriter<TReq> getRequestDataWriter(Class<?> requestType);

    public <TRep> DataReader<TRep> getReplyDataReader(Class<?> replyType);
    
}
