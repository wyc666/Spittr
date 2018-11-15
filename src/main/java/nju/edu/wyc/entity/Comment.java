package nju.edu.wyc.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="çomment")
public class Comment {
	//唯一标识符
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer commentId;
	
	//评论者
	@ManyToOne
	@JoinColumn(name="commenterId")
	private Spitter commenter;
	
	//评论内容
	private String content;
	
	//评论的动态
	@ManyToOne
	@JoinColumn(name="spittleId")
	private Spittle spittle;
	
	//评论时间
	private Date time;
}
