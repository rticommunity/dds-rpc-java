package org.omg.dds.rpc;

import java.util.concurrent.Future;

import org.omg.dds.core.Duration;
import org.omg.dds.pub.DataWriter;
import org.omg.dds.rpc.Sample;
import org.omg.dds.sub.DataReader;
import org.omg.dds.core.SampleIdentity;

import java.util.concurrent.ExecutorService;

/* Note: Requester<TReq, TRep> does not extend 
 *       ClientEndpoint<TReq, TRep> because 
 *       getClientParams must be moved elsewhere.
 *       As a result, obtaining ClientParams from
 *       a ClientEndpoint becomes very hard.
 */
public interface Requester<TReq, TRep> extends ServiceProxy 
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

    boolean receiveNondataSamples(boolean enable);

    public RequesterParams getRequesterParams();
    
    public DataWriter<TReq> getRequestDataWriter();

    public DataReader<TRep> getReplyDataReader();

}
