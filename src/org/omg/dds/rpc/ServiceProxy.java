package org.omg.dds.rpc;

import java.util.Collection;
import java.util.concurrent.Future;
import org.omg.dds.core.Duration;

public interface ServiceProxy extends RPCEntity {

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
    
    
    
    public Future<Void> waitForServiceAsync();
    
    public Future<Void> waitForServiceAsync(String instanceName);
    
    public Future<Void> waitForServicesAsync(int count);
    
    public Future<Void> waitForServicesAsync(String... instanceNames);
    
}
