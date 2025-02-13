package com.s8.io.bohr.neon.core;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.s8.api.bytes.ByteOutflow;
import com.s8.api.serial.S8ExplicitSerialPrototype;
import com.s8.api.serial.S8ExplicitSerializable;
import com.s8.api.web.S8WebObject;
import com.s8.io.bohr.neon.NeException;
import com.s8.io.bohr.neon.fields.NeFieldHandler;
import com.s8.io.bohr.neon.fields.NeFieldUpdate;
import com.s8.io.bohr.neon.fields.arrays.Bool8ArrayNeFieldHandler;
import com.s8.io.bohr.neon.fields.arrays.Float32ArrayNeFieldHandler;
import com.s8.io.bohr.neon.fields.arrays.Float64ArrayNeFieldHandler;
import com.s8.io.bohr.neon.fields.arrays.Int16ArrayNeFieldHandler;
import com.s8.io.bohr.neon.fields.arrays.Int32ArrayNeFieldHandler;
import com.s8.io.bohr.neon.fields.arrays.Int64ArrayNeFieldHandler;
import com.s8.io.bohr.neon.fields.arrays.Int8ArrayNeFieldHandler;
import com.s8.io.bohr.neon.fields.arrays.StringUTF8ArrayNeFieldHandler;
import com.s8.io.bohr.neon.fields.arrays.UInt16ArrayNeFieldHandler;
import com.s8.io.bohr.neon.fields.arrays.UInt32ArrayNeFieldHandler;
import com.s8.io.bohr.neon.fields.arrays.UInt64ArrayNeFieldHandler;
import com.s8.io.bohr.neon.fields.arrays.UInt8ArrayNeFieldHandler;
import com.s8.io.bohr.neon.fields.objects.ExplicitSerializableArrayNeFieldHandler;
import com.s8.io.bohr.neon.fields.objects.ExplicitSerializableNeFieldHandler;
import com.s8.io.bohr.neon.fields.objects.ListNeFieldHandler;
import com.s8.io.bohr.neon.fields.objects.ObjNeFieldHandler;
import com.s8.io.bohr.neon.fields.primitives.Bool8NeFieldHandler;
import com.s8.io.bohr.neon.fields.primitives.Float32NeFieldHandler;
import com.s8.io.bohr.neon.fields.primitives.Float64NeFieldHandler;
import com.s8.io.bohr.neon.fields.primitives.Int16NeFieldHandler;
import com.s8.io.bohr.neon.fields.primitives.Int32NeFieldHandler;
import com.s8.io.bohr.neon.fields.primitives.Int64NeFieldHandler;
import com.s8.io.bohr.neon.fields.primitives.Int8NeFieldHandler;
import com.s8.io.bohr.neon.fields.primitives.StringUTF8NeFieldHandler;
import com.s8.io.bohr.neon.fields.primitives.UInt16NeFieldHandler;
import com.s8.io.bohr.neon.fields.primitives.UInt32NeFieldHandler;
import com.s8.io.bohr.neon.fields.primitives.UInt64NeFieldHandler;
import com.s8.io.bohr.neon.fields.primitives.UInt8NeFieldHandler;



/**
 * 
 * 
 * @author Pierre Convert
 * Copyright (C) 2022, Pierre Convert. All rights reserved.
 *
 */
public class NeObjectTypeFieldsBlock {

	public final NeObjectTypeHandler prototype;
	
	
	private NeFieldHandler[] fieldComposers;

	
	private Map<String, NeFieldHandler> fieldComposersByName;

	

	public NeObjectTypeFieldsBlock(NeObjectTypeHandler prototype) {
		super();
		this.prototype = prototype;
		
		this.fieldComposers = new NeFieldHandler[2];
		fieldComposersByName = new HashMap<>();
	}




