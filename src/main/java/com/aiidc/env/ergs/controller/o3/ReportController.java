/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.controller.o3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.jpa.po.o3.Report;
import com.aiidc.env.ergs.service.o3.ReportDetailService;
import com.aiidc.env.ergs.service.o3.ReportService;

/**
 * @author wuwenjun
 *
 */
@Controller
@RequestMapping("egrs/o3/report")
public class ReportController {
	@ModelAttribute("itemClass")
	public Class<?> itemClass() {
		return Report.class;
	}

	@Autowired
	private ReportService service;

	@Autowired(required = false)

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index() {
		return "o3/report/index";
	}

	@RequestMapping(value = "table", method = RequestMethod.GET)
	public String table(QryPageVo qryVo, Report item, Model model) {
		model.addAttribute("page", find(qryVo, item));
		return "o3/report/table";
	}

	@RequestMapping(value = "find", method = RequestMethod.GET)
	@ResponseBody
	public Page<Report> find(QryPageVo qryVo, Report item) {
		return service.find(qryVo, item);
	}

	@RequestMapping(value = "doc/{jybgbh}", method = RequestMethod.GET)
	public String doc(@PathVariable String jybgbh) {
		ReportDetailService detailService = service.getDetailService(jybgbh);
		if (!detailService.hasCreated(jybgbh)) {
			detailService.createWord(jybgbh);
		}
		return "forward:/file/download/normal?path=" + detailService.wordPath(jybgbh);
	}

	@RequestMapping(value = "view/{jybgbh}", method = RequestMethod.GET)
	public String table(@PathVariable String jybgbh, Model model) {
		ReportDetailService detailService = service.getDetailService(jybgbh);
		model.addAllAttributes(detailService.getDataMap(jybgbh));
		return "o3/report/view";
	}

}
