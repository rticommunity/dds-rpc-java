package org.omg.dds.rpc;

import java.io.Closeable;
import org.omg.dds.core.Duration;

import org.omg.dds.core.DDSObject;
import org.omg.dds.rpc.Sample;
import org.omg.dds.rpc.ReplierParams;
import org.omg.dds.core.SampleIdentity;
import org.omg.dds.sub.DataReader;
import org.omg.dds.pub.DataWriter;
import org.omg.dds.sub.DataReaderQos;
import org.omg.dds.pub.DataWriterQos;

public interface Replier<TReq, TRep> 
	extends Closeable, DDSObject 
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

    public DataReader<TReq> getRequestDatareader();

    public DataWriter<TRep> getReplyDatawriter();

    public ReplierParams getParams();

    public void setDatawriterQos(DataWriterQos dwqos);

    public void setDatareaderQos(DataReaderQos drqos);

    void enableNondataSamples();
}
