package org.omg.dds.rpc;

import java.util.EventListener;

import org.omg.dds.core.SampleIdentity;
import org.omg.dds.rpc.Sample;

public interface SimpleReplierListener<TReq, TRep> extends EventListener {

	public TRep processRequest(Sample<TReq> request, SampleIdentity identity);
}
