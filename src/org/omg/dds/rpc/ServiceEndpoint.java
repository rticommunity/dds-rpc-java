package org.omg.dds.rpc;

import org.omg.dds.pub.DataWriter;
import org.omg.dds.sub.DataReader;

public interface ServiceEndpoint extends RPCEntity {

    public void pause();
    
    public void resume();
    
    public ServiceStatus status();
    
    public ServiceParams getServiceParams();

    public <TReq> DataReader<TReq> getRequestDataReader(Class<TReq> requestType);

    public <TRep> DataWriter<TRep> getReplyDataWriter(Class<TRep> replyType);

}
