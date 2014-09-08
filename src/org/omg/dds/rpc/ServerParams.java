package org.omg.dds.rpc;

import org.omg.dds.domain.DomainParticipant;
import org.omg.dds.pub.DataWriterQos;
import org.omg.dds.pub.Publisher;
import org.omg.dds.sub.DataReaderQos;
import org.omg.dds.sub.Subscriber;

import java.util.concurrent.ExecutorService;

public interface ServerParams {

    public ServerParams withDomainParticipant(DomainParticipant participant);
    public ServerParams withPublisher (Publisher publisher);
    public ServerParams withSubscriber (Subscriber subscriber);
    public ServerParams withDataWriterQos (DataWriterQos qos);
    public ServerParams withDataReaderQos (DataReaderQos qos);
    public ServerParams withExecutor(ExecutorService executor);
    
    public DomainParticipant getDomainParticipant();
    public Publisher getPublisher();
    public Subscriber getSubscriber();
    public DataWriterQos getDataWriterQos();
    public DataReaderQos getDataReaderQos();
    public ExecutorService getExecutor();

}
