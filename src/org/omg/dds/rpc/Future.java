package org.omg.dds.rpc;

public interface Future<T> extends java.util.concurrent.Future<T> {

    void withCompletionListener(FutureCompletionListener<T> listener);
    
}
