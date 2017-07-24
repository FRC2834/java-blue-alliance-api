package org.frc2834.bluealliance.v3.teams;

import org.frc2834.bluealliance.v3.BlueAllianceObject;
import org.frc2834.bluealliance.v3.event.Event;

import java.util.Map;

/**
 * This class will be deserialized to contain basic team data
 */
public class Team extends BlueAllianceObject {

    public Team() {

    }

    private String name;
    private String key;
    private String city;
    private String region;
    private int team_number;
    private String location_name;
    private String state_prov;
    private String country;
    private String nickname;
    private Map<String, String> home_championship;
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
     * Get the team's city
     *
     * @return Team's city, ex. 'Greenville'
     */
    public String getCity() {
        return city;
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
    public String getLocationName() {
        return location_name;
    }

    /**
     * Get the team's country name ex. "USA" or "Canada"
     *
     * @return The team's country name
     */
    public String getCountry() {
        return country;
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
     * Gets a map of the team's home championships' locations
     *
     * @return A map of the championships' city names, with 4 digit String years as keys
     */
    public Map<String, String> getHomeChampionshipMap() {
        return home_championship;
    }

    /**
     * Gets a map of the team's home championship's locations
     *
     * @param year A String of a four digit number representing the year of the championship
     *
     * @return The city name of the championship
     */
    public String getHomeChampionshipFromYear(String year) {
        return home_championship.get(year);
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
