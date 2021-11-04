package by.epam.task02.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {
	
	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();
	
	public Criteria() {}
	
	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public void addCriterion(String criterion, Object value) {
		criteria.put(criterion, value);
	}
	
	public void clearCriteria() {
		this.criteria.clear();
		this.groupSearchName = null;
	}

	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void setGroupSearchName(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	public Map<String, Object> getCriteria() {
		return criteria;
	}

	public void setCriteria(Map<String, Object> criteria) {
		this.criteria = criteria;
	}
	
	

}
