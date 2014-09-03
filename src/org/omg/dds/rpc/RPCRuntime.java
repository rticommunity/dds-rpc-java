package org.omg.dds.rpc;

import org.omg.dds.core.ServiceEnvironment;
import org.omg.dds.core.SampleIdentity;

public abstract class RPCRuntime extends ServiceEnvironment {

	// Singleton access
	
	public static RPCRuntime getInstance(ClassLoader classloader)
	{
		// placeholder implementation.
		return null; 
	}
	
	public abstract <TReq, TRep> Requester<TReq, TRep> createRequester(int domainid);
	
}
