package cn.zch.test.zfydemo;
import java.util.Random;
/***
 * @class Util
 * @description TODO
 * @author zch
 * @date 2019/9/26
 * @version V0.0.1.201909261027.01
 * @modfiyDate 201909261027
 * @createDate 201909261027
 * @package com.zfy.locktest.zfydemo
 */
class Util {
	private static Random random = new Random();
	static int random(int from, int range) {
		return from + random.nextInt(range);
	}
}
