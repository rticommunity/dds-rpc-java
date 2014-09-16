package org.omg.dds.rpc;

import org.omg.dds.pub.DataWriter;
import org.omg.dds.sub.DataReader;

public interface ClientEndpoint extends ServiceProxy {

    public <TReq> DataWriter<TReq> getRequestDataWriter(Class<TReq> requestType);

    public <TRep> DataReader<TRep> getReplyDataReader(Class<TRep> replyType);

    public ClientParams getClientParams();
    
}
