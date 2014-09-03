package org.omg.dds.rpc;

import org.omg.dds.rpc.RequesterListener;
import org.omg.dds.rpc.SimpleRequesterListener;
import org.omg.dds.domain.DomainParticipant;
import org.omg.dds.sub.Subscriber;
import org.omg.dds.sub.DataReaderQos;
import org.omg.dds.pub.Publisher;
import org.omg.dds.pub.DataWriterQos;

public interface RequesterParams {
	
    public <TRep> RequesterParams simpleRequesterListener (
        SimpleRequesterListener<TRep> listener);

    public <TReq, TRep> RequesterParams requesterListener (
        RequesterListener<TReq, TRep> listener);

    public RequesterParams withDomainParticipant(DomainParticipant participant);
    public RequesterParams withServiceName (String name);
    public RequesterParams withRequestTopicName (String name);
    public RequesterParams withreplyTopicName (String name);
    public RequesterParams withDataWriterQos (DataWriterQos qos);
    public RequesterParams withDataReaderQos (DataReaderQos qos);
    public RequesterParams withPublisher (Publisher publisher);
    public RequesterParams withSubscriber (Subscriber subscriber);

    public DomainParticipant getDomainParticipant();
    public ListenerBase getSimpleRequesterListener();
    public ListenerBase getRequesterListener();
    public String getServiceName();
    public String getRequestTopicName();
    public String getReplyTopicName();
    public DataWriterQos getDataWriterQos();
    public DataReaderQos getDataReaderQos();
    public Publisher getPublisher();
    public Subscriber getSubscriber();

}
