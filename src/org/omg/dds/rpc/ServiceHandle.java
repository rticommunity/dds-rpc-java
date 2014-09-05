package org.omg.dds.rpc;

public interface ServiceHandle {

    public void unregister();

    public void pause();
    
    public void resume();
    
    public ServiceStatus status();
    
}
