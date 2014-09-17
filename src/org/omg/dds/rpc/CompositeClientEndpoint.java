package org.omg.dds.rpc;

import java.util.Dictionary;

public interface CompositeClientEndpoint extends ClientEndpoint {
    
    public ClientParams getClientParams(Class<?> interfaceType);
    
    public Dictionary<Class<?>, ClientParams> getCompositeClientParams();

}
