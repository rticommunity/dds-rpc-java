package org.omg.dds.rpc;

import org.omg.dds.domain.DomainParticipant;
import org.omg.dds.sub.Subscriber;
import org.omg.dds.sub.DataReaderQos;
import org.omg.dds.pub.Publisher;
import org.omg.dds.pub.DataWriterQos;

public interface ServiceParams {
    
    public ServiceParams withDomainParticipant(DomainParticipant participant);
    public ServiceParams withServiceName (String name);
    public ServiceParams withInstanceName (String name);
    public ServiceParams withRequestTopicName (String name);
    public ServiceParams withReplyTopicName (String name);
    public ServiceParams withDataWriterQos (DataWriterQos qos);
    public ServiceParams withDataReaderQos (DataReaderQos qos);
    public ServiceParams withPublisher (Publisher publisher);
    public ServiceParams withSubscriber (Subscriber subscriber);

    public DomainParticipant getDomainParticipant();
    public String getServiceName();
    public String getInstanceName(); 
    public String getRequestTopicName();
    public String getReplyTopicName();
    public DataWriterQos getDataWriterQos();
    public DataReaderQos getDataReaderQos();
    public Publisher getPublisher();
    public Subscriber getSubscriber();

    public ServiceParams clone();
}
