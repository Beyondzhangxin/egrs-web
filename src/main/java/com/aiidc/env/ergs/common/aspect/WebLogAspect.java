/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aiidc.env.ergs.jpa.po.pw.LogRecord;

/**
 * @author wuwenjun
 *
 */
@Aspect
@Component
public class WebLogAspect {
	@Autowired
	private LogRecordService service;

	@Around("@annotation(log)")
	public Object around(ProceedingJoinPoint pjp, LogAnnotation log) throws Throwable {
		LogRecord record = new LogRecord();
		record.setClassMethod(pjp.getSignature().getDeclaringTypeName() + "." + pjp.getSignature().getName());
		record.setArgs(Arrays.toString(pjp.getArgs()));
		record.setOpName(log.value());
		try {
			Object retVal = pjp.proceed(pjp.getArgs());
			record.setResult(String.valueOf(retVal));
			record.setStatus(1);
			return retVal;
		} catch (Exception e) {
			record.setStatus(2);
			throw e;
		} finally {
			service.save(record);
		}

	}

}
