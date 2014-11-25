/*
 * @(#)Page.java 创建于 2014年6月12日 
 * 
 * Copyright (c) 2014-2016 by JavaW.  
 *
 */
package net.javaw.mybatis.generator;

/**
 * 
 * 分页对象
 * 
 * @author Helios
 * @date 2014年11月20日 下午1:53:09
 * 
 */

public class Page
{

	// 分页查询开始记录位置
	private int begin;

	// 分页查询结束记录位置
	private int end;

	// 每页显示记录数
	private int length;

	// 查询结果总记录数
	private int count;

	// 当前页码
	private int current;

	// 总共页数
	private int total;



	/**
	 * 
	 * 构造函数
	 * 
	 * 默认构造从
	 */
	public Page()
	{
		this.begin = 0;
		this.length = 10;
		this.end = this.begin + this.length;
		this.current = (int) Math.floor((this.begin * 1.0d) / this.length) + 1;
	}



	/**
	 * 
	 * 构造函数
	 * 
	 * @param current
	 *            当前页码
	 */
	public Page(int current)
	{
		this.length = 10;
		this.current = current;
		this.begin = (this.current - 1) * this.length;
		this.end = this.begin + this.length;
	}



	/**
	 * 
	 * 构造函数
	 * 
	 * @param begin
	 *            分页查询开始记录位置
	 * @param length
	 *            分页查询结束记录位置
	 */
	public Page(int begin, int length)
	{
		this.begin = begin;
		this.length = length;
		this.end = this.begin + this.length;
		this.current = (int) Math.floor((this.begin * 1.0d) / this.length) + 1;
	}



	/**
	 * 
	 * 构造函数
	 * 
	 * @param begin
	 *            分页查询开始记录位置
	 * @param length
	 *            分页查询结束记录位置
	 * @param count
	 *            查询结果总记录数
	 */
	public Page(int begin, int length, int count)
	{
		this(begin, length);
		this.count = count;
	}



	public int getBegin()
	{
		return begin;
	}



	public int getEnd()
	{
		return end;
	}



	public void setEnd(int end)
	{
		this.end = end;
	}



	public void setBegin(int begin)
	{
		this.begin = begin;
		if (this.length != 0)
		{
			this.current = (int) Math.floor((this.begin * 1.0d) / this.length) + 1;
		}
	}



	public int getLength()
	{
		return length;
	}



	public void setLength(int length)
	{
		this.length = length;
		if (this.begin != 0)
		{
			this.current = (int) Math.floor((this.begin * 1.0d) / this.length) + 1;
		}
	}



	public int getCount()
	{
		return count;
	}



	public void setCount(int count)
	{
		this.count = count;
		this.total = (int) Math.floor((this.count * 1.0d) / this.length);
		if (this.count % this.length != 0)
		{
			this.total++;
		}
	}



	public int getCurrent()
	{
		return current;
	}



	public void setCurrent(int current)
	{
		this.current = current;
	}



	public int getTotal()
	{
		if (total == 0)
		{
			return 1;
		}
		return total;
	}



	public void setTotal(int total)
	{
		this.total = total;
	}

}
