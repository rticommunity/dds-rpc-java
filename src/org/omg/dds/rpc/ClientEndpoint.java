package org.omg.dds.rpc;

import java.util.concurrent.Future;
import java.util.Collection;
import org.omg.dds.core.Duration;

public interface ClientEndpoint extends RPCEntity {

    public boolean bind(String instanceName);
    
    public boolean unbind();
    
    public boolean isBound();
    
    public String getBoundInstanceName();
    
    public Collection<String> getDiscoveredServiceInstances();
    
    
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
