package com.bilgeadam.photo.consts;

public class EntityConstants {

    public static final String STATE = "state";

    public static final String ROLE_ADMIN = "ROLE_ADMIN";
    public static final String ROLE_USER = "ROLE_USER";

    public static final short DELETED = 0;
    public static final short UNDELETED = 1;

    public static final String DATE_TIME_FORMAT = "dd-MM-yyyy HH:mm:ss";

    public static final String WHERE_CLAUSE = STATE + "<>" + DELETED;

    /**
     *  consts in the program
     *  User roles are admin and user
     * date format as day, mount, year and hour format as hour, minute, second
      */

}

