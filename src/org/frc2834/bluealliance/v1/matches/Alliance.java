package org.frc2834.bluealliance.v1.matches;

/**
 * This Alliance object represents an Alliance with their score and the teams on the alliance
 */
public class Alliance {

    public Alliance() {

    }

    private int score;
    private String[] teams;

    /**
     * The score the alliance achieved, if available
     *
     * @return Returns the numerical score the alliance achieved.
     */
    public int getScore() {
        return score;
    }

    /**
     * Gets a list of the teams on this alliance, in order, represented as BlueAlliance keys, ex. "frc2834"
     *
     * @return Returns a String Array of the team keys
     */
    public String[] getTeams() {
        return teams;
    }
}
