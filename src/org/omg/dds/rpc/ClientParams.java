package org.omg.dds.rpc;

import org.omg.dds.domain.DomainParticipant;
import org.omg.dds.pub.DataWriterQos;
import org.omg.dds.pub.Publisher;
import org.omg.dds.sub.DataReaderQos;
import org.omg.dds.sub.Subscriber;

public interface ClientParams {
    
    public ClientParams withDomainParticipant(DomainParticipant participant);
    public ClientParams withServiceName (String name);
    public ClientParams withInstanceName (String name);
    public ClientParams withRequestTopicName (String name);
    public ClientParams withReplyTopicName (String name);
    public ClientParams withDataWriterQos (DataWriterQos qos);
    public ClientParams withDataReaderQos (DataReaderQos qos);
    public ClientParams withPublisher (Publisher publisher);
    public ClientParams withSubscriber (Subscriber subscriber);

    public DomainParticipant getDomainParticipant();
    public String getServiceName();
    public String getInstanceName(); 
    public String getRequestTopicName();
    public String getReplyTopicName();
    public DataWriterQos getDataWriterQos();
    public DataReaderQos getDataReaderQos();
    public Publisher getPublisher();
    public Subscriber getSubscriber();

    public ClientParams clone();
}
