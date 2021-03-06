package cn.zch.orderthreadpool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
/**
 * @author atlas
 * @date 2013-8-8
 */
public interface TimeScheduler extends ScheduledExecutorService {
	/**
	 * scheduleWithDynamicInterval
	 * @param task DynamicIntervalTask
	 * @return Future<?>
	 */
	Future<?> scheduleWithDynamicInterval(DynamicIntervalTask task);
}
