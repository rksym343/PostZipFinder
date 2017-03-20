package kr.or.dgit.post.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.post.dto.Doro;

public class DoroMapperImpl implements DoroMapper {
	private static final Log log = LogFactory.getLog(DoroMapperImpl.class);
	private String namespace = "kr.or.dgit.post.dao.DoroMapper";
	private SqlSession sqlSession;
	
	
	
	public DoroMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Doro> selectDoroByDoro(String sido, String doro) {
		log.debug("selectDoroByDoro()");
		return sqlSession.getMapper(DoroMapper.class).selectDoroByDoro(sido, doro);
	}

	@Override
	public List<Doro> selectDoroBySido(String sido) {
		log.debug("selectDoroBySido()");
		return sqlSession.getMapper(DoroMapper.class).selectDoroBySido(sido);
	}

}