	public final static String RUNTIME_MODFICATION_ERROR_MESSAGE = "Prototype can only be edited at compile time";


	

	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 */
	public Bool8NeFieldHandler getBool8Field(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != Bool8NeFieldHandler.SIGNATURE) { throw new NeException("Cannot change field signature"); }
			return (Bool8NeFieldHandler) field;
		}
		else {
			Bool8NeFieldHandler newField = new Bool8NeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}




	public Bool8ArrayNeFieldHandler getBool8ArrayField(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != Bool8ArrayNeFieldHandler.SIGNATURE) { throw new NeException("Cannot change field signature"); }
			return (Bool8ArrayNeFieldHandler) field;
		}
		else {
			Bool8ArrayNeFieldHandler newField = new Bool8ArrayNeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}



	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 */
	public UInt8NeFieldHandler getUInt8Field(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != UInt8NeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (UInt8NeFieldHandler) field;
		}
		else {
			UInt8NeFieldHandler newField = new UInt8NeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}



	public UInt8ArrayNeFieldHandler getUInt8ArrayField(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != UInt8ArrayNeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (UInt8ArrayNeFieldHandler) field;
		}
		else {
			UInt8ArrayNeFieldHandler newField = new UInt8ArrayNeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}

	

	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 */
	public UInt16NeFieldHandler getUInt16Field(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != UInt16NeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (UInt16NeFieldHandler) field;
		}
		else {
			UInt16NeFieldHandler newField = new UInt16NeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}




	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 */
	public UInt16ArrayNeFieldHandler getUInt16ArrayField(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != UInt16ArrayNeFieldHandler.SIGNATURE) { throw new NeException("Cannot change field signature"); }
			return (UInt16ArrayNeFieldHandler) field;
		}
		else {
			UInt16ArrayNeFieldHandler newField = new UInt16ArrayNeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}

	



	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 */
	public UInt32NeFieldHandler getUInt32Field(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != UInt32NeFieldHandler.SIGNATURE) { throw new NeException("Cannot change field signature"); }
			return (UInt32NeFieldHandler) field;
		}
		else {
			UInt32NeFieldHandler newField = new UInt32NeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}
	




	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 */
	public UInt32ArrayNeFieldHandler getUInt32ArrayField(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != UInt32ArrayNeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (UInt32ArrayNeFieldHandler) field;
		}
		else {
			UInt32ArrayNeFieldHandler newField = new UInt32ArrayNeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}
	



	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 * @throws NeException 
	 */
	public UInt64NeFieldHandler getUInt64Field(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != UInt64NeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (UInt64NeFieldHandler) field;
		}
		else {
			UInt64NeFieldHandler newField = new UInt64NeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}



	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 * @throws NeException 
	 */
	public UInt64ArrayNeFieldHandler getUInt64ArrayField(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != UInt64ArrayNeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (UInt64ArrayNeFieldHandler) field;
		}
		else {
			UInt64ArrayNeFieldHandler newField = new UInt64ArrayNeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}






	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 * @throws NeException 
	 */
	public Int8NeFieldHandler getInt8Field(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != Int8NeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (Int8NeFieldHandler) field;
		}
		else {
			Int8NeFieldHandler newField = new Int8NeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}
	

	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 * @throws NeException 
	 */
	public Int8ArrayNeFieldHandler getInt8ArrayField(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != Int8ArrayNeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (Int8ArrayNeFieldHandler) field;
		}
		else {
			Int8ArrayNeFieldHandler newField = new Int8ArrayNeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}

	


	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 * @throws NeException 
	 */
	public Int16NeFieldHandler getInt16Field(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != Int16NeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (Int16NeFieldHandler) field;
		}
		else {
			Int16NeFieldHandler newField = new Int16NeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}


	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 * @throws NeException 
	 */
	public Int16ArrayNeFieldHandler getInt16ArrayField(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != Int16ArrayNeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (Int16ArrayNeFieldHandler) field;
		}
		else {
			Int16ArrayNeFieldHandler newField = new Int16ArrayNeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}


	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 * @throws NeException 
	 */
	public Int32NeFieldHandler getInt32Field(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != Int32NeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (Int32NeFieldHandler) field;
		}
		else {
			Int32NeFieldHandler newField = new Int32NeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}


	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 * @throws NeException 
	 */
	public Int32ArrayNeFieldHandler getInt32ArrayField(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != Int32ArrayNeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (Int32ArrayNeFieldHandler) field;
		}
		else {
			Int32ArrayNeFieldHandler newField = new Int32ArrayNeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}


	

	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 * @throws NeException 
	 */
	public Int64NeFieldHandler getInt64Field(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != Int64NeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (Int64NeFieldHandler) field;
		}
		else {
			Int64NeFieldHandler newField = new Int64NeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}

	

	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 * @throws NeException 
	 */
	public Int64ArrayNeFieldHandler getInt64ArrayField(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != Int64ArrayNeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (Int64ArrayNeFieldHandler) field;
		}
		else {
			Int64ArrayNeFieldHandler newField = new Int64ArrayNeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}



	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 * @throws NeException 
	 */
	public Float32NeFieldHandler getFloat32Field(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != Float32NeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (Float32NeFieldHandler) field;
		}
		else {
			Float32NeFieldHandler newField = new Float32NeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}


	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 * @throws NeException 
	 */
	public Float32ArrayNeFieldHandler getFloat32ArrayField(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != Float32ArrayNeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (Float32ArrayNeFieldHandler) field;
		}
		else {
			Float32ArrayNeFieldHandler newField = new Float32ArrayNeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}



	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 * @throws NeException 
	 */
	public Float64NeFieldHandler getFloat64Field(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != Float64NeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (Float64NeFieldHandler) field;
		}
		else {
			Float64NeFieldHandler newField = new Float64NeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}


	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 * @throws NeException 
	 */
	public Float64ArrayNeFieldHandler getFloat64ArrayField(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != Float64ArrayNeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (Float64ArrayNeFieldHandler) field;
		}
		else {
			Float64ArrayNeFieldHandler newField = new Float64ArrayNeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}




	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 * @throws NeException 
	 */
	public StringUTF8NeFieldHandler getStringUTF8Field(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != StringUTF8NeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature: "+field.getSignature());
			}

			return (StringUTF8NeFieldHandler) field;
		}
		else {
			StringUTF8NeFieldHandler newField = new StringUTF8NeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}




	/**
	 * 
	 * @param name
	 * @return
	 * @throws NeException 
	 * @throws NeException 
	 */
	public StringUTF8ArrayNeFieldHandler getStringUTF8ArrayField(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != StringUTF8ArrayNeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (StringUTF8ArrayNeFieldHandler) field;
		}
		else {
			StringUTF8ArrayNeFieldHandler newField = new StringUTF8ArrayNeFieldHandler(this, name);
			appendField(newField);
			return newField;
		}
	}





	public ExplicitSerializableNeFieldHandler getSerializableField(
			String name, 
			S8ExplicitSerialPrototype<?> serialProto) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != ExplicitSerializableNeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			
			ExplicitSerializableNeFieldHandler sField = (ExplicitSerializableNeFieldHandler) field;
			if(sField.getSerialPrototype() != serialProto) { 
				throw new NeException("Cannot change type of serial"); }
			
			return sField;
		}
		else {
			if(serialProto == null) { throw new NeException("Cannot cdefine field without a non null serial proto"); }
			ExplicitSerializableNeFieldHandler newField = new ExplicitSerializableNeFieldHandler(this, name, serialProto);
			appendField(newField);
			return newField;
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public <S extends S8ExplicitSerializable> ExplicitSerializableArrayNeFieldHandler<S> getSerializableArrayField(
			String name, 
			S8ExplicitSerialPrototype<S> serialProto) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != ExplicitSerializableArrayNeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (ExplicitSerializableArrayNeFieldHandler<S>) field;
		}
		else {
			if(serialProto == null) { throw new NeException("Cannot cdefine field without a non null serial proto"); }
			ExplicitSerializableArrayNeFieldHandler<S> newField = 
					new ExplicitSerializableArrayNeFieldHandler<S>(this, name, serialProto);
			appendField(newField);
			return newField;
		}
	}



	@SuppressWarnings("unchecked")
	public <T extends S8WebObject> ObjNeFieldHandler<T> getObjField(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != ObjNeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (ObjNeFieldHandler<T>) field;
		}
		else {
			ObjNeFieldHandler<T> newField = new ObjNeFieldHandler<T>(this, name);
			appendField(newField);
			return newField;
		}
	}



	@SuppressWarnings("unchecked")
	public <T extends S8WebObject> ListNeFieldHandler<T> getObjArrayField(String name) throws NeException {
		NeFieldHandler field = fieldComposersByName.get(name);
		if(field != null) {
			if(field.getSignature() != ListNeFieldHandler.SIGNATURE) { 
				throw new NeException("Cannot change field signature"); }
			return (ListNeFieldHandler<T>) field;
		}
		else {
			ListNeFieldHandler<T> newField = new ListNeFieldHandler<T>(this, name);
			appendField(newField);
			return newField;
		}
	}


	/**
	 * 
	 * @param field
	 */
	private void appendField(NeFieldHandler field) {
		int position = fieldComposers.length;
		field.ordinal = position;
		field.code = position;

		NeFieldHandler[] extended = new NeFieldHandler[position+1];
		for(int i=0; i<position; i++) {
			extended[i] = fieldComposers[i];
		}
		extended[position] = field;
		fieldComposers = extended;

		if(fieldComposersByName.containsKey(field.name)) {
			System.err.println("NE_COMPILE_ERROR: name conflict: "+field.name);
		}

		fieldComposersByName.put(field.name, field);
	}





	/**
	 * 
	 * @param object
	 * @param outflow
	 * @throws IOException
	 */
	public void publishFields(NeFieldUpdate[] updates, ByteOutflow outflow) throws IOException {


		int n = updates.length;

		NeFieldUpdate update;
		for(int i =0; i < n; i++) {

			if((update = updates[i]) != null) {

				/* field handler */
				NeFieldHandler field = update.getFieldHandler();

				/* declare field (if not already done) */
				field.declare(outflow);

				/* publish entry */
				update.publishEntry(field.code, outflow);
			}
		}
	}


}
