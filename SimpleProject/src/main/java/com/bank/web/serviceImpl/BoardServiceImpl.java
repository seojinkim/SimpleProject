package com.bank.web.serviceImpl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.web.domain.BoardVO;
import com.bank.web.mapper.BoardMapper;
import com.bank.web.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public BoardVO[] selectBoard() {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		return mapper.selectBoard();
	}

	@Override
	public int insertBoard(String id, String title, String context) {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		return mapper.insertBoard(id, title, context);
	}

	@Override
	public BoardVO selectDetail(int index) {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		return mapper.selectDetail(index);
	}

	@Override
	public int updateBoard(String title, String context, int idx) {
		// 글수정
		System.out.println("글 수정 중");
		BoardMapper mapper =  sqlSession.getMapper(BoardMapper.class);
		return mapper.updateBoard(title, context, idx);
	}

	@Override
	public int deleteBoard(int index) {
		// 글삭제
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		return mapper.deleteBoard(index);
	}

	@Override
	public String selectUserWritten(int index, String id) {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		return mapper.selectUserWritten(index, id);
	}

}
