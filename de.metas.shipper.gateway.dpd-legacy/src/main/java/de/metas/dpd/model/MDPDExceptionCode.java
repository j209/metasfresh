package de.metas.dpd.model;

/*
 * #%L
 * de.metas.swat.base
 * %%
 * Copyright (C) 2015 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */


import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.Query;

public class MDPDExceptionCode extends X_DPD_ExceptionCode
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3247349701045169147L;

	public MDPDExceptionCode(Properties ctx, int DPD_ExceptionCode_ID,
			String trxName)
	{
		super(ctx, DPD_ExceptionCode_ID, trxName);
	}

	public MDPDExceptionCode(Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}

	public static MDPDExceptionCode retrieve(final Properties ctx,
			final int codeNo, final String trxName)
	{

		final String whereClause = COLUMNNAME_CodeNo + "=?";

		final Object[] parameters = { codeNo };

		return new Query(ctx, Table_Name, whereClause, trxName).setParameters(
				parameters).setOnlyActiveRecords(true).firstOnly();
	}

}
