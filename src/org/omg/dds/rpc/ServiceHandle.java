package org.omg.dds.rpc;

import java.io.Closeable;

public interface ServiceHandle extends Closeable {

    public void unregister();

    public void pause();
    
    public void resume();
    
    public ServiceStatus status();
    
}
