package org.omg.dds.rpc;

import java.util.Dictionary;

/* To be used only in case of interface inheritance in basic profile */
public interface CompositeServiceEndpoint extends ServiceEndpoint {

    public void pause(Class<?> interfaceType);
    
    public void resume(Class<?> interfaceType);
    
    public ServiceStatus status(Class<?> interfaceType);
    
    public ServiceParams getServiceParams(Class<?> interfaceType);

    public Dictionary<Class<?>, ServiceParams> getCompositeServiceParams();

}
