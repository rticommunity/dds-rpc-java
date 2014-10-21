package org.omg.dds.rpc;

import java.util.EventListener;

public interface FutureCompletionListener<T> extends EventListener {

    void onComplete(java.util.concurrent.Future<T> future);
    
}
