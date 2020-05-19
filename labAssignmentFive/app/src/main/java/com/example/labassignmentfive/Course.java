package com.example.labassignmentfive;

public class Course {
    String cid;
    String cname;
    String abbr;
    int credits;
    int ice;
    int ece;
    int internal;
    int external;
    int presentation;

    public Course(String cid,
                  String cname,
                  String abbr,
                  int credits,
                  int ice,
                  int ece,
                  int internal,
                  int external,
                  int presentation){
        this.cid = cid;
        this.cname = cname;
        this.abbr = abbr;
        this.credits = credits;
        this.ice = ice;
        this.ece = ece;
        this.internal = internal;
        this.external = external;
        this.presentation = presentation;
    }

}
