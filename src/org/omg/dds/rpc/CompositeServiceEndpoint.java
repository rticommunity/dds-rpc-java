package org.omg.dds.rpc;

import java.util.Dictionary;

import org.omg.dds.pub.DataWriter;
import org.omg.dds.sub.DataReader;

/* NOTE: CompositeServiceEndpoint is extended only by the derived
 *       interfaces when using the basic profile. 
 */
public interface CompositeServiceEndpoint extends RPCEntity {

    public void pause();
    
    public void resume();
        
    public ServiceEndpoint<?,?> getServiceEndpoint(Class<?> interfaceType);
    
    public Dictionary<Class<?>, ServiceEndpoint<?,?>> getAllServiceEndpoints();

    public <TReq> DataReader<TReq> getRequestDataReader(Class<?> requestType);

    public <TRep> DataWriter<TRep> getReplyDataWriter(Class<?> replyType);
    
}
