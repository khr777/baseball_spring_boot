package site.cancod.baseball.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.cancod.baseball.dao.TestDao;
import site.cancod.baseball.vo.Article;

@Service
public class TestService {

	@Autowired
	private TestDao testDao;

	public Article getData() {
		return testDao.getData();
	}

}
