package org.frc2834.bluealliance.v1.event;

import org.frc2834.bluealliance.v1.BlueAllianceObject;

/**
 * Simple Event class that will contain Simple Event data, without matches and team list
 */
public class SimpleEvent extends BlueAllianceObject {

    public SimpleEvent() {

    }

    private String name;
    private String short_name;
    private String key;
    private boolean official;
    private String start_date;
    private String end_date;

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
