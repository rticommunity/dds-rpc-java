package org.omg.dds.rpc;

import org.omg.dds.core.Duration;

public interface ServiceProxyBase {
    
    public boolean resolveService(
            Client client,
            String serviceName);

    public boolean resolveServiceInstance(
            Client client,
            String serviceName,
            String instanceName);

    public boolean resolveService(
            Client client,
            ServiceProxyParams params);

    public boolean resolveService(
            Client client,
            String serviceName, 
            Duration maxWait);

    public boolean resolveServiceInstance(
            Client client,
            String serviceName,
            String instanceName,
            Duration maxWait);

    public boolean resolveService(
            Client client,
            ServiceProxyParams params, 
            Duration MaxWait);
        
    public void bind(String instanceName);
    
    public void unbind();
    
    public boolean isBound();
    
    public String getBoundInstance();
    
    public ServiceProxyParams getServiceProxyParams();
}
