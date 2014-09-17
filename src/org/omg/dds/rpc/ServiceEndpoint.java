package org.omg.dds.rpc;

import org.omg.dds.pub.DataWriter;
import org.omg.dds.sub.DataReader;

public interface ServiceEndpoint<TReq, TRep> extends RPCEntity {

    public void pause();
    
    public void resume();
    
    public ServiceStatus getServiceStatus();
    
    public ServiceParams getServiceParams();

    public DataReader<TReq> getRequestDataReader();

    public DataWriter<TRep> getReplyDataWriter();

}
