package com.gxwebmanager.solutions.Child2.api;

public class WCBConstants {
    public static final String DOMAIN = "com.gxwebmanager.solutions"; //should not fail

    public static final String WCB_ID = "Child1"; // should fail, not same as artifact

    public static final String SOME_ID = "someid";

    public static final String BUNDLE_ID = DOMAIN +"."+ SOME_ID; // should fail, doesn't match <DOMAIN>.<WCB_ID>

    public static final String PANEL_COMPONENT_ID = SOME_ID + ".panel"; // should fail, not starting with BUNDLE_ID
}
