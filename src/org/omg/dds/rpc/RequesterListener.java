package org.omg.dds.rpc;

import java.util.EventListener;
import org.omg.dds.rpc.Requester;

public interface RequesterListener<TReq, TRep> extends EventListener {

	public void onReplyAvailable(Requester<TReq, TRep> requester);
}
