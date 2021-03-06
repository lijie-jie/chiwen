package com.databps.bigdaf.admin.domain.model;

import java.util.List;
import java.util.Set;

/**
 * Created by lgc on 17-7-17.
 */
public class ChiWenPrivilegeItem {
  private Set<String> users ;
  private Set<String> groups;
  private List<Access> accesses;

  public Set<String> getUsers() {
    return users;
  }

  public void setUsers(Set<String> users) {
    this.users = users;
  }

  public Set<String> getGroups() {
    return groups;
  }

  public void setGroups(Set<String> groups) {
    this.groups = groups;
  }

  public List<Access> getAccesses() {
    return accesses;
  }

  public void setAccesses(List<Access> accesses) {
    this.accesses = accesses;
  }
}
