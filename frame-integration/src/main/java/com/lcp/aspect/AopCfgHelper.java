package com.lcp.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;

import com.lcp.datasource.DataSourceSwithUtil;

@Aspect
public class AopCfgHelper {
	
	private String defDataSourceKey;
	
	private Logger log=Logger.getLogger(AopCfgHelper.class);
	
//	@Value("#{propertiesReader['SYS.DEFAULT_DATASOURCE']}")
//	public void setDefDataSourceKey(String defDataSourceKey) {
//		this.defDataSourceKey = defDataSourceKey;
//	}

	public String getDefDataSourceKey() {
		return defDataSourceKey;
	}

	public void setDefDataSourceKey(String defDataSourceKey) {
		this.defDataSourceKey = defDataSourceKey;
	}

	public void doBefore(JoinPoint joinPoint) throws Throwable {
		log.info("doBefore start...");
		switchDatasource(joinPoint);
	}

	public void doAfter(JoinPoint joinPoint) throws Throwable {
		log.info("doAfter start...");
	}

	/**
	 * 数据库切库
	 * @param joinPoint 所有参数
	 */
	public void switchDatasource(JoinPoint joinPoint){
		Object[] params=joinPoint.getArgs();
		if (params!=null && params.length>0 &&params[0]!=null &&params[0] instanceof String) {
			String dataSourceKey=params[0].toString();
			DataSourceSwithUtil.setDataSourceByKey(dataSourceKey);
		}else{
			DataSourceSwithUtil.setDataSourceByKey(defDataSourceKey);
		}
	}


}
