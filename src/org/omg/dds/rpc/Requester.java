package org.omg.dds.rpc;

import java.io.Closeable;
import java.util.concurrent.Future;

import org.omg.dds.core.DDSObject;
import org.omg.dds.core.Duration;
import org.omg.dds.rpc.Sample;
import org.omg.dds.core.SampleIdentity;
import org.omg.dds.sub.DataReader;
import org.omg.dds.pub.DataWriter;
import org.omg.dds.sub.DataReaderQos;
import org.omg.dds.pub.DataWriterQos;

import java.util.concurrent.ExecutorService;

public interface Requester<TReq, TRep> 
  extends RPCObject, Closeable 
{
    public SampleIdentity sendRequest(TReq request);

    public void sendRequestOneway(TReq request);
    
    public Future<Sample<TRep>> 
        sendRequestAsync(TReq request);

    public Future<Sample<TRep>> 
        sendRequestAsync(TReq request, ExecutorService executor);

    public Sample<TRep> receiveReply(Duration timeout);

    public Sample<TRep> receiveReply(SampleIdentity relatedRequestId);

    public Sample.Iterator<TRep> receiveReplies(Duration maxWait);

    public Sample.Iterator<TRep> receiveReplies(int minCount,
                                                int maxCount,
                                                Duration maxWait);

    public boolean waitForReplies(
        int minCount,
        Duration maxWait);

    public boolean waitForReplies(Duration maxWait);

    public boolean waitForReplies(
        int minCount,
        Duration maxWait,
        SampleIdentity relatedRequestId);

    public Sample<TRep> takeReply();

    public Sample<TRep> takeReply(SampleIdentity relatedRequestId);

    public Sample.Iterator<TRep> takeReplies(int maxCount);

    public Sample.Iterator<TRep> takeReplies(
        int maxCount, 
        SampleIdentity relatedRequestId);

    public Sample.Iterator<TRep> takeReplies(
        SampleIdentity relatedRequestId);

    public Sample<TRep> readReply();

    public Sample<TRep> readReply( 
        SampleIdentity relatedRequestId);

    public Sample.Iterator<TRep> readReplies(int maxCount);

    public Sample<TRep> readReplies(
        int maxCount, 
        SampleIdentity relatedRequestId);

    public Sample<TRep> readReplies(
        SampleIdentity relatedRequestId);

    public DataWriter<TReq> getRequestDatawriter();

    public DataReader<TRep> getReplyDatareader();

    public RequesterParams getRequesterParams();

    public void setDatawriterQos(DataWriterQos dwqos);

    public void setDatareaderQos(DataReaderQos drqos);
    
    public void waitForReplier(int howmany, Duration maxWait);

    public void waitForReplier(
      String instanceName, 
      Duration maxWait);

    public boolean bind(String instanceName);
    
    boolean unbind();
    
    boolean isBound();

    String boundInstance();

    void enableNondataSamples();
}
