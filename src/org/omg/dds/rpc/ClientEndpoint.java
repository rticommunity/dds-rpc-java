package org.omg.dds.rpc;

import org.omg.dds.pub.DataWriter;
import org.omg.dds.sub.DataReader;

public interface ClientEndpoint extends ServiceProxy {

    public <TReq> DataWriter<TReq> getRequestDataWriter(Class<?> requestType);

    public <TRep> DataReader<TRep> getReplyDataReader(Class<?> replyType);

    public ClientParams getClientParams();
    
}
