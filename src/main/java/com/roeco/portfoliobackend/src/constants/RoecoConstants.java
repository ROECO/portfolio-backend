package com.roeco.portfoliobackend.src.constants;

public class RoecoConstants {
    public static final String API_VERSION = "/api/v1";
    public static final String HEALTH_CHECK = "/health";
    public static final String API_INFO = "/info";
    public static class Projects{
        public static final String BASE = API_VERSION + "/projects";
        public static final String FETCH_ALL = BASE ;
    }
    public static class WorkExperience{
        public static final String BASE = API_VERSION + "/workexp";
    }
    public static class Admin{
        public static final String BASE = API_VERSION + "/admin";
        public static final String WORKEXP = BASE + "/workexp";
        public static final String PROJECTS = BASE + "/projects";
        public static final String CREATE = PROJECTS;
        public static final String UPDATE = PROJECTS + "/{id}";
        public static final String DELETE = PROJECTS + "/{id}";
        public static final String ABOUT = BASE + "/about";
    }
}
