package me.Lja.mapper;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.Lja.config.AppTest;
import me.Lja.model.Board;

public class BoardMapperTest extends AppTest{

	@Autowired
	BoardMapper mapper;
	
	@Test
	public void getListTest() {
		List<Board> list = mapper.getList();
		assertEquals(4, list.size());
	}
}
