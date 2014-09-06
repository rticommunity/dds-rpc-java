package org.omg.dds.rpc;

import java.io.Closeable;
import java.io.IOException;

public abstract class ServiceImplBase implements Closeable {

    private ServiceParams serviceParams;
    
    public ServiceParams getServiceParams()
    {
        return serviceParams;
    }
    
    public void activate(ServiceParams params)
    {
        serviceParams = params;
    }    
    
    // Use Closeable.close in place of deactivate
    public abstract void close() throws IOException;

}
