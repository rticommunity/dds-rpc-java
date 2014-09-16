package org.omg.dds.rpc;

import org.omg.dds.core.DDSObject;
import java.io.Closeable;

public interface RPCEntity extends DDSObject, Closeable {

    public RPCRuntime getRPCRuntime();
    
}
