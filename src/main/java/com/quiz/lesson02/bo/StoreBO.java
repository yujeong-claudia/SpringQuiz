package com.quiz.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson02.domain.Store;
import com.quiz.lesson02.mapper.StoreMapper;

@Service // Spring bean으로 등록
public class StoreBO {
	
	@Autowired // Dependency Injection(DI): 의존성 주입
	private StoreMapper storeMapper; //Spring Bean을 가져온다.
	
	// input:X (컨트롤러한테 요청받음)	
	// output: (Repository한테 받은 것을) List<Store> (컨트롤러한테 돌려준다)
	public List<Store> getUsedGoodsList() { // BO 단계에서는 get으로 시작한다.
		return storeMapper.selectStoreList();
	}
}
