package org.omg.dds.rpc;

import java.util.concurrent.ExecutorService;

import org.omg.dds.domain.DomainParticipant;
import org.omg.dds.pub.DataWriterQos;
import org.omg.dds.pub.Publisher;
import org.omg.dds.sub.DataReaderQos;
import org.omg.dds.sub.Subscriber;

public interface ClientParams {

    public ClientParams withDomainParticipant(DomainParticipant participant);
    public ClientParams withPublisher (Publisher publisher);
    public ClientParams withSubscriber (Subscriber subscriber);
    public ClientParams withDataWriterQos (DataWriterQos qos);
    public ClientParams withDataReaderQos (DataReaderQos qos);
    public ClientParams withExecutor(ExecutorService executor);
    
    public DomainParticipant getDomainParticipant();
    public Publisher getPublisher();
    public Subscriber getSubscriber();
    public DataWriterQos getDataWriterQos();
    public DataReaderQos getDataReaderQos();
    public ExecutorService getExecutor();

}
