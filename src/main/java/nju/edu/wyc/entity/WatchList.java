package nju.edu.wyc.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="watchList")
public class WatchList {
	//唯一标识符
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	//关注人Id
	@ManyToOne
	@JoinColumn(name="watcherId")
	private Spitter watcher;
	
	//被关注人Id
	@ManyToOne
	@JoinColumn(name="watchedId")
	private Spitter watched;
	
	//开始关注时间
	private Date startTime;
}
