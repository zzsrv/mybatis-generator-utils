package net.javaw.example.model.enums;

/**
 * 
 * ICP备案状态
 * 
 * @author Helios
 * @date 2014年11月20日 下午2:46:51
 * 
 */
public enum IcpStatus
{
	// ICP状态：0：初始状态；1：提交中；2：审核拒绝；3：审核通过
	INIT(0, "初始状态"), SUBMIT(1, "提交中"), REJECT(2, "审核拒绝"), SUCCESS(3, "审核通过");

	int code;

	String text;



	IcpStatus(int code, String text)
	{
		this.code = code;
		this.text = text;
	}



	/**
	 * @return the code
	 */
	public int getCode()
	{
		return code;
	}



	/**
	 * @return the text
	 */
	public String getText()
	{
		return text;
	}
}
