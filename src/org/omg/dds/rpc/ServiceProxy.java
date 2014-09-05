package org.omg.dds.rpc;

import org.omg.dds.rpc.ServiceParams;

public interface ServiceProxy {

    public void bind(String instance_name);
    
    public void unbind();
    
    public boolean isBound();
    
    public String boundInstance();
    
    public ServiceParams serviceParams();
}
