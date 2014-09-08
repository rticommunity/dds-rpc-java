package org.omg.dds.rpc;

import java.io.Closeable;
import java.io.IOException;

public abstract class ServiceImplBase implements Closeable {

    private ServiceParams serviceParams;
    
    public final ServiceParams getServiceParams()
    {
        return serviceParams;
    }
    
    public final void setServiceParams(ServiceParams params)
    {
        serviceParams = params;
    }
    
    public abstract void activate();    
    
    // Use Closeable.close in place of deactivate
    public abstract void close() throws IOException;

}
