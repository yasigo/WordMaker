package com.demo.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	public static void main(String[] args) throws Exception {
		Map<String, Object> dataMap = getDataMap();
		WordModeUtil.createDocument(dataMap, "model1.ftl");
	}
	
	public static Map<String, Object> getDataMap(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "张三");
		map.put("sex", "男");
		map.put("folk", "汉");
		map.put("place", "张三");
		map.put("birthday", "张<w:p></w:p>三");
		map.put("height", "张三");
		map.put("major", "张三");
		map.put("education", "张三");
		map.put("college", "张三");
		map.put("tel", "张三");
		map.put("email", "张三");
		map.put("language", "张三");
		map.put("computer", "张三");
		map.put("jobs", "张三");
		
		map.put("skills", "熟练掌握SSM框架等Java开发技术");
		map.put("introduce", "热爱技术喜欢交朋友");
		
		map.put("tracks", "placeholder");
//		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
//		Map<String, Object> t1 = new HashMap<>();
//		Map<String, Object> t2 = new HashMap<>();
//		Map<String, Object> t3 = new HashMap<>();
//		t1.put("number", 1);
//		t1.put("content", "2010.7-2011.7 XXX集团   助理开发工程师");
//		t1.put("number", 2);
//		t1.put("content", "2011.7-2014.3 XXX有限公司   高级软件工程师");
//		t1.put("number", 3);
//		t1.put("content", "2014.4-  XXX股份有限公司   高级软件工程师");
//		
//		list.add(t1);
//		list.add(t2);
//		list.add(t3);
//		map.put("tracks", list);
		
		
		
		return map;
	}
	
	public static Map<String, Object> getDataMap2(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ename", "张三");
		map.put("birthday", "1992-2-12");
		map.put("sex", "男");
		map.put("college", "辽宁大学");
		return map;
	}

}
