package cn.zch.test.testThread;
import cn.zch.orderthreadpool.ExecutorUtil;
import org.omg.PortableServer.THREAD_POLICY_ID;
/***
 * @class ThreadTest
 * @description TODO
 * @author zch
 * @date 2019/9/26
 * @version V0.0.1.201909261000.01
 * @modfiyDate 201909261000
 * @createDate 201909261000
 * @package com.zfy.locktest
 */
public class ThreadTest {
	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		t.testTask();
	}
	private void testTask() {
		for (int i = 0; i < 3; i++) {
			try {
				ExecutorUtil.getInstance().executeSequentially("U#A", new TaskThread("A"));
				ExecutorUtil.getInstance().executeSequentially("U#B", new TaskThread("B"));
				Thread.sleep(100);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
