package org.omg.dds.rpc;

import org.omg.dds.core.SampleIdentity;
import org.omg.dds.rpc.Sample;

public interface SimpleReplierListener<TReq, TRep> extends ListenerBase {

	public TRep processRequest(Sample<TReq> request, SampleIdentity identity);
}
