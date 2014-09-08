package org.omg.dds.rpc;

import java.io.Closeable;

import org.omg.dds.core.DDSObject;
import org.omg.dds.core.Duration;

public interface Client extends RPCObject, Closeable {

    public ClientParams getClientParams();
}
