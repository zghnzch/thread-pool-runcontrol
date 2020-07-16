package cn.zch.orderthreadpool;
/**
 * @author zchcpy
 */
public class ExecutorUtil {
	public static RichTimeScheduler getInstance() {
		return LazyHolder.INSTANCE;
	}
	private static class LazyHolder {
		private static RichTimeScheduler INSTANCE = MixTimeScheduler.newCachedThreadPool("JobPool");
	}
}
