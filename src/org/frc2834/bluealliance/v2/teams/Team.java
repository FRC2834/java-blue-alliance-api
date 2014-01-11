package org.frc2834.bluealliance.v2.teams;

import org.frc2834.bluealliance.v2.BlueAllianceObject;
import org.frc2834.bluealliance.v2.event.Event;

/**
 * This class will be deserialized to contain basic team data
 */
public class Team extends BlueAllianceObject {

    public Team() {

    }

    private String name;
    private String key;
    private String locality;
    private String region;
    private int team_number;
    private String location;
    private String country_name;
    private String nickname;
    private Event[] events;
    private String website;

    /**
     * Gets the full team name, with sponsors ex. "Chrysler LLC/The Chrysler Foundation/BAE Systems/TI Automotive/JDM Consulting & Notre Dame Preparatory School"
     *
     * @return The Full team name
     */
    public String getName() {
        return name;
    }

    /**
     * The BlueAlliance key that represents this team, ex. "frc2834"
     *
     * @return The Blue Alliance key that represents this team
     */
    public String getKey() {
        return key;
    }

    /**
     * Get the team's locality
     *
     * @return Team's locality, ex. 'Greenville'
     */
    public String getLocality() {
        return locality;
    }

    /**
     * Get the team's region, usually a State if USA or a province/state in other countries
     *
     * @return Team's region, ex "SC" or "ON"
     */
    public String getRegion() {
        return region;
    }

    /**
     * Get the team's number
     *
     * @return Integer team number
     */
    public int getTeamNumber() {
        return team_number;
    }

    /**
     * Get the team's full location
     *
     * @return The team's full location, ex "Greenville, SC, USA"
     */
    public String getLocation() {
        return location;
    }

    /**
     * Get the team's country name ex. "USA" or "Canada"
     *
     * @return The team's country name
     */
    public String getCountryName() {
        return country_name;
    }

    /**
     * Gets the team's nickname that most people are familiar with. Ex. "Killer Bees"
     *
     * @return The team's nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Gets a list of Event objects a team is participating in or has participated in
     *
     * @return An Event array of the team's events in which they are participating or has participated
     */
    public Event[] getEvents() {
        return events;
    }

    /**
     * Gets the website associated with the team
     *
     * @return The website of the team, ex. "http://www.killerbees33.com/"
     */
    public String getWebsite() {
        return website;
    }
}
