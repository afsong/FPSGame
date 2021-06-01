# FPSRecord

This is the implementation for the assignment Design #2, problem 8, which states that


> You want to create a personal record keeping system for first-person shooter games. Specifically, for each game it should record your KDA (kills, deaths, and assists) values; the number of times you’ve killed a character in the game, the number of times you’ve died, and the number of assists that you’ve made. You want to be able to look up this information for each game and also to update it as your stats change.


## Design
- `UserRecord.java` represents the stats record of a user. It has a userId associated with it, so that we know who this record belongs to. It has three instance variables: `numKills`, `numDeaths`, and `numAssists`. There are also functions to access these variables and also functions to increment them. I didn't think functions to set the variables to arbitrary values because in a game these variables are usually incremented (by a certain value).
- `User.java` represents a `User` object. It's mainly used to represent a user. It also stores all information related to that user, including `UserRecord` object. When a user is created, a `UserRecord` is created as well.
- `Game.java` represents a game session. It stores all current players and a reference to a `RecordDB` object. It includes key functions to manipulate user stats and is also capable of adding/removing users from the current session.
- `Main.java` is just a driver class for the project.
