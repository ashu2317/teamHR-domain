package com.teamHR.domain;

import java.util.List;
import java.util.Map;

/**
 * Created by Ashutosh on 01-Apr-16.
 */

public class Role {
    private String roleName;
    private String roleType;
    private String roleDescription;
    private Map<String,List<Map<String,Boolean>>> accessMap;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public Map<String, List<Map<String, Boolean>>> getAccessMap() {
        return accessMap;
    }

    public void setAccessMap(Map<String, List<Map<String, Boolean>>> accessMap) {
        this.accessMap = accessMap;
    }
}
