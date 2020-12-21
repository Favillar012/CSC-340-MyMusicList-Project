package Objects;

/**
 * This is an object for the user's rating of a particular album or song.
 *
 * @authors: Quinn Tjin-A-Soe, Will Higdon | Modified: Fernando Villarreal
 * Last Updated: April 14, 2020
 */

import java.util.ArrayList;

public class RatingObject extends RecordObject {

    //=================  CLASS VARIABLES ===================

    private String username;
    private String usersRating;
    private String spotifyID;
    private String musicObjectType;

    //=================  CONSTRUCTORS ===================

    public RatingObject(String _name, int _id, String _usersRating, String _spotifyID, String _musicObjectType) {
        super(_name, _id);
        this.usersRating = _usersRating;
        this.spotifyID = _spotifyID;
        this.musicObjectType = _musicObjectType;
    }

    public RatingObject(String _uuid, String _name, int _id, String _usersRating, String _spotifyID, String _musicObjectType) {
        super(_uuid, _name, _id);
        this.usersRating = _usersRating;
        this.spotifyID = _spotifyID;
        this.musicObjectType = _musicObjectType;
    }

    // The constructors below do not use the id and name variables.

    public RatingObject(String _username, String _usersRating, String _spotifyID, String _musicObjectType) {
        super();
        this.username = _username;
        this.usersRating = _usersRating;
        this.spotifyID = _spotifyID;
        this.musicObjectType = _musicObjectType;
    }

    public RatingObject(String _uuid, String _username, String _usersRating, String _spotifyID, String _musicObjectType) {
        super(_uuid);
        this.username = _username;
        this.usersRating = _usersRating;
        this.spotifyID = _spotifyID;
        this.musicObjectType = _musicObjectType;
    }

    public RatingObject(String _uuid, String _name, String _username, String _usersRating, String _spotifyID, String _musicObjectType) {
        super(_uuid, _name);
        this.username = _username;
        this.usersRating = _usersRating;
        this.spotifyID = _spotifyID;
        this.musicObjectType = _musicObjectType;
    }

    // The constructors below do not require a usersRating value to be constructed.

    public RatingObject(String _username, String _spotifyID, String _musicObjectType) {
        super();
        this.username = _username;
        this.spotifyID = _spotifyID;
        this.musicObjectType = _musicObjectType;
    }

    // This constructor is for Null RatingObjects.

    public RatingObject(String _nullValue) {
        super(_nullValue);
        this.username = _nullValue;
        this.spotifyID = _nullValue;
    }

    //================= METHODS =================

    @Override
    public ArrayList<String> toArrayList() {
        ArrayList<String> list = super.toArrayList();
        list.add(this.username);
        list.add("" + this.usersRating);
        list.add(this.spotifyID);
        list.add(this.musicObjectType);
        return list;
    }

    @Override
    public String toString() {
        String ratingInfo = super.toString() + "\nRating: " + this.usersRating + "\nSpotify ID: " + this.spotifyID
                + "\nMusic Object Type: " + this.musicObjectType;
        return ratingInfo;
    }

    //=================  GETTERS ========================

    public String getUsername() {
        return this.username;
    }

    public String getUsersRating() {
        return this.usersRating;
    }

    public String getSpotifyId() {
        return this.spotifyID;
    }

    public String getMusicObjectType() {
        return this.musicObjectType;
    }

    //=================  SETTERS ========================

    public void setUsername(String _username) {
        this.username = _username;
    }

    public void setUsersRating(String _usersRating) {
        this.usersRating = _usersRating;
    }

    public void setSpotifyID(String _spotifyID) {
        this.spotifyID = _spotifyID;
    }

    public void setUUID(String _uuid) {
        this.uuid = _uuid;
    }

    public void setMusicObjectType(String _musicObjectType) {
        this.musicObjectType = _musicObjectType;
    }
}
