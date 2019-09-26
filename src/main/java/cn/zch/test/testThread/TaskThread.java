package cn.zch.test.testThread;
import cn.hutool.core.date.DateUtil;
import org.apache.log4j.Logger;
/***
 * @class TastThread
 * @description TODO
 * @author zch
 * @date 2019/9/26
 * @version V0.0.1.201909261001.01
 * @modfiyDate 201909261001
 * @createDate 201909261001
 * @package com.zfy.locktest.testThread
 */
public class TaskThread implements Runnable {
	private final static Logger myLog = Logger.getRootLogger();
	private String masterName;
	TaskThread(String masterName) {
		this.masterName = masterName;
	}
	@Override
	public void run() {
			try {
				Thread.sleep(2000);
				myLog.info(DateUtil.now()+"============"+masterName);
			}
			catch (Exception e) {
				myLog.error(e);
			}
	}
}
