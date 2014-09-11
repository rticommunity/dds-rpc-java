package org.omg.dds.rpc;

import java.util.concurrent.Future;

import org.omg.dds.pub.DataWriter;
import org.omg.dds.pub.DataWriterQos;
import org.omg.dds.sub.DataReader;
import org.omg.dds.sub.DataReaderQos;

public interface RPCClientEndpoint<TReq, TRep> extends RPCEntity {

    public DataWriter<TReq> getRequestDataWriter();

    public DataReader<TRep> getReplyDataReader();
    
    public void setDatawriterQos(DataWriterQos dwqos);

    public void setDatareaderQos(DataReaderQos drqos);

    public void bind(String instanceName);
    
    public void unbind();
    
    public boolean isBound();
    
    public String getBoundInstance();
    
    public boolean waitForService();
    
    public boolean waitForServiceInstance(String instanceName);
    
    public boolean waitForServices(int count);
    
    public boolean waitForServiceInstances(String... instanceNames);
    
    public Future<Boolean> waitForServiceAsync();
    
    public Future<Boolean> waitForInstanceAsync(String instanceName);
    
    public Future<Boolean> waitForServicesAsync(int count);
    
    public Future<Boolean> waitForInstancesAsync(String... instanceNames);
        
    void enableNondataSamples();

}
