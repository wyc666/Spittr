package nju.edu.wyc.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "spittle")
public class Spittle {
	// 唯一标识符
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer spittleId;

	// 图片存放路径
	private List<String> picUrl;

	// 内容
	private String content;

	// 点赞数
	private Integer likes;

	// 作者Id
	@ManyToOne
	@JoinColumn(name = "authorId")
	private Spitter author;

	// 收到的评论
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "spttleId")
	private List<Comment> commentList;
}
