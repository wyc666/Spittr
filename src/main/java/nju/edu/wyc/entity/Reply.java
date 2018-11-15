package nju.edu.wyc.entity;

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
@Table(name = "reply")
public class Reply {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer replyId;

	@ManyToOne
	@JoinColumn(name="commentId")
	private Comment comment;

	@OneToOne
	private Reply reply;

	private Integer replyType;

	private String content;

	private Spitter toSpitter;

	private Spitter fromSpitter;
}
