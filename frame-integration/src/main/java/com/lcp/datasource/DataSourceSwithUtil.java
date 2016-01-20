package com.lcp.datasource;

public class DataSourceSwithUtil {
	
	private static final ThreadLocal<String> contextHolder=new ThreadLocal<String>();
	
	public static void setDataSourceByKey(String dataSourceKey){
		contextHolder.set(dataSourceKey);
	}
	
	public static String getDataSourceKey(){
		return contextHolder.get();
	}
	
	public static void clearDataSourceKey(){
		contextHolder.remove();
	}

}
