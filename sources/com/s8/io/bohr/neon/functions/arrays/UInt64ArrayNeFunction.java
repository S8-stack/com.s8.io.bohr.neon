package com.s8.io.bohr.neon.functions.arrays;

import com.s8.io.bohr.atom.BOHR_Types;
import com.s8.io.bohr.neon.functions.NeFunction;

/**
 * 
 * @author pierreconvert
 *
 */
public interface UInt64ArrayNeFunction extends NeFunction {

	
	public final static long SIGNATURE = (BOHR_Types.ARRAY << 8) & BOHR_Types.UINT64;

	public @Override default long getSignature() { return SIGNATURE; }
	
	
	/**
	 * 
	 * @param arg
	 */
	public abstract void run(Object context, long[] arg);
	
}

