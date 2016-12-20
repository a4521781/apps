package com.newer.test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.newer.pojo.Companyjob;
import com.newer.pojo.Jobs;
import com.newer.pojo.Person;
import com.newer.pojo.Pmailbox;
import com.newer.service.CompanyjobService;
import com.newer.service.JobsService;
import com.newer.service.PersonService;
import com.newer.service.PmailboxService;
import com.newer.util.Pager;


public class PmailboxTest {

	private PmailboxService pmailboxService;
	private PersonService personService;
	private CompanyjobService companyjobService;
	private JobsService jobsService;
	

	@Test
	public void find2(){
		Jobs j=jobsService.findById(5);
		System.out.println(j.getJname()+","+j.getCompanyjob().getCid());
	}
	
	@Test
	public void find1(){		
		Pmailbox p =pmailboxService.findPmailboxId(2);
		System.out.println(p.getLid()+","+p.getCompanyjob().getCid()+","+p.getPerson().getPid());
	}
	
	@Test
	public void findPager(){
		Integer page = 1;
		Integer rows=2;
		String sort="lid";
		String order= "asc";
		
		String name=null;
		Date beginDate=null;
		Date endDate=null;
		
		Integer pageno=(page-1)*rows;
		Integer pagesize=page*rows;
		
		
		Pager<Pmailbox> pager=pmailboxService.findPmailbox(pageno, pagesize, sort, order, name, beginDate, endDate);
		System.out.println("��ҳ����:"+pager.getTotal());
		
		for(Pmailbox p : pager.getRows()){
			System.out.println(p.getEndname()+","+p.getMailtext()+","+p.getSdate());
		}
	}
	
	@Test
	public void add(){
		
//		    Companyjob companyjob=new Companyjob();
//		    companyjob.setCid(2);
//		    Person person=new Person();
//		    person.setPid(3);
		    Companyjob companyjob=companyjobService.findById(2);
		    Person      person= personService.findByPersonId(2);
		    Pmailbox p =new Pmailbox();
		    p.setCompanyjob(companyjob);
		    p.setPerson(person);
		    p.setEndname("����");
		    p.setTitle("��ְ");
		    p.setMailtext("�ٶȣ�Nasdaq��BIDU����ȫ�����������������棬2000��1��������ꡢ"
		    		+"�������˴����ڱ����йش壬�ٶ��������������ṩ���򵥣�������������Ϣ��ȡ��ʽ�����ٶȡ�����Դ"
		    		+"���й��γ������������ġ����񰸡�ʫ�䣺������Ѱ��ǧ�ٶȡ��������Űٶȶ�������Ϣ����������ִ��׷��"
		    		+"��2005��8��5������˹������С�");
		    p.setSdate(new Date());
		    p.setNewmail(2);
		    int count=pmailboxService.addPmailbox(p);
		    System.out.println(count);
	}
	
	@Test
	public void find(){
		Integer page = 1;
		Integer rows=2;
		String sort="jid";
		String order= "asc";
		String name=null;
		Date beginDate=null;
		Date endDate=null;
		Integer pageno=(page-1)*rows;
		Integer pagesize=page*rows;
		Pager<Jobs> pager=jobsService.findJobs(pageno, pagesize, sort, order, name, beginDate, endDate);
		
		
		for(Jobs p : pager.getRows()){
			System.out.println(p.getCompanyjob().getCnamejob());
		}
	}
	
	@Test
	public void modify(){
		    Companyjob companyjob=companyjobService.findById(2);
		    Person      person= personService.findByPersonId(3);
		    Pmailbox p =new Pmailbox();
		    p.setLid(4);
		    p.setCompanyjob(companyjob);
		    p.setPerson(person);
		    p.setEndname("����");
		    p.setTitle("��ְ");
		    p.setMailtext("��Nasdaq��BIDU����ȫ�����������������棬2000��1��������ꡢ"
		    		+"�������˴����ڱ����йش壬�ٶ��������������ṩ���򵥣�������������Ϣ��ȡ��ʽ�����ٶȡ�����Դ"
		    		+"���й��γ������������ġ����񰸡�ʫ�䣺������Ѱ��ǧ�ٶȡ��������Űٶȶ�������Ϣ����������ִ��׷��"
		    		+"��2005��8��5������˹������С�");
		    p.setSdate(new Date());
		    p.setNewmail(2);
		    int count=pmailboxService.modifyPmailbox(p);
		    System.out.println(count);
	}
	
	
	@SuppressWarnings("resource")
	@Before
	public void init(){
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		pmailboxService=ctx.getBean("pmailboxService",PmailboxService.class);
		  companyjobService=ctx.getBean("companyjobService",CompanyjobService.class);
		   personService=ctx.getBean("personService",PersonService.class);
		   jobsService=ctx.getBean("jobsService",JobsService.class);
	}
}
