package kr.or.dgit.post.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.post.dto.Doro;

public interface DoroMapper {
	List<Doro> selectDoroByDoro(String sido, String doro);
	List<Doro> selectDoroBySido(String sido);
}
