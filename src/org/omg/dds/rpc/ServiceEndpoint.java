package org.omg.dds.rpc;

import org.omg.dds.pub.DataWriter;
import org.omg.dds.sub.DataReader;

public interface ServiceEndpoint extends RPCEntity {

    public void pause();
    
    public void resume();
    
    public ServiceStatus getServiceStatus();
    
    public ServiceParams getServiceParams();

    public <TReq> DataReader<TReq> getRequestDataReader(Class<?> requestType);

    public <TRep> DataWriter<TRep> getReplyDataWriter(Class<?> replyType);

}
