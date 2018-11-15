package nju.edu.wyc.dao;

import org.springframework.stereotype.Repository;

import nju.edu.wyc.dao.base.BaseDao;
import nju.edu.wyc.entity.Spitter;

@Repository
public class SpitterDao extends BaseDao<Spitter, Integer>{
	public Spitter getSpitterById(int id){
		return getByHQL("from spitter where id = ?", id);
	}
	
	public Spitter getSpitterByPhone(String phone){
		return getByHQL("from spitter where phone = ?", phone);
	}
	
	public Spitter get
}
