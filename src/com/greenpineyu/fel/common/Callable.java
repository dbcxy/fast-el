package com.greenpineyu.fel.common;

/**
 * 
 * 可调用接口
 * @author yuqingsong
 *
 * @param <R> 参数返回值
 * @param <P> 参数类型
 */
public interface Callable<R,P> {

	R call(P... arg);

}
