package org.omg.dds.rpc;

import java.util.EventListener;
import org.omg.dds.rpc.Replier;

public interface ReplierListener<TReq, TRep> extends EventListener {

	public void onRequestAvailable(Replier<TReq, TRep> replier);
}
