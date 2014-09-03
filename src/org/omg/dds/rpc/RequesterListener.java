package org.omg.dds.rpc;

import org.omg.dds.rpc.Requester;

public interface RequesterListener<TReq, TRep> extends ListenerBase {

	public void onReplyAvailable(Requester<TReq, TRep> requester);
}
