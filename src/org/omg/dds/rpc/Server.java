package org.omg.dds.rpc;

import java.io.Closeable;
import org.omg.dds.core.DDSObject;
import org.omg.dds.core.Duration;
import java.util.concurrent.ExecutorService;

public interface Server extends DDSObject, Closeable {

    // blocking
    public void run();

    //blocking 
    public void run(ExecutorService executor);
    
    // not blocking
    public void run(Duration maxWait);
    
    public ExecutorService getExecutor();
    
    public ServiceHandle registerService(
            ServiceImplBase serviceImpl, 
            String serviceName);

    public ServiceHandle registerService(
            ServiceImplBase serviceImpl,
            ServiceParams params);
}
