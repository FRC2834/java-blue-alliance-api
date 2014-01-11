package org.frc2834.bluealliance.v1.event;

/**
 * This is a more detailed event object that extends off of the SimpleEvent object, providing more detailed info like matches and team lists
 */
public class Event extends SimpleEvent {

    public Event() {

    }

    private String[] matches;
    private String[] teams;
    private String event_code;
    private String location;
    private String facebook_eid;

    /**
     * This will return an array of the matches for this event (if generated), but will return the BlueAlliance key representation </br>
     * Example, 2012ct_qm73 2012ct is the BlueAlliance representation of the match, qm is qualification match, and 73 is the match number
     *
     * @return String array of match keys
     */
    public String[] getMatches() {
        return matches;
    }

    /**
     * This will return an array of teams attending the event, but as BlueAlliance key representations, ex. "frc2834"
     *
     * @return String array of team keys
     */
    public String[] getTeams() {
        return teams;
    }

    /**
     * Gets the official FIRST event code for this event
     *
     * @return The official event code for this Event
     */
    public String getEventCode() {
        return event_code;
    }

    /**
     * Gets the location for this event, ex. "Hartford, CT"
     *
     * @return Returns the full location for this event
     */
    public String getLocation() {
        return location;
    }

    /**
     * I have no idea what this is
     *
     * @return Probably null
     */
    public String getFacebookEID() {
        return facebook_eid;
    }
}
