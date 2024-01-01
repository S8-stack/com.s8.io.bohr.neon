package com.s8.io.bohr.neon.fields.primitives;

import java.io.IOException;

import com.s8.api.bytes.ByteInflow;
import com.s8.api.bytes.ByteOutflow;
import com.s8.core.bohr.atom.protocol.BOHR_Types;
import com.s8.io.bohr.neon.core.BuildScope;
import com.s8.io.bohr.neon.core.NeObjectTypeFields;
import com.s8.io.bohr.neon.fields.NeFieldHandler;


/**
 * 
 *
 * @author Pierre Convert
 * Copyright (C) 2022, Pierre Convert. All rights reserved.
 * 
 */
public class UInt8NeFieldHandler extends PrimitiveNeFieldHandler {

	
	public final static long SIGNATURE = BOHR_Types.UINT8;

	public @Override long getSignature() { return SIGNATURE; }



	/**
	 * 
	 * @param prototype
	 * @param name
	 */
	public UInt8NeFieldHandler(NeObjectTypeFields prototype, String name) {
		super(prototype, name);
	}


	@Override
	public void publishEncoding(ByteOutflow outflow) throws IOException {
		outflow.putUInt8(BOHR_Types.UINT8);
	}

	
	/**
	 * 
	 * @param values
	 * @param value
	 */
	public Update createUpdate(int value) {
		return new Update(value);
	}
	
	
	/**
	 * 
	 * @author pierreconvert
	 *
	 */
	public class Update extends PrimitiveNeFieldHandler.Update {
		
		private int value;
	
		public Update(int value) {
			super();
			this.value = value;
		}

		
		@Override
		public void compose(ByteOutflow outflow) throws IOException {
			outflow.putUInt8(value);
		}

		
		@Override
		public void parse(ByteInflow inflow, BuildScope scope) throws IOException {
			value = inflow.getUInt8();
		}


		@Override
		public NeFieldHandler getFieldHandler() {
			return UInt8NeFieldHandler.this;
		}
	}
}
