/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;

import com.aiidc.env.ergs.service.o3.ReportDetailService;

import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * @author wuwenjun
 *
 */
public abstract class BaseReportDetailServiceImpl implements ReportDetailService {
	@Value("${env.report.path}")
	protected String wordPath;

	@Autowired(required = false)
	private Configuration configuration;

	@Resource(name = "o3JdbcTemplate")
	protected JdbcTemplate jdbcTemplate;

	protected abstract String getTemplete();

	protected abstract String[] getTables();

	@PostConstruct
	public void postConstruct() {
		File file = new File(wordPath);
		if (!file.exists() || file.isFile()) {
			file.mkdirs();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aiidc.env.ergs.service.o3.ReportDetailService#createWord(java.lang.
	 * String)
	 */
	@Override
	public String createWord(String jybgbh) {
		return createWordFile(jybgbh).getAbsolutePath();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aiidc.env.ergs.service.o3.ReportDetailService#hasCreated(java.lang.
	 * String)
	 */
	@Override
	public boolean hasCreated(String jybgbh) {
		File file = new File(wordPath, jybgbh + ".doc");
		if (file.exists() && file.isFile()) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aiidc.env.ergs.service.o3.ReportDetailService#wordPath(java.lang.
	 * String)
	 */
	@Override
	public String wordPath(String jybgbh) {
		return new File(wordPath, jybgbh + ".doc").getAbsolutePath();
	}

	protected File createWordFile(String jybgbh) {
		File file = new File(wordPath, jybgbh + ".doc");
		try {
			Template t = configuration.getTemplate("report/" + getTemplete() + ".xml");
			try {
				// 这个地方不能使用FileWriter因为需要指定编码类型否则生成的Word文档会因为有无法识别的编码而无法打开
				Writer w = new OutputStreamWriter(new FileOutputStream(file), "utf-8");
				t.process(getDataMap(jybgbh), w);
				w.close();
			} catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(ex);
			}
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return file;
	}

	@Override
	public Map<String, Object> getDataMap(String jybgbh) {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		for (String table : getTables()) {
			Map<String, Object> item = jdbcTemplate.queryForMap("select * from " + table + " where JYBGBH=?", jybgbh);
			dataMap.put(table, item);
		}
		return dataMap;
	}

}
