package org.frc2834.bluealliance.util;

/**
 * All knowing Constants file
 */
public interface Constants {

    /**
     * Base Blue Alliance URL for v1 of the API with ending forward slash
     */
    public static final String BLUE_ALLIANCE_BASE_URL_V1 = "http://www.thebluealliance.com/api/v1/";

    /**
     * Extension to for multiple teams info
     */
    public static final String BLUE_ALLIANCE_TEAMS_INFO = "teams/show?teams=";
    /**
     * Extension for single team info
     */
    public static final String BLUE_ALLIANCE_TEAM_DETAILS = "team/details?team=";
    /**
     * Extension for event list
     */
    public static final String BLUE_ALLIANCE_EVENT_LIST = "events/list?year=";
    /**
     * Extension for details of a single event
     */
    public static final String BLUE_ALLIANCE_EVENT_DETAILS = "event/details?event=";
    /**
     * Extension for match details of a match or multiple matchii
     */
    public static final String BLUE_ALLIANCE_MATCH_DETAILS = "match/details?match=";

}
