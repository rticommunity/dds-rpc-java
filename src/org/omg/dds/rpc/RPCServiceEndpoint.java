package org.omg.dds.rpc;

import org.omg.dds.pub.DataWriter;
import org.omg.dds.pub.DataWriterQos;
import org.omg.dds.sub.DataReader;
import org.omg.dds.sub.DataReaderQos;

public interface RPCServiceEndpoint<TReq, TRep> extends RPCEntity {

    public DataReader<TReq> getRequestDataReader();

    public DataWriter<TRep> getReplyDataWriter();

}
