package com.newer.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newer.pojo.Companyjob;
import com.newer.pojo.Jobs;
import com.newer.pojo.Person;
import com.newer.pojo.Pfavorite;
import com.newer.pojo.Pmailbox;
import com.newer.service.CompanyjobService;
import com.newer.service.JobsService;
import com.newer.service.PersonService;
import com.newer.service.PfavoriteService;
import com.newer.service.PmailboxService;
import com.newer.util.JobsJsonValueProcessor;
import com.newer.util.JsonDateValueProcessor;
import com.newer.util.Pager;

import net.sf.json.JSON;
import net.sf.json.JSONSerializer;
import net.sf.json.JsonConfig;

@Controller
public class PersonController {

	@Resource(name="personService")
	private PersonService personService;	
	@Resource(name="companyjobService")
	private CompanyjobService companyjobService;
	@Resource(name="jobsService")
	private JobsService jobsService;
	@Resource(name="pmailboxService")
	private PmailboxService	pmailboxService; 
	@Resource(name="pfavoriteService")
	private PfavoriteService pfavoriteService;
			
	private Person person;
	private Pmailbox pmailbox;
	private Companyjob companyjob;
	//发信
	@RequestMapping("aaa")
	public String send(@RequestParam(value = "id", required = true) Integer id, ModelMap map){
		System.out.println(id);	
		Jobs jobs=jobsService.findById(id);
		companyjob=companyjobService.findById(jobs.getCompanyjob().getCid());		
		map.put("person",person);
		map.put("companyjob", companyjob);
		return "send";
	}
	@RequestMapping("ccc")
	public void send1(Pmailbox pmailbox,HttpServletResponse response){
		int count=pmailboxService.addPmailbox(pmailbox);
		 try {
		      PrintWriter out = response.getWriter();
		      out.println(count);
		      out.flush();
		      out.close();
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
	}
	
	
	//添加收藏
	@RequestMapping("b")
	public void personId(@RequestParam(value = "id", required = true) Integer id,HttpServletResponse response){
		System.out.println(id);
		companyjob=companyjobService.findById(id);
		Pfavorite pfavorite=new Pfavorite();
		pfavorite.setCompanyjob(companyjob);
		pfavorite.setPerson(person);
		int count=pfavoriteService.addPfavorite(pfavorite);
		String cas="";
		if(count>0){
			cas="收藏成功";
		}else{
			cas="收藏失败";
		}
		 try {
		      PrintWriter out = response.getWriter();
		      out.println(cas);
		      out.flush();
		      out.close();
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
	}
	
	
	
	//密码修改
	@RequestMapping("personController_pwd1")
	public String personPwd1(Map<String, Object> map){
		map.put("user", person.getPnamejper());
		return "personPwd";
	}
	@RequestMapping("personController_pwd")
	public String personpwd( @RequestParam(value = "pwd1", required = true) String pwd1,
			  @RequestParam(value = "pwd2", required = true) String pwd2,
			  @RequestParam(value = "pwd3", required = true) String pwd3){
		if(person.getPwd().equals(pwd1)&&pwd2.equals(pwd3)){
			person.setPwd(pwd2);
			personService.modifyPerson(person);
			return "rightstage";
		}
		return "personPwd";
	}
	
	//简历
	@RequestMapping("personController_pid")
	public String  personAdd(Map<String, Object> map){
		map.put("person",person);
		return "personAdd";
	}
	@RequestMapping("personController_list")
	public String list(Person person){
		
		System.err.println(person.getEdu());
		int count=personService.modifyPerson(person);
		
		if(count>0){
			return "rightstage";
		}
		return "personAdd";
	}
	
//	 @RequestMapping("personController_shouye")
//	  public String shouye(Map<String, Object> map){
//		 map.put("person", person);
//		 
//		 for(Pmailbox pp :pmailboxService.findPmailbox(null, null, null, null, null, null, null).getRows()){
//				if(pp.getPerson().getPid()==person.getPid()){
//					pmailbox=pp;
//				}
//			}
//		 Pager pager= pmailboxService.findPmailbox(null, null, null, null, null, null, null);
//		 int tt=pager.getTotal();
//		 map.put("tt", tt);
//		 map.put("pmailbox", pmailbox);
//		 return "rightstage";
//	 }
	  
	  
	  //招聘信息
	 @RequestMapping("PersonController_list")
	  public void list(@RequestParam(value = "page", required = true) Integer page,
	      @RequestParam(value = "rows", required = true) Integer rows,
	      @RequestParam(value = "sort", required = true) String sort,
	      @RequestParam(value = "order", required = true) String order,
	      @RequestParam(value = "name", required = false) String name,
	      @RequestParam(value = "beginDate", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date beginDate,
	      @RequestParam(value = "endDate", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate,
	      HttpServletResponse response) {

	    if (!StringUtils.isEmpty(name)) {
	      name = "%" + name + "%";
	    }

	    // 处理起始页和结束页
	    Integer pageno = (page - 1) * rows;
	    Integer pagesize = page * rows;

	    Pager<Jobs> pager = jobsService.findJobs(pageno, pagesize, sort, order, name, beginDate, endDate);

	    JsonConfig jsonConfig = new JsonConfig();
	    jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
	    jsonConfig.registerJsonValueProcessor(Companyjob.class, new JobsJsonValueProcessor());
	    JSON json = JSONSerializer.toJSON(pager, jsonConfig);

	    try {
	      PrintWriter out = response.getWriter();
	      out.println(json.toString());
	      out.flush();
	      out.close();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }
	  
	  //用户登录
	 @RequestMapping("user")
	  public String user(@RequestParam(value="uname",required=true)String uname,
			  @RequestParam(value="pwd",required=true)String pwd,
			  @RequestParam(value="tt",required=true)String tt){
		 if("个人".equals(tt)){
			 for(Person p : personService.findPerson()){
				 if(p.getPnamejper().equals(uname)&&p.getPwd().equals(pwd)){
					 person=p;
					 return "indexstage";
				 }
			 }
		 }else if("单位".equals(tt)){
			 for(Companyjob c :companyjobService.find()){
				 if(c.getCnamejob().equals(uname)&&c.getPwd().equals(pwd)){
					 return "company";
				 }
			 }
		 }
		return "userinfo";		 
	 }
	
	//用户注册
	 @RequestMapping("success")
	  public String userAdd(@RequestParam(value="uname",required=true)String uname,
			  @RequestParam(value="pwd",required=true)String pwd,
			  @RequestParam(value="pwd1",required=true)String pwd1,
			  @RequestParam(value="tt",required=true)String tt){
		 if(pwd.equals(pwd1)){
			 if("个人".equals(tt)){
				 Person p=new Person();
				 p.setPnamejper(uname);;
				 p.setPwd(pwd);
				 personService.addPerson(p);
				 return "userinfo";
			 }else if("单位".equals(tt)){
				 Companyjob c =new Companyjob();
				 c.setCnamejob(uname);
				 c.setPwd(pwd);
				 companyjobService.add(c);
				 return "userinfo";
			 }
		 }
		 
		 return "userAdd";
	 }
	
	  
	  
}
