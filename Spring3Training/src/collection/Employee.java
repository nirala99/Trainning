package collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

    private String name;
    private List<Project> projects;
    private Long[] phoneNumbers;
    private Set<String> skills;
    private Set<Contact> contacts;
    private Map<Integer, Double> ratings;
    private Map<String, List<Project>> skillProjects;
    private Properties bands;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Long[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Set<String> getSkills() {
        return skills;
    }

    public void setSkills(Set<String> skills) {
        this.skills = skills;
    }

    public Set<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }

    public Map<Integer, Double> getRatings() {
        return ratings;
    }

    public void setRatings(Map<Integer, Double> ratings) {
        this.ratings = ratings;
    }

    public void setSkillProjects(Map<String, List<Project>> skillProjects) {
        this.skillProjects = skillProjects;
    }

    public Map<String, List<Project>> getSkillProjects() {
        return skillProjects;
    }

    public Properties getBands() {
        return bands;
    }

    public void setBands(Properties bands) {
        this.bands = bands;
    }
}
