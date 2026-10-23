package xyz.sirphotch.kvaesitsoplugin.publictransport.providers

import android.net.Uri
import androidx.core.net.toUri
import xyz.sirphotch.kvaesitsoplugin.publictransport.R
import xyz.sirphotch.kvaesitsoplugin.publictransport.BuildConfig

enum class ProviderRegion {
    Germany,
    UnitedArabEmirates,
    Austria,
    UnitedKingdom,
    UnitedStates,
    Australia,
    Switzerland,
    Ireland,
    Netherlands,
    Europe;

    fun localizedName(): Int = when (this) {
        Germany -> R.string.region_germany
        UnitedArabEmirates -> R.string.region_united_arab_emirates
        Austria -> R.string.region_austria
        UnitedKingdom -> R.string.region_united_kingdom
        UnitedStates -> R.string.region_united_states
        Australia -> R.string.region_australia
        Switzerland -> R.string.region_switzerland
        Ireland -> R.string.region_ireland
        Netherlands -> R.string.region_netherlands
        Europe -> R.string.region_europe
    }
}

enum class Provider {
    // EfaProvider
    Bayern,
    Bsvag,
    Ding,
    Dub,
    Gvh,
    Kvv,
    Linz,
    Mersey,
    Mvg,
    Mvv,
    Nvbw,
    Tlem,
    Vgn,
    Vmv,
    Vrn,
    Vrr,
    Vvm,
    Vvo,
    Vvs,
    Vvv,
    Wien,

    // HafasLegacyProvider
    Ns,
    Rt,

    // AbstractNetworkProvider
    Negentwee,
    Db;

    fun localizedShortName(): Int = when (this) {
        Bayern -> R.string.provider_bayern_short
        Bsvag -> R.string.provider_bsvag_short
        Ding -> R.string.provider_ding_short
        Dub -> R.string.provider_dub_short
        Gvh -> R.string.provider_gvh_short
        Kvv -> R.string.provider_kvv_short
        Linz -> R.string.provider_linz_short
        Mersey -> R.string.provider_mersey_short
        Mvg -> R.string.provider_mvg_short
        Mvv -> R.string.provider_mvv_short
        Nvbw -> R.string.provider_nvbw_short
        Tlem -> R.string.provider_tlem_short
        Vgn -> R.string.provider_vgn_short
        Vmv -> R.string.provider_vmv_short
        Vrn -> R.string.provider_vrn_short
        Vrr -> R.string.provider_vrr_short
        Vvm -> R.string.provider_vvm_short
        Vvo -> R.string.provider_vvo_short
        Vvs -> R.string.provider_vvs_short
        Vvv -> R.string.provider_vvv_short
        Wien -> R.string.provider_wien_short
        Ns -> R.string.provider_ns_short
        Rt -> R.string.provider_rt_short
        Negentwee -> R.string.provider_negentwee_short
        Db -> R.string.provider_deutschebahn_short
    }

    fun localizedName(): Int = when (this) {
        Bsvag -> R.string.provider_bsvag
        Ding -> R.string.provider_ding
        Dub -> R.string.provider_dub
        Gvh -> R.string.provider_gvh
        Kvv -> R.string.provider_kvv
        Mersey -> R.string.provider_mersey
        Mvg -> R.string.provider_mvg
        Mvv -> R.string.provider_mvv
        Nvbw -> R.string.provider_nvbw
        Tlem -> R.string.provider_tlem
        Vgn -> R.string.provider_vgn
        Vmv -> R.string.provider_vmv
        Vrn -> R.string.provider_vrn
        Vrr -> R.string.provider_vrr
        Vvm -> R.string.provider_vvm
        Vvo -> R.string.provider_vvo
        Vvs -> R.string.provider_vvs
        Vvv -> R.string.provider_vvv
        Ns -> R.string.provider_ns
        Rt -> R.string.provider_rt
        Bayern -> R.string.provider_bayern
        Linz -> R.string.provider_linz
        Wien -> R.string.provider_wien
        Negentwee -> R.string.provider_negentwee
        Db -> R.string.provider_deutschebahn
    }

    fun region(): ProviderRegion = when (this) {
        Db, Bayern, Bsvag, Ding, Gvh, Kvv, Mvg, Mvv, Nvbw, Vgn, Vmv, Vrn, Vrr, Vvm, Vvo, Vvs, Vvv -> ProviderRegion.Germany
        Dub -> ProviderRegion.UnitedArabEmirates
        Linz, Wien -> ProviderRegion.Austria
        Mersey -> ProviderRegion.UnitedKingdom
        Tlem -> ProviderRegion.UnitedKingdom
        Ns, Negentwee -> ProviderRegion.Netherlands
        Rt -> ProviderRegion.Europe
    }

    fun url(): String = when (this) {
        Bayern -> "https://beg.bahnland-bayern.de"
        Bsvag -> "https://www.bsvg.net"
        Ding -> "https://www.ding.eu"
        Dub -> "https://www.rta.ae/wps/portal/rta/ae/public-transport"
        Gvh -> "https://www.uestra.de/fahrplan/auskunft"
        Kvv -> "https://www.kvv.de"
        Linz -> "https://www.linzag.at"
        Mersey -> "https://merseytravel.gov.uk"
        Mvg -> "https://www.mvg.de"
        Mvv -> "https://www.mvv-muenchen.de"
        Nvbw -> "https://www.nvbw.de"
        Tlem -> "https://www.traveline.info"
        Vgn -> "https://www.vgn.de"
        Vmv -> "https://www.vmv-mbh.de"
        Vrn -> "https://www.vrn.de"
        Vrr -> "https://www.vrr.de"
        Vvm -> "https://www.vvm-info.de"
        Vvo -> "https://www.vvo-online.de"
        Vvs -> "https://www.vvs.de"
        Vvv -> "https://vogtlandauskunft.de"
        Wien -> "https://www.wienerlinien.at"
        Ns -> "https://www.ns.nl"
        Rt -> "https://www.railteam.eu"
        Negentwee -> "https://www.9292.nl"
        Db -> "https://bahn.de"
    }

    fun drawable(): Int? = when (this) {
        Bayern -> R.drawable.network_bayern_logo
        Bsvag -> R.drawable.network_bsvag_logo
        Ding -> R.drawable.network_ding_logo
        Gvh -> R.drawable.network_gvh_logo
        Kvv -> R.drawable.network_kvv_logo
        Linz -> R.drawable.network_linz_logo
        Mersey -> R.drawable.network_mersey_logo
        Mvg -> R.drawable.network_mvg_logo
        Mvv -> R.drawable.network_mvv_logo
        Nvbw -> R.drawable.network_nvbw_logo
        Vgn -> R.drawable.network_vgn_logo
        Vmv -> R.drawable.network_vmv_logo
        Vrn -> R.drawable.network_vrn_logo
        Vrr -> R.drawable.network_vrr_logo
        Vvm -> R.drawable.network_vvm_logo
        Vvo -> R.drawable.network_vvo_logo
        Vvs -> R.drawable.network_vvs_logo
        Vvv -> R.drawable.network_vvv_logo
        Wien -> R.drawable.network_wien_logo
        Ns -> R.drawable.network_ns_logo
        Rt -> R.drawable.network_rt_logo
        Negentwee -> R.drawable.network_negentwee_logo
        Db -> R.drawable.network_db_logo

        Dub, Tlem -> null
    }

    fun icon(): Uri? =
        drawable()?.let { "android.resource://${BuildConfig.APPLICATION_ID}/$it".toUri() }
}
