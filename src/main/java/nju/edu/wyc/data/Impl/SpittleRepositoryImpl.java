package nju.edu.wyc.data.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import nju.edu.wyc.data.SpittleRepository;
import nju.edu.wyc.vo.Spittle;

@Repository
public class SpittleRepositoryImpl implements SpittleRepository{

	@Override
	public List<Spittle> findSpittleList(int count, long id) {
		List<Spittle> spittles = new ArrayList<>();
		for(int i=10;i<20;i++){
			spittles.add(new Spittle(i,i*10,i+""+i));
		}
		return spittles;
	}

	@Override
	public List<Spittle> findSpittleList() {
		return this.findSpittleList(10, 1);
	}

}
