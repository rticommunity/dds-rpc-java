package org.omg.dds.rpc;

import org.omg.dds.rpc.Sample;
import org.omg.dds.core.SampleIdentity;

public interface SimpleRequesterListener<TRep> extends ListenerBase {

	public void process_reply(Sample<TRep> sample, SampleIdentity identity);
}
