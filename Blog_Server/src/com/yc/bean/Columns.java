package com.yc.bean;

import java.sql.Timestamp;

public class Columns {
	private Long id;
	private String columnName;
	private String aliasName;
	private Long parentId;
	private String keyWords;
	private String description;
	private String createBy;
	private Timestamp createDate;
	private Long sort;
	private String status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getAliasName() {
		return aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getKeyWords() {
		return keyWords;
	}
	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public Long getSort() {
		return sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Columns [id=" + id + ", columnName=" + columnName + ", aliasName=" + aliasName + ", parentId="
				+ parentId + ", keyWords=" + keyWords + ", description=" + description + ", createBy=" + createBy
				+ ", createDate=" + createDate + ", sort=" + sort + ", status=" + status + "]";
	}
	public Columns(Long id, String columnName, String aliasName, Long parentId, String keyWords, String description,
			String createBy, Timestamp createDate, Long sort, String status) {
		super();
		this.id = id;
		this.columnName = columnName;
		this.aliasName = aliasName;
		this.parentId = parentId;
		this.keyWords = keyWords;
		this.description = description;
		this.createBy = createBy;
		this.createDate = createDate;
		this.sort = sort;
		this.status = status;
	}
	public Columns() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
