package com.xukaiqiang.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.xukaiqiang.entity.Url;

public class StringUtils {
	public static Url getBasicUrl(String url) {

		Url url2 = new Url();
		//包含？
		if (url.indexOf("?") != -1) {
			String[] basicUrl = url.split("\\?");
			url2.setBasicUrl(basicUrl[0].trim().replace("http://localhost:8080", ""));

			String[] keyAndValuesArray = basicUrl[1].split("\\&");
			Map<String, String> values = new HashMap<String, String>();
			for (int i = 0; i < keyAndValuesArray.length; i++) {
				String[] keyAndValue = keyAndValuesArray[i].split("\\=");
				values.put(keyAndValue[0], keyAndValue[1]);
			}
			url2.setValues(values);
		} else {
			url2.setBasicUrl(url);
		}
		return url2;
	}

	public static void main(String[] args) {
		String url = "http://localhost:8080/cb/loanapplypeople/list?apTr=20161207164837&customerNo=qq&applyPepleTypeCode=GS";
		Url urlen = StringUtils.getBasicUrl(url);
		System.out.println(urlen.getBasicUrl());
		for (Entry<String, String> entry : urlen.getValues().entrySet()) {
			System.out.println(entry.getKey() + "======" + entry.getValue());
		}
	}
}
