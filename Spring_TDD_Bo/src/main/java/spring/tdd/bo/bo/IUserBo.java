package main.java.spring.tdd.bo.bo;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IUserBo {

	void sampleRule() throws Exception;
}
