package org.omg.dds.rpc;

import org.omg.dds.rpc.Replier;

public interface ReplierListener<TReq, TRep> extends ListenerBase {

	public void onRequestAvailable(Replier<TReq, TRep> replier);
}
