package org.omg.dds.rpc;

import org.omg.dds.rpc.ReplierListener;
import org.omg.dds.rpc.SimpleReplierListener;
import org.omg.dds.domain.DomainParticipant;
import org.omg.dds.sub.Subscriber;
import org.omg.dds.sub.DataReaderQos;
import org.omg.dds.pub.Publisher;
import org.omg.dds.pub.DataWriterQos;

public interface ReplierParams {
	
    public <TReq, TRep> ReplierParams simpleReplierListener (
        SimpleReplierListener<TReq, TRep> listener);

    public <TReq, TRep> ReplierParams replierListener (
        ReplierListener<TReq, TRep> listener);

    public ReplierParams withDomainParticipant(DomainParticipant participant);
    public ReplierParams withServiceName (String name);
    public ReplierParams withInstanceName (String name);
    public ReplierParams withRequestTopicName (String name);
    public ReplierParams withReplyTopicName (String name);
    public ReplierParams withDataWriterQos (DataWriterQos qos);
    public ReplierParams withDataReaderQos (DataReaderQos qos);
    public ReplierParams withPublisher (Publisher publisher);
    public ReplierParams withSubscriber (Subscriber subscriber);

    public DomainParticipant getDomainParticipant();
    public ListenerBase getSimpleRequesterListener();
    public ListenerBase getRequesterListener();
    public String getServiceName();
    public String getInstanceName(); 
    public String getRequestTopicName();
    public String getReplyTopicName();
    public DataWriterQos getDataWriterQos();
    public DataReaderQos getDataReaderQos();
    public Publisher getPublisher();
    public Subscriber getSubscriber();

    public ReplierParams clone();
}
