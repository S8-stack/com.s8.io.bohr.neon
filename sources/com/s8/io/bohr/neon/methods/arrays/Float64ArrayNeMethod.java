package com.s8.io.bohr.neon.methods.arrays;

import java.io.IOException;

import com.s8.api.bytes.ByteInflow;
import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.web.functions.NeFunction;
import com.s8.api.web.functions.arrays.Float64ArrayNeFunction;
import com.s8.core.bohr.atom.protocol.BOHR_Types;
import com.s8.io.bohr.neon.core.NeBranch;
import com.s8.io.bohr.neon.core.NeObjectTypeMethodsBlock;
import com.s8.io.bohr.neon.methods.NeMethod;

/**
 * 
 *
 * @author Pierre Convert
 * Copyright (C) 2022, Pierre Convert. All rights reserved.
 * 
 */
public class Float64ArrayNeMethod extends NeMethod {


	public interface Lambda {

		public void operate(float[] arg);

	}


	public final static long SIGNATURE = (BOHR_Types.ARRAY << 8) & BOHR_Types.FLOAT64;


	public @Override long getSignature() { return SIGNATURE; }


	/**
	 * 
	 * @param prototype
	 * @param name
	 */
	public Float64ArrayNeMethod(NeObjectTypeMethodsBlock prototype, String name, int ordinal) {
		super(prototype, name, ordinal);
	}


	@Override
	public void run(NeBranch branch, S8AsyncFlow flow, ByteInflow inflow, NeFunction function) throws IOException {
		double[] arg = null;
		int length = (int) inflow.getUInt7x();
		if(length >= 0) {
			arg = new double[length];
			for(int i=0; i<length; i++) { arg[i] = inflow.getFloat64(); }
		
		}
		((Float64ArrayNeFunction) function).run(flow, arg);
	}


}
