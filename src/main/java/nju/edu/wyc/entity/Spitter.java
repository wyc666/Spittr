package nju.edu.wyc.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "spitter")
public class Spitter {
	//用户Id
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer spitterId;

	//用户姓名
	private String name;

	//用户手机号
	private String phone;

	//用户生日
	private Date birthday;

	//用户性别
	private Boolean sex;

	//用户邮箱
	private String email;

	//用户关注人列表
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "watcherId")
	private List<Spitter> watcherList;

	//用户粉丝列表
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "watchedId")
	private List<Spitter> watchedList;
	
	//我发出的评论
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="commenterId")
	private List<Comment> commentList;
	
	//我发出的动态
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="authorId")
	private List<Spittle> spittleList;
}
