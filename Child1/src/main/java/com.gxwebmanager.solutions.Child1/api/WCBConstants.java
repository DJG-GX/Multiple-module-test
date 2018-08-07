package com.gxwebmanager.solutions.Child1.api;

public class WCBConstants {

    public static final String DOMAIN = "com.gxwebmanager.solution"; //should fail

    public static final String WCB_ID = "Child1"; // should fail, not only alphanumerics

    public static final String SOME_ID = "someid";

    public static final String BUNDLE_ID = DOMAIN +"."+ SOME_ID; // should fail, doesn't match <DOMAIN>.<WCB_ID>

    public static final String PANEL_COMPONENT_ID = SOME_ID + ".panel"; // should fail, not starting with BUNDLE_ID
}
