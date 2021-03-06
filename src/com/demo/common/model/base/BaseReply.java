package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseReply<M extends BaseReply<M>> extends Model<M> implements IBean {

	public void setReplyId(java.lang.Integer replyId) {
		set("replyId", replyId);
	}

	public java.lang.Integer getReplyId() {
		return get("replyId");
	}

	public void setReplyTitle(java.lang.String replyTitle) {
		set("replyTitle", replyTitle);
	}

	public java.lang.String getReplyTitle() {
		return get("replyTitle");
	}

	public void setReplyContent(java.lang.String replyContent) {
		set("replyContent", replyContent);
	}

	public java.lang.String getReplyContent() {
		return get("replyContent");
	}

}
