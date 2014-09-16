package org.omg.dds.rpc;

import java.util.EventListener;

import org.omg.dds.rpc.Sample;
import org.omg.dds.core.SampleIdentity;

public interface SimpleRequesterListener<TRep> extends EventListener {

	public void process_reply(Sample<TRep> sample, SampleIdentity identity);
}
