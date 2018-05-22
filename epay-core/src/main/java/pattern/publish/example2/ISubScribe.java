package pattern.publish.example2;

public interface ISubScribe {
	/**
	 * 被通知的方法
	 * @param subject 传入被观察的目标对象
	 */
	public void update(WaterQualifyPublish subject);
	/**
	 * 设置观察人员的职务
	 * @param job 观察人员的职务
	 */
	public void setJob(String job);
	/**
	 * 获取观察人员的职务
	 * @return 观察人员的职务
	 */
	public String getJob();
}