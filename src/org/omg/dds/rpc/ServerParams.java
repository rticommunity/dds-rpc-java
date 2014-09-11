package org.omg.dds.rpc;

import java.util.concurrent.ExecutorService;

public interface ServerParams {

    public ServerParams withDefaultServiceParams(ServiceParams serviceParams);
    public ServerParams withExecutor(ExecutorService executor);
    
    public ServiceParams getDefaultServiceParams();
    public ExecutorService getExecutor();
    
}
