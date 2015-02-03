package org.frc2834.bluealliance.v2.event;

import org.frc2834.bluealliance.v2.BlueAllianceObject;

/**
 * This is a more detailed event object that extends off of the SimpleEvent object, providing more detailed info like matches and team lists
 */
public class Event extends BlueAllianceObject {

    public Event() {

    }

    private String name;
    private String short_name;
    private String key;
    private boolean official;
    private String start_date;
    private String end_date;
    private String event_code;
    private String location;
    private String facebook_eid;

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

    /**
     * The long name of the event, ex. "Southfield FIRST Robotics District Competition"
     *
     * @return Returns String of the long name of event
     */
    public String getName() {
        return name;
    }

    /**
     * The short name of the event, ex. "Southfield"
     *
     * @return Returns String of the short name
     */
    public String getShortName() {
        return short_name;
    }

    /**
     * BlueAlliance key representation of this event, ex. "2014misou"
     *
     * @return String representation of the key
     */
    public String getKey() {
        return key;
    }

    /**
     * This represents whether an event is FIRST 'official' or not
     *
     * @return True if official, false otherwise
     */
    public boolean isOfficial() {
        return official;
    }

    /**
     * Gets the start of the event, format as ex. "2014-02-28T00:00:00"
     *
     * @return String representation of the date
     */
    public String getStartDate() {
        return start_date;
    }

    /**
     * Gets the end date of the event, format as ex. "2014-03-01T00:00:00"
     *
     * @return String representation of the date
     */
    public String getEndDate() {
        return end_date;
    }
}
