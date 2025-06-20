
package com.avivba

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class NgefilmPlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(Ngefilm())
        registerExtractorAPI(FilelionsTo())
        registerExtractorAPI(OiiaoiiaStream())
        registerExtractorAPI(Likessb())
        registerExtractorAPI(DbGdriveplayer())
        registerExtractorAPI(Dutamovie21())
        registerExtractorAPI(Embedwish())
        registerExtractorAPI(Doods())
        registerExtractorAPI(Lylxan())
        registerExtractorAPI(FilelionsOn())
        registerExtractorAPI(Kotakajaib())
        registerExtractorAPI(Uplayer())
        registerExtractorAPI(GhBrisk())
        registerExtractorAPI(IPlayerHLS())
        registerExtractorAPI(OiiaoiiaStream())
        registerExtractorAPI(MovEarnPre())
        registerExtractorAPI(DhcPlay())
    }
}
