/*
 *     This file is part of ToroDB.
 *
 *     ToroDB is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     ToroDB is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with ToroDB. If not, see <http://www.gnu.org/licenses/>.
 *
 *     Copyright (c) 2014, 8Kdata Technology
 *     
 */

package com.torodb.torod.db.postgresql.udt.records;

import com.torodb.torod.db.postgresql.udt.TwelveBytesUDT;
import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UDTRecordImpl;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TwelveBytesRecord extends UDTRecordImpl<TwelveBytesRecord> implements 
        Record3<Integer, Integer, Integer> {

	private static final long serialVersionUID = -103355438;

	/**
	 * Setter for <code>public.twelve_bytes.upper</code>.
	 */
	public void setUpper(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.twelve_bytes.upper</code>.
	 */
	public Integer getUpper() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.twelve_bytes.middle</code>.
	 */
	public void setMiddle(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.twelve_bytes.middle</code>.
	 */
	public Integer getMiddle() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.twelve_bytes.lower</code>.
	 */
	public void setLower(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.twelve_bytes.lower</code>.
	 */
	public Integer getLower() {
		return (Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, Integer> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, Integer> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return TwelveBytesUDT.UPPPER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return TwelveBytesUDT.MIDDLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return TwelveBytesUDT.LOWER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getUpper();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getMiddle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getLower();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TwelveBytesRecord value1(Integer value) {
		setUpper(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TwelveBytesRecord value2(Integer value) {
		setMiddle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TwelveBytesRecord value3(Integer value) {
		setLower(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TwelveBytesRecord values(Integer value1, Integer value2, Integer value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TwelveBytesRecord
	 */
	public TwelveBytesRecord() {
		super(TwelveBytesUDT.TWELVE_BYTES);
	}

	/**
	 * Create a detached, initialised TwelveBytesRecord
	 */
	public TwelveBytesRecord(Integer upper, Integer middle, Integer lower) {
		super(TwelveBytesUDT.TWELVE_BYTES);

		setValue(0, upper);
		setValue(1, middle);
		setValue(2, lower);
	}
}
