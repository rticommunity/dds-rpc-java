package org.omg.dds.rpc;

import org.omg.dds.core.Duration;

public interface Server extends RPCEntity, Runnable {

    // blocking
    /* from Runnable */
    public void run();
    
    // not blocking
    public void run(Duration maxWait);
    
    public ServiceParams getDefaultServiceParams();
    
}
