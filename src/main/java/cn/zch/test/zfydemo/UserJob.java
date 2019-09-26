package cn.zch.test.zfydemo;
import org.apache.log4j.Logger;
/***
 * @class sa
 * @description TODO
 * @author zch
 * @date 2019/9/26
 * @version V0.0.1.201909261024.01
 * @modfiyDate 201909261024
 * @createDate 201909261024
 * @package com.zfy.locktest.zfydemo
 */
public class UserJob implements Runnable {
	private Integer userId;
	private Integer jobId;
	private final static Logger myLog = Logger.getRootLogger();
	UserJob(Integer userId, Integer jobId) {
		this.userId = userId;
		this.jobId = jobId;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			myLog.info("User " + userId + " handle job " + jobId);
		}
		catch (InterruptedException e) {
			myLog.error(e);
		}
	}
}
