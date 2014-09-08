package org.omg.dds.rpc;

import java.io.Closeable;
import org.omg.dds.core.DDSObject;
import org.omg.dds.core.Duration;
import java.util.concurrent.ExecutorService;

public interface Server extends RPCObject, Closeable {

    // blocking
    public void run();

    //blocking 
    public void run(ExecutorService executor);
    
    // not blocking
    public void run(Duration maxWait);
    
    public ServerParams getServerParams();
    
    public ServiceHandle registerService(
            ServiceImplBase serviceImpl, 
            String serviceName);

    public ServiceHandle registerService(
            ServiceImplBase serviceImpl,
            ServiceParams params);
}
