package com.demo.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;


public class WordModeUtil {
	
	private WordModeUtil (){}
	
	public static String createDocument(Map<String, Object> dataMap, String modelName) throws Exception{
		Configuration cfg = new Configuration();
		cfg.setDefaultEncoding("utf-8");
		cfg.setClassForTemplateLoading(WordModeUtil.class.getClass(), "/com/demo/ftl");
		Template t = null;
		t = cfg.getTemplate(modelName);
		File f = new File("c:/mydoc.doc");
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f),"utf-8"));
		t.process(dataMap, out);
		out.flush();
		out.close();
		return f.getName();
	}

}
