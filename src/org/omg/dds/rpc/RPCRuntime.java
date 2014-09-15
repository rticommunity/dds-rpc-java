package org.omg.dds.rpc;

import org.omg.dds.core.ServiceEnvironment;

public abstract class RPCRuntime extends ServiceEnvironment {

	// Singleton access
	
	public static RPCRuntime getInstance(ClassLoader classloader)
	{
		// placeholder implementation.
		return null; 
	}
	
    public abstract <TReq, TRep> 
        Requester<TReq, TRep> createRequester(
                Class<TReq> requestType,
                Class<TRep> replyType);

    public abstract <TReq, TRep> 
        Requester<TReq, TRep> createRequester(
                Class<TReq> requestType,
                Class<TRep> replyType,
                RequesterParams params);

    public abstract <TReq, TRep> 
        Replier<TReq, TRep> createReplier(                
                Class<TReq> requestType,
                Class<TRep> replyType);

    public abstract <TReq, TRep> 
        Replier<TReq, TRep> createReplier(
                Class<TReq> requestType,
                Class<TRep> replyType,
                ReplierParams params);

    public abstract Server createServer();
    
    public abstract Server createServer(ServerParams serverParams);
    
    /* createParams methods */
    
    public abstract ServerParams createServerParams();
    
    public abstract ServiceParams createServiceParams();
    
    public abstract ClientParams createClientParams();
    
    public abstract RequesterParams createRequesterParams();
    
    public abstract ReplierParams createReplierParams();
    
}
