package site.cancod.baseball.dao;

import org.apache.ibatis.annotations.Mapper;

import site.cancod.baseball.vo.Article;

@Mapper
public interface TestDao {

	Article getData();

}
