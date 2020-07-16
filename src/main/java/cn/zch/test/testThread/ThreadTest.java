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
		// t.testTask();
		t.testTaskB();
	}
	private void testTask() {
		try {
			for (int i = 0; i < 50; i++) {
				ExecutorUtil.getInstance().executeSequentially("U#A", new TaskThread("A", i));
				// ExecutorUtil.getInstance().executeSequentially("U#B", new TaskThread("B", i));
			}
			Thread.sleep(1000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void testTaskB() {
		try {
			for (int i = 0; i < 50; i++) {
				Thread t = new Thread(new TaskThread("A", i));
				t.start();
//				Thread t2 = new Thread(new TaskThread("B", i));
//				t2.start();
			}
			Thread.sleep(1000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}