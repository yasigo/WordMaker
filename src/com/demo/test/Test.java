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
		map.put("name", "����");
		map.put("sex", "��");
		map.put("folk", "��");
		map.put("place", "����");
		map.put("birthday", "��<w:p></w:p>��");
		map.put("height", "����");
		map.put("major", "����");
		map.put("education", "����");
		map.put("college", "����");
		map.put("tel", "����");
		map.put("email", "����");
		map.put("language", "����");
		map.put("computer", "����");
		map.put("jobs", "����");
		
		map.put("skills", "��������SSM��ܵ�Java��������");
		map.put("introduce", "�Ȱ�����ϲ��������");
		
		map.put("tracks", "placeholder");
//		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
//		Map<String, Object> t1 = new HashMap<>();
//		Map<String, Object> t2 = new HashMap<>();
//		Map<String, Object> t3 = new HashMap<>();
//		t1.put("number", 1);
//		t1.put("content", "2010.7-2011.7 XXX����   ����������ʦ");
//		t1.put("number", 2);
//		t1.put("content", "2011.7-2014.3 XXX���޹�˾   �߼��������ʦ");
//		t1.put("number", 3);
//		t1.put("content", "2014.4-  XXX�ɷ����޹�˾   �߼��������ʦ");
//		
//		list.add(t1);
//		list.add(t2);
//		list.add(t3);
//		map.put("tracks", list);
		
		
		
		return map;
	}
	
	public static Map<String, Object> getDataMap2(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ename", "����");
		map.put("birthday", "1992-2-12");
		map.put("sex", "��");
		map.put("college", "������ѧ");
		return map;
	}

}
