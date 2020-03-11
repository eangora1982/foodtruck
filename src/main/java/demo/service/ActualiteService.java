package demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.repository.ActualiteRepository;


@Service
public class ActualiteService { 
	@Autowired
	private ActualiteRepository actualiteRepository;
	public ActualiteRepository getActualiteRepository() {
		return actualiteRepository;
	}
	public void setArticleRepository(ActualiteRepository articleRepository) {
		this.actualiteRepository = actualiteRepository;   
	}

}
