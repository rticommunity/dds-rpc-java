package org.omg.dds.rpc;

import org.omg.dds.core.SampleIdentity;

public interface Sample<TYPE> extends org.omg.dds.sub.Sample<TYPE> 
{
	public SampleIdentity	getRelatedIdentity ();
	
	public SampleIdentity 	getIdentity ();
}
