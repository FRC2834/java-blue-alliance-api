package org.frc2834.bluealliance;

import com.google.gson.Gson;
import org.frc2834.bluealliance.teams.Team;
import org.frc2834.bluealliance.util.Constants;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

/**
 * This is the starting class to access all BlueAlliance "objects", like teams and events
 */
public class BlueAlliance {

    /**
     * Queries basic information about a single team
     *
     * @param teamKey The team key you want to query data on, ex. "frc2834"
     * @param year The year of the information of this team to query
     * @return Returns a Team object that contains information about the team
     * @throws IOException Throws IOException on connection/reader errors
     */
    public Team getTeamDetails(String teamKey, String year) throws IOException {
        return (Team) deserializeJSON(new Team(), createReader(createURL(Constants.BLUE_ALLIANCE_TEAM_DETAILS + teamKey + "/" + year)));
    }

    /**
     * Generically deserializes JSON data into a class
     *
     * @param blueAllianceObject A specific, instantiated BlueAllianceObject, for example like TeamDetails
     * @param reader             A reader that is open to JSON data, use createReader to create a reader
     * @return Returns a generic BlueAllianceObject that can be casted to the specific object you originally wanted
     */
    private BlueAllianceObject deserializeJSON(BlueAllianceObject blueAllianceObject, Reader reader) {
        Gson gson = new Gson();

        return gson.fromJson(reader, blueAllianceObject.getClass());
    }

    /**
     * Deserializes a JSON array of JSON objects from BlueAlliance and returns a List with each element being a Java respresentation of the JSON Object
     *
     * @param type   The type of List to create, (TypeToken)
     * @param reader A reader that is open to JSON data, use createReader to create a reader
     * @return Returns a generic List of BlueAllianceObjects which must be casted to the specific type you want
     */
    private List<BlueAllianceObject> deserializeJSONArray(Type type, Reader reader) {
        Gson gson = new Gson();

        Type listType = type;

        return gson.fromJson(reader, listType);
    }


    /**
     * Creates a reader pointing to JSON data
     *
     * @param url A full BlueAlliance pointing to JSON data, create one with createURL(String append)
     * @return Returns a InputStreamReader typed as a generic Reader
     * @throws IOException throws IOException on connection/reader errors
     */
    private Reader createReader(String url) throws IOException {
        URLConnection urlConnection = new URL(url).openConnection();
        urlConnection.addRequestProperty("X-TBA-App-Id", "frc2834:java-blue-alliance-api:v2.0.0");
        return new InputStreamReader(urlConnection.getInputStream());
    }

    /**
     * Creates a full URL to a BlueAlliance page containing JSON data
     *
     * @param append Additional text to append to Constants.BLUE_ALLIANCE_BASE_URL_V2, which is the base URL with a forward slash on the end
     * @return Returns a complete BlueAlliance URL that points to a JSON information
     */
    private String createURL(String append) {
        return Constants.BLUE_ALLIANCE_BASE_URL_V2 + append;
    }

}
