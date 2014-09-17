package org.omg.dds.rpc;

import org.omg.dds.pub.DataWriter;
import org.omg.dds.sub.DataReader;

public interface ClientEndpoint<TReq, TRep> extends ServiceProxy {

    public DataWriter<TReq> getRequestDataWriter();

    public DataReader<TRep> getReplyDataReader();

    public ClientParams getClientParams();
    
}
