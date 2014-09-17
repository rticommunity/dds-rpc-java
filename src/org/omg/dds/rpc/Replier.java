package org.omg.dds.rpc;

import org.omg.dds.core.Duration;
import org.omg.dds.pub.DataWriter;
import org.omg.dds.rpc.Sample;
import org.omg.dds.rpc.ReplierParams;
import org.omg.dds.sub.DataReader;
import org.omg.dds.core.SampleIdentity;

/* Replier can't be a ServiceEndpoint<T, U> because it does not support pause/resume */
public interface Replier<TReq, TRep> extends RPCEntity 
{
    public void sendReply(
            TRep reply,
            SampleIdentity relatedRequestId);

    public boolean receiveRequest(
            Sample<TReq> request,
            Duration maxWait);

    public Sample.Iterator<TReq> receiveRequests(
            Duration maxWait);

    public Sample.Iterator<TReq> receiveRequests(
            int minRequestCount,
            int maxRequestCount,
            Duration maxWait);

    public boolean waitForRequests(
            Duration maxWait);

    public boolean waitForRequests(
            int minCount, 
            Duration maxWait);

    public boolean takeRequest(Sample<TReq> request);

    public Sample.Iterator<TReq> takeRequests(int maxSamples);

    public boolean readRequest(Sample<TReq> request);

    public Sample.Iterator<TReq> readRequests(int maxSamples);

    boolean receiveNondataSamples(boolean enable);
    
    public ReplierParams getReplierParams();
    
    public DataReader<TReq> getRequestDataReader();

    public DataWriter<TRep> getReplyDataWriter();
}
