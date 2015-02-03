package org.frc2834.bluealliance.v2.matches;

import org.frc2834.bluealliance.v2.BlueAllianceObject;

import java.util.HashMap;

/**
 * This is the Match object that contains information like match number, teams involved, alliance teams, scores (if available)
 */
public class Match extends BlueAllianceObject {

    public Match() {

    }

    private int match_number;
    private int set_number;
    private String comp_level;
    private String key;
    private String event_key;
    private HashMap<String, Alliance> alliances;

    /**
     * Gets numerical match number for this match
     *
     * @return Returns Integer match number
     */
    public int getMatchNumber() {
        return match_number;
    }

    /**
     * Gets the set number for this match, not entirely sure what this represents
     *
     * @return Returns integer set number
     */
    public int getSetNumber() {
        return set_number;
    }

    /**
     * Gets the competition level for this match, ex. "Quals", "Finals", (if there are other ones put them here)
     *
     * @return Returns the competition level
     */
    public String getCompetitionLevel() {
        return comp_level;
    }

    /**
     * Gets the BlueAlliance key representation of this match, ex. "2013micmp_qm117"
     *
     * @return Returns the key as a String
     */
    public String getKey() {
        return key;
    }

    /**
     * Gets the official FIRST event code for the event this match took place in
     *
     * @return The event code this match took place in
     */
    public String getEvent() {
        return event_key;
    }

    /**
     * This is a hashmap containing two keys, "blue" and "red"</br>
     * Each representation the blue and red alliance respectively, and contains an Alliance object with</br>
     * Teams on the alliance, and the score the alliance achieved (if available)
     *
     * @return A HashMap of two Alliance objects
     */
    public HashMap<String, Alliance> getAlliances() {
        return alliances;
    }
}
