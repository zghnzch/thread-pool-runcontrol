package cn.zch.orderthreadpool;
/**
 * @author atlas
 */
public interface DynamicIntervalTask extends Runnable {
	/**
	 * be re-scheduled
	 * @return the next scheduled interval in ms. If <= 0 the task will not
	 */
	long nextInterval();
}