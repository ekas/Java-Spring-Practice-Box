package com.spring.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ListProperties {
	private List<String> shapeOfList;
	private Set<String> shapeOfSet;
	private Map<String, String> shapeOfMap;
	private Properties shapeOfProperties;
	
	public List<String> getShapeOfList() {
		return shapeOfList;
	}


	public void setShapeOfList(List<String> shapeOfList) {
		this.shapeOfList = shapeOfList;
	}


	public Set<String> getShapeOfSet() {
		return shapeOfSet;
	}


	public void setShapeOfSet(Set<String> shapeOfSet) {
		this.shapeOfSet = shapeOfSet;
	}


	public Map<String, String> getShapeOfMap() {
		return shapeOfMap;
	}


	public void setShapeOfMap(Map<String, String> shapeOfMap) {
		this.shapeOfMap = shapeOfMap;
	}


	public Properties getShapeOfProperties() {
		return shapeOfProperties;
	}


	public void setShapeOfProperties(Properties shapeOfProperties) {
		this.shapeOfProperties = shapeOfProperties;
	}

	@Override
	public String toString() {
		return "ListProperties: \nshapeOfList=" + shapeOfList + ", \nshapeOfSet="
				+ shapeOfSet + ", \nshapeOfMap=" + shapeOfMap
				+ ", \nshapeOfProperties=" + shapeOfProperties ;
	}
}
