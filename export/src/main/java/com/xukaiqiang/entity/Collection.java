package com.xukaiqiang.entity;

import java.util.List;

import com.xukaiqiang.entity.task.TaskToDo;

public class Collection {
	
	// collection的名字
	private String id;
	private String name;
	private String description;
	private List<Folder> folders;
	private long timestamp;
	private String owner;
	private String remoteLink;
	private List<Request> requests;

	public List<Request> getRequests() {
		return requests;
	}

	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getRemoteLink() {
		return remoteLink;
	}

	public void setRemoteLink(String remoteLink) {
		this.remoteLink = remoteLink;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Folder> getFolders() {
		return folders;
	}

	public void setFolders(List<Folder> folders) {
		this.folders = folders;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
