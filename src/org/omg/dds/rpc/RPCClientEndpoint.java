package org.omg.dds.rpc;

import java.util.concurrent.Future;

import org.omg.dds.pub.DataWriter;
import org.omg.dds.sub.DataReader;
import org.omg.dds.core.Duration;

public interface RPCClientEndpoint<TReq, TRep> extends RPCEntity {

    public DataWriter<TReq> getRequestDataWriter();

    public DataReader<TRep> getReplyDataReader();
    

    
    public boolean bind(String instanceName);
    
    public boolean unbind();
    
    public boolean isBound();
    
    public String getBoundInstanceName();
    
    public String[] getDiscoveredServiceInstances();
    
    
    
    public void waitForService();
    public void waitForService(Duration maxWait);
    
    public void waitForService(String instanceName);
    public void waitForService(Duration maxWait, String instanceName);
    
    
    public void waitForServices(int count);
    public void waitForServices(Duration maxWait, int count);
    
    public void waitForServices(String... instanceNames);
    public void waitForServices(Duration maxWait, String... instanceNames);
    
    
    
    public Future<Boolean> waitForServiceAsync();
    
    public Future<Boolean> waitForServiceAsync(String instanceName);
    
    public Future<Boolean> waitForServicesAsync(int count);
    
    public Future<Boolean> waitForServicesAsync(String... instanceNames);
        
}
