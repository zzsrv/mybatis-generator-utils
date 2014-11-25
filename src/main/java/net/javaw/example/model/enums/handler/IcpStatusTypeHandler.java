/*
 * @(#)IcpStatusTypeHandler.java 创建于 2014年10月31日 
 * 
 * Copyright (c) 2014-2016 by JavaW. 
 *
 */
package net.javaw.example.model.enums.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.javaw.example.model.enums.IcpStatus;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

/**
 * 
 * IcpStatusTypeHandler
 * 
 * @author Helios
 * @date 2014年11月20日 下午2:48:45
 * 
 */

public class IcpStatusTypeHandler implements TypeHandler<IcpStatus>
{

	@Override
	public IcpStatus getResult(ResultSet resultSet, String columnName) throws SQLException
	{
		int code = resultSet.getInt(columnName);
		return getByCode(code);
	}



	@Override
	public IcpStatus getResult(ResultSet resultSet, int columnIndex) throws SQLException
	{
		int code = resultSet.getInt(columnIndex);
		return getByCode(code);
	}



	@Override
	public IcpStatus getResult(CallableStatement callableStatement, int columnIndex) throws SQLException
	{
		int code = callableStatement.getInt(columnIndex);
		return getByCode(code);
	}



	@Override
	public void setParameter(PreparedStatement preparedStatement, int i, IcpStatus parameter, JdbcType jdbcType) throws SQLException
	{
		preparedStatement.setString(i, parameter.name());
	}



	private IcpStatus getByCode(int code)
	{
		for (IcpStatus tmp : IcpStatus.values())
		{
			if (code == tmp.getCode())
			{
				return tmp;
			}
		}
		return null;
	}
}
