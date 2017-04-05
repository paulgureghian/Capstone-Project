package com.example.paul.livecoding.database;

import net.simonvt.schematic.annotation.AutoIncrement;
import net.simonvt.schematic.annotation.ConflictResolutionType;
import net.simonvt.schematic.annotation.DataType;
import net.simonvt.schematic.annotation.DefaultValue;
import net.simonvt.schematic.annotation.NotNull;
import net.simonvt.schematic.annotation.PrimaryKey;
import net.simonvt.schematic.annotation.Unique;

public class StreamsColumns {

    @DataType(DataType.Type.INTEGER)
    @PrimaryKey
    @AutoIncrement
    public static final String _ID = "_id";

    @DataType(DataType.Type.TEXT)
    @NotNull
    public static final String _URL = " _url";

    @DataType(DataType.Type.TEXT)
    @NotNull
    public static final String USER = "user";

    @DataType(DataType.Type.TEXT)
    @NotNull
    public static final String USER_SLUG = "user_slug";

    @DataType(DataType.Type.TEXT)
    @NotNull
    public static final String TITLE = "title";

    @DataType(DataType.Type.TEXT)
    @NotNull
    public static final String DESCRIPTION = "description";

    @DataType(DataType.Type.TEXT)
    @DefaultValue("none")
    public static final String CODING_CATEGORY = "coding_category";

    @DataType(DataType.Type.TEXT)
    @NotNull
    public static final String DIFFICULTY = "difficulty";

    @DataType(DataType.Type.TEXT)
    @NotNull
    public static final String LANGUAGE = "language";

    @DataType(DataType.Type.TEXT)
    @NotNull
    public static final String TAGS = "tags";

    @DataType(DataType.Type.TEXT)
    @NotNull
    public static final String IS_LIVE = "is_live";

    @DataType(DataType.Type.INTEGER)
    @NotNull
    public static final String VIEWERS_LIVE = "viewers_live";

    @DataType(DataType.Type.TEXT)
    @NotNull
    public static final String VIEWING_URLS1 = "viewing_urls1";

    @DataType(DataType.Type.TEXT)
    @NotNull
    public static final String VIEWING_URLS2 = "viewing_urls2";

    @DataType(DataType.Type.TEXT)
    @NotNull
    public static final String VIEWING_URLS3 = "viewing_urls3";

    @DataType(DataType.Type.TEXT)
    @NotNull
    @Unique(onConflict = ConflictResolutionType.REPLACE)
    public static final String THUMBNAIL_URL = "thumbnail_url";

    @DataType(DataType.Type.TEXT)
    @NotNull
    public static final String EMBED_URL = "embed_url";
}


























