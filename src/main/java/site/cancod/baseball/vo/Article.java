package site.cancod.baseball.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Article {
	
	private int id;
	private String title;
	private String body;
}
