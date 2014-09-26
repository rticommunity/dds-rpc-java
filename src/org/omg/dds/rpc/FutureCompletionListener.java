package org.omg.dds.rpc;

import java.util.EventListener;

public interface FutureCompletionListener<T> extends EventListener {

    void onComplete(org.omg.dds.rpc.Future<T> future);
    
}
