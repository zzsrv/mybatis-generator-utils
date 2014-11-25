/*
 * @(#)OpResultTypeHandler.java 创建于 2014年10月31日 
 * 
 * Copyright (c) 2014-2016 by JavaW.  
 *
 */
package net.javaw.example.model.enums.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.javaw.example.model.enums.OpResult;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

/**
 * 
 * OpResultTypeHandler
 * 
 * @author Helios
 * @date 2014年11月20日 下午2:48:18
 * 
 */

public class OpResultTypeHandler implements TypeHandler<OpResult>
{

	@Override
	public OpResult getResult(ResultSet resultSet, String columnName) throws SQLException
	{
		String code = resultSet.getString(columnName);
		return getByCode(code);
	}



	@Override
	public OpResult getResult(ResultSet resultSet, int columnIndex) throws SQLException
	{
		String code = resultSet.getString(columnIndex);
		return getByCode(code);
	}



	@Override
	public OpResult getResult(CallableStatement callableStatement, int columnIndex) throws SQLException
	{
		String code = callableStatement.getString(columnIndex);
		return getByCode(code);
	}



	@Override
	public void setParameter(PreparedStatement preparedStatement, int i, OpResult parameter, JdbcType jdbcType) throws SQLException
	{
		preparedStatement.setString(i, parameter.name());
	}



	private OpResult getByCode(String code)
	{
		for (OpResult tmp : OpResult.values())
		{
			if (tmp.name().equals(code))
			{
				return tmp;
			}
		}
		return null;
	}

}
