package org.omg.dds.core;

public interface SampleIdentity {
  
	@Override
	public boolean equals(Object identity);
	
	@Override
	public int hashCode();
	
	public long guid();
	
	public long sequenceNumber();
}
