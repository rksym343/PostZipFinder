package kr.or.dgit.post.service;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.post.dao.DoroMapper;
import kr.or.dgit.post.dao.DoroMapperImpl;
import kr.or.dgit.post.dto.Doro;
import kr.or.dgit.post.util.MybatisSqlSessionFactory;

public class DoroService {
	private static final Log log = LogFactory.getLog(DoroService.class);
	private String namespace = "kr.or.dgit.post.dao.DoroMapper.";

	public List<Doro> selectDoroByDoro(String sido, String doro) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			DoroMapper doroMapper = new DoroMapperImpl(sqlSession);
			return doroMapper.selectDoroByDoro(sido+"%", doro+"%");
		}
	}

	public List<Doro> selectDoroBySido(String sido) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			DoroMapper doroMapper = new DoroMapperImpl(sqlSession);
			return doroMapper.selectDoroBySido(sido);
		}
	}

}
