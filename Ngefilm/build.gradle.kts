// use an integer for version numbers
version = 6

cloudstream {
    language = "id"
    // All of these properties are optional, you can safely remove them
    authors = listOf("Aviv B.A")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "TvSeries",
        "Movie",
    )

    iconUrl = "https://www.google.com/s2/favicons?domain=ngefilm21.pw&sz=%size%"
}