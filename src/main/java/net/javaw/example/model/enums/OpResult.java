package net.javaw.example.model.enums;

/**
 * 
 * 操作结果
 * 
 * @author Helios
 * @date 2014年11月20日 下午2:46:16
 * 
 */
public enum OpResult
{
	// 操作结果：初始化状态为插入（init， success， failed，block，manual）：（插入，成功，失败，阻塞，人工）
	INIT("插入"), SUCCESS("成功"), FAILED("失败"), BLOCK("阻塞"), MANUAL("人工");

	String text;



	OpResult(String text)
	{
		this.text = text;
	}



	/**
	 * @return the text
	 */
	public String getText()
	{
		return text;
	}
}
