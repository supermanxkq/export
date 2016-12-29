package com.xukaiqiang.entity;

import java.util.List;

public class Request {
	private String id;
	private String headers;
	private String url;
	private String pathVariables;
	private String preRequestScript;
	private String method;
	private String collectionId;
	private List<Data> data;
	private String dataMode;
	private String name;
	private String description;
	private String descriptionFormat;
	private String time;
	private String version;
	private String responses;
	private String tests;
	private String currentHelper;
	private String helperAttributes;
	private String folder;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHeaders() {
		return headers;
	}

	public void setHeaders(String headers) {
		this.headers = headers;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPathVariables() {
		return pathVariables;
	}

	public void setPathVariables(String pathVariables) {
		this.pathVariables = pathVariables;
	}

	public String getPreRequestScript() {
		return preRequestScript;
	}

	public void setPreRequestScript(String preRequestScript) {
		this.preRequestScript = preRequestScript;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getCollectionId() {
		return collectionId;
	}

	public void setCollectionId(String collectionId) {
		this.collectionId = collectionId;
	}

	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

	public String getDataMode() {
		return dataMode;
	}

	public void setDataMode(String dataMode) {
		this.dataMode = dataMode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescriptionFormat() {
		return descriptionFormat;
	}

	public void setDescriptionFormat(String descriptionFormat) {
		this.descriptionFormat = descriptionFormat;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getResponses() {
		return responses;
	}

	public void setResponses(String responses) {
		this.responses = responses;
	}

	public String getTests() {
		return tests;
	}

	public void setTests(String tests) {
		this.tests = tests;
	}

	public String getCurrentHelper() {
		return currentHelper;
	}

	public void setCurrentHelper(String currentHelper) {
		this.currentHelper = currentHelper;
	}

	public String getHelperAttributes() {
		return helperAttributes;
	}

	public void setHelperAttributes(String helperAttributes) {
		this.helperAttributes = helperAttributes;
	}

	public String getFolder() {
		return folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}

}
