package org.omg.dds.core;

import java.util.UUID;

public interface SampleIdentity {
  
	@Override
	public boolean equals(Object identity);
	
	@Override
	public int hashCode();
	
	public UUID guid();
	
	public long sequenceNumber();
}
