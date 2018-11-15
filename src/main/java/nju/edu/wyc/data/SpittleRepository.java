package nju.edu.wyc.data;

import java.util.List;

import nju.edu.wyc.vo.Spittle;

public interface SpittleRepository {
	/**
	 * 查找以id开始的长度为count的Spittle列表
	 * @param count 查找长度
	 * @param id	以id开始
	 * @return	查找列表
	 */
	List<Spittle> findSpittleList(int count,long id);
	
	/**
	 * 查找最新的默认长度的Spittle列表
	 * @return 查找列表
	 */
	List<Spittle> findSpittleList();
}
