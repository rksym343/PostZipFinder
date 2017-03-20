package kr.or.dgit.post;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.post.dto.Doro;
import kr.or.dgit.post.service.DoroService;

//메소드 실행순서
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DoroServiceTest {
	private static DoroService doroService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
		doroService = new DoroService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
		doroService = null;
	}

	@Before
	public void setUp() {
		System.out.println("setUp()");
	}

	@After
	public void tearDown() {
		System.out.println("tearDown()");
	}

	///////////////////////////////

	@Test
	public void aTestselectDoroBySido() {
		List<Doro> lists = doroService.selectDoroBySido("세종%");
		Assert.assertNotNull(lists);
	}
	@Test
	public void bTestselectDoroByDoro() {
		List<Doro> lists = doroService.selectDoroByDoro("대구%", "용학로");
		Assert.assertNotNull(lists);
	}

	

}
