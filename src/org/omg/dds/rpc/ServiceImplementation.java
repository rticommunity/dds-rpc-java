package org.omg.dds.rpc;

public abstract class ServiceImplementation {

    protected ServiceParams serviceParams;
    
    public ServiceParams getServiceParams()
    {
        return serviceParams;
    }
    
    public void setServiceParams(ServiceParams params)
    {
        serviceParams = params;
    }
}
