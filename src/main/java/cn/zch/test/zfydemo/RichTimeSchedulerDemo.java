package cn.zch.test.zfydemo;
import cn.zch.orderthreadpool.ExecutorUtil;
/**
 * @author zch
 */
public class RichTimeSchedulerDemo {
	public static void main(String[] args) {
		//userId :1 ~ 10
		int userCount = 10;
		//任务id：1-100
		int jobCount = 100;
		for (int jobId = 1; jobId <= jobCount; jobId++) {
			int randomUser = Util.random(1, userCount);
			execute(randomUser, jobId);
		}
	}
	private static void execute(Integer userId, Integer jobId) {
		ExecutorUtil.getInstance().executeSequentially("U#" + userId, new UserJob(userId, jobId));
	}
}
