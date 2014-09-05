package org.omg.dds.rpc;

import java.io.Closeable;
import org.omg.dds.core.DDSObject;
import org.omg.dds.core.Duration;

public interface Client extends Closeable, DDSObject {

    public ServiceProxy resolveService(String serviceName);

    public ServiceProxy
    resolveServiceInstance(
        String serviceName,
        String instanceName);

    public ServiceProxy resolveService(ServiceParams params);

    public ServiceProxy resolveService(String serviceName, Duration maxWait);

    public ServiceProxy
    resolveServiceInstance(
        String serviceName,
        String instanceName,
        Duration maxWait);

    public ServiceProxy resolveService(ServiceParams params, Duration MaxWait);
}
