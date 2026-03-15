package se.kodasmart.models

import kotlin.js.ExperimentalJsExport
import kotlin.js.JsExport

@OptIn(ExperimentalJsExport::class)
@JsExport
object ZipCodeFormat {
    fun regexFromCountryCode(countryCode: CountryCode): String? {
        val pattern = when (countryCode) {
            CountryCode.AD -> """AD[1-7]0\d"""
            CountryCode.AE -> null
            CountryCode.AF -> """\d{4}"""
            CountryCode.AG -> null
            CountryCode.AI -> """(?:AI-)?2640"""
            CountryCode.AL -> """\d{4}"""
            CountryCode.AM -> """(?:37)?\d{4}"""
            CountryCode.AO -> null
            CountryCode.AQ -> null
            CountryCode.AR -> """((?:[A-HJ-NP-Z])?\d{4})([A-Z]{3})?"""
            CountryCode.AS -> """(96799)(?:[ \-](\d{4}))?"""
            CountryCode.AT -> """\d{4}"""
            CountryCode.AU -> """\d{4}"""
            CountryCode.AW -> null
            CountryCode.AX -> """22\d{3}"""
            CountryCode.AZ -> """\d{4}"""
            CountryCode.BA -> """\d{5}"""
            CountryCode.BB -> """BB\d{5}"""
            CountryCode.BD -> """\d{4}"""
            CountryCode.BE -> """\d{4}"""
            CountryCode.BF -> null
            CountryCode.BG -> """\d{4}"""
            CountryCode.BH -> """(?:^|\b)(?:1[0-2]|[1-9])\d{2}(?:$|\b)"""
            CountryCode.BI -> null
            CountryCode.BJ -> null
            CountryCode.BL -> """9[78][01]\d{2}"""
            CountryCode.BM -> """[A-Z]{2} ?[A-Z0-9]{2}"""
            CountryCode.BN -> """[A-Z]{2} ?\d{4}"""
            CountryCode.BO -> null
            CountryCode.BQ -> null
            CountryCode.BR -> """\d{5}-?\d{3}"""
            CountryCode.BS -> null
            CountryCode.BT -> """\d{5}"""
            CountryCode.BV -> null
            CountryCode.BW -> null
            CountryCode.BY -> """\d{6}"""
            CountryCode.BZ -> null
            CountryCode.CA -> """[ABCEGHJKLMNPRSTVXY]\d[ABCEGHJ-NPRSTV-Z] ?\d[ABCEGHJ-NPRSTV-Z]\d"""
            CountryCode.CC -> """6799"""
            CountryCode.CD -> null
            CountryCode.CF -> null
            CountryCode.CG -> null
            CountryCode.CH -> """\d{4}"""
            CountryCode.CI -> null
            CountryCode.CK -> null
            CountryCode.CL -> """\d{7}"""
            CountryCode.CM -> null
            CountryCode.CN -> """\d{6}"""
            CountryCode.CO -> """\d{6}"""
            CountryCode.CR -> """\d{4,5}|\d{3}-\d{4}"""
            CountryCode.CU -> """\d{5}"""
            CountryCode.CV -> """\d{4}"""
            CountryCode.CW -> null
            CountryCode.CX -> """6798"""
            CountryCode.CY -> """\d{4}"""
            CountryCode.CZ -> """\d{3} ?\d{2}"""
            CountryCode.DE -> """\d{5}"""
            CountryCode.DJ -> null
            CountryCode.DK -> """\d{4}"""
            CountryCode.DM -> null
            CountryCode.DO -> """\d{5}"""
            CountryCode.DZ -> """\d{5}"""
            CountryCode.EC -> """\d{6}"""
            CountryCode.EE -> """\d{5}"""
            CountryCode.EG -> """\d{5}"""
            CountryCode.EH -> """\d{5}"""
            CountryCode.ER -> null
            CountryCode.ES -> """\d{5}"""
            CountryCode.ET -> """\d{4}"""
            CountryCode.FI -> """\d{5}"""
            CountryCode.FJ -> null
            CountryCode.FK -> """FIQQ 1ZZ"""
            CountryCode.FM -> """(9694[1-4])(?:[ \-](\d{4}))?"""
            CountryCode.FO -> """\d{3}"""
            CountryCode.FR -> """\d{2} ?\d{3}"""
            CountryCode.GA -> null
            CountryCode.GB -> """[A-Z]{1,2}\d[A-Z\d]? ?\d[A-Z]{2}"""
            CountryCode.GD -> null
            CountryCode.GE -> """\d{4}"""
            CountryCode.GF -> """9[78]3\d{2}"""
            CountryCode.GG -> """GY\d[\dA-Z]? ?\d[ABD-HJLN-UW-Z]{2}"""
            CountryCode.GH -> null
            CountryCode.GI -> """GX11 1AA"""
            CountryCode.GL -> """39\d{2}"""
            CountryCode.GM -> null
            CountryCode.GN -> """\d{3}"""
            CountryCode.GP -> """9[78][01]\d{2}"""
            CountryCode.GQ -> null
            CountryCode.GR -> """\d{3} ?\d{2}"""
            CountryCode.GS -> """SIQQ 1ZZ"""
            CountryCode.GT -> """\d{5}"""
            CountryCode.GU -> """(969(?:[12]\d|3[12]))(?:[ \-](\d{4}))?"""
            CountryCode.GW -> """\d{4}"""
            CountryCode.GY -> null
            CountryCode.HK -> null
            CountryCode.HM -> """\d{4}"""
            CountryCode.HN -> """\d{5}"""
            CountryCode.HR -> """\d{5}"""
            CountryCode.HT -> """\d{4}"""
            CountryCode.HU -> """\d{4}"""
            CountryCode.ID -> """\d{5}"""
            CountryCode.IE -> """[\dA-Z]{3} ?[\dA-Z]{4}"""
            CountryCode.IL -> """\d{5}(?:\d{2})?"""
            CountryCode.IM -> """IM\d[\dA-Z]? ?\d[ABD-HJLN-UW-Z]{2}"""
            CountryCode.IN -> """\d{6}"""
            CountryCode.IO -> """BBND 1ZZ"""
            CountryCode.IQ -> """\d{5}"""
            CountryCode.IR -> """\d{5}-?\d{5}"""
            CountryCode.IS -> """\d{3}"""
            CountryCode.IT -> """\d{5}"""
            CountryCode.JE -> """JE\d[\dA-Z]? ?\d[ABD-HJLN-UW-Z]{2}"""
            CountryCode.JM -> null
            CountryCode.JO -> """\d{5}"""
            CountryCode.JP -> """\d{3}-?\d{4}"""
            CountryCode.KE -> """\d{5}"""
            CountryCode.KG -> """\d{6}"""
            CountryCode.KH -> """\d{5,6}"""
            CountryCode.KI -> null
            CountryCode.KM -> null
            CountryCode.KN -> null
            CountryCode.KP -> null
            CountryCode.KR -> """\d{5}"""
            CountryCode.KW -> """\d{5}"""
            CountryCode.KY -> """KY\d-\d{4}"""
            CountryCode.KZ -> """\d{6}"""
            CountryCode.LA -> """\d{5}"""
            CountryCode.LB -> """(?:\d{4})(?: ?(?:\d{4}))?"""
            CountryCode.LC -> null
            CountryCode.LI -> """948[5-9]|949[0-8]"""
            CountryCode.LK -> """\d{5}"""
            CountryCode.LR -> """\d{4}"""
            CountryCode.LS -> """\d{3}"""
            CountryCode.LT -> """\d{5}"""
            CountryCode.LU -> """\d{4}"""
            CountryCode.LV -> """LV-\d{4}"""
            CountryCode.LY -> null
            CountryCode.MA -> """\d{5}"""
            CountryCode.MC -> """980\d{2}"""
            CountryCode.MD -> """\d{4}"""
            CountryCode.ME -> """8\d{4}"""
            CountryCode.MF -> """9[78][01]\d{2}"""
            CountryCode.MG -> """\d{3}"""
            CountryCode.MH -> """(969[67]\d)(?:[ \-](\d{4}))?"""
            CountryCode.MK -> """\d{4}"""
            CountryCode.ML -> null
            CountryCode.MM -> """\d{5}"""
            CountryCode.MN -> """\d{5}"""
            CountryCode.MO -> null
            CountryCode.MP -> """(9695[012])(?:[ \-](\d{4}))?"""
            CountryCode.MQ -> """9[78]2\d{2}"""
            CountryCode.MR -> null
            CountryCode.MS -> null
            CountryCode.MT -> """[A-Z]{3} ?\d{2,4}"""
            CountryCode.MU -> """\d{3}(?:\d{2}|[A-Z]{2}\d{3})"""
            CountryCode.MV -> """\d{5}"""
            CountryCode.MW -> null
            CountryCode.MX -> """\d{5}"""
            CountryCode.MY -> """^\d{5}$"""
            CountryCode.MZ -> """\d{4}"""
            CountryCode.NA -> """\d{5}"""
            CountryCode.NC -> """988\d{2}"""
            CountryCode.NE -> """\d{4}"""
            CountryCode.NF -> """2899"""
            CountryCode.NG -> """\d{6}"""
            CountryCode.NI -> """\d{5}"""
            CountryCode.NL -> """[1-9]\d{3} ?(?:[A-RT-Z][A-Z]|S[BCE-RT-Z])"""
            CountryCode.NO -> """\d{4}"""
            CountryCode.NP -> """\d{5}"""
            CountryCode.NR -> null
            CountryCode.NU -> null
            CountryCode.NZ -> """\d{4}"""
            CountryCode.OM -> """(?:PC )?\d{3}"""
            CountryCode.PA -> null
            CountryCode.PE -> """(?:LIMA \d{1,2}|CALLAO 0?\d)|[0-2]\d{4}"""
            CountryCode.PF -> """987\d{2}"""
            CountryCode.PG -> """\d{3}"""
            CountryCode.PH -> """\d{4}"""
            CountryCode.PK -> """\d{5}"""
            CountryCode.PL -> """\d{2}-\d{3}"""
            CountryCode.PM -> """9[78]5\d{2}"""
            CountryCode.PN -> """PCRN 1ZZ"""
            CountryCode.PR -> """(00[679]\d{2})(?:[ \-](\d{4}))?"""
            CountryCode.PS -> null
            CountryCode.PT -> """\d{4}-\d{3}"""
            CountryCode.PW -> """(969(?:39|40))(?:[ \-](\d{4}))?"""
            CountryCode.PY -> """\d{4}"""
            CountryCode.QA -> null
            CountryCode.RE -> """9[78]4\d{2}"""
            CountryCode.RO -> """\d{6}"""
            CountryCode.RS -> """\d{5,6}"""
            CountryCode.RU -> """\d{6}"""
            CountryCode.RW -> null
            CountryCode.SA -> """\d{5}"""
            CountryCode.SB -> null
            CountryCode.SC -> null
            CountryCode.SD -> """\d{5}"""
            CountryCode.SE -> """\d{3} ?\d{2}"""
            CountryCode.SG -> """\d{6}"""
            CountryCode.SH -> """(?:ASCN|STHL) 1ZZ"""
            CountryCode.SI -> """\d{4}"""
            CountryCode.SJ -> """\d{4}"""
            CountryCode.SK -> """\d{3} ?\d{2}"""
            CountryCode.SL -> null
            CountryCode.SM -> """4789\d"""
            CountryCode.SN -> """\d{5}"""
            CountryCode.SO -> """[A-Z]{2} ?\d{5}"""
            CountryCode.SR -> null
            CountryCode.SS -> null
            CountryCode.ST -> null
            CountryCode.SV -> """CP [1-3][1-7][0-2]\d"""
            CountryCode.SX -> null
            CountryCode.SY -> null
            CountryCode.SZ -> """[HLMS]\d{3}"""
            CountryCode.TC -> """TKCA 1ZZ"""
            CountryCode.TD -> null
            CountryCode.TF -> null
            CountryCode.TG -> null
            CountryCode.TH -> """\d{5}"""
            CountryCode.TJ -> """\d{6}"""
            CountryCode.TK -> null
            CountryCode.TL -> null
            CountryCode.TM -> """\d{6}"""
            CountryCode.TN -> """\d{4}"""
            CountryCode.TO -> null
            CountryCode.TR -> """\d{5}"""
            CountryCode.TT -> null
            CountryCode.TV -> null
            CountryCode.TW -> """\d{3}(?:\d{2,3})?"""
            CountryCode.TZ -> """\d{4,5}"""
            CountryCode.UA -> """\d{5}"""
            CountryCode.UG -> null
            CountryCode.UM -> """96898"""
            CountryCode.US -> """(\d{5})(?:[ \-](\d{4}))?"""
            CountryCode.UY -> """\d{5}"""
            CountryCode.UZ -> """\d{6}"""
            CountryCode.VA -> """00120"""
            CountryCode.VC -> """VC\d{4}"""
            CountryCode.VE -> """\d{4}"""
            CountryCode.VG -> """VG\d{4}"""
            CountryCode.VI -> """(008(?:(?:[0-4]\d)|(?:5[01])))(?:[ \-](\d{4}))?"""
            CountryCode.VN -> """\d{5}\d?"""
            CountryCode.VU -> null
            CountryCode.WF -> """986\d{2}"""
            CountryCode.WS -> null
            CountryCode.YE -> null
            CountryCode.YT -> """976\d{2}"""
            CountryCode.ZA -> """\d{4}"""
            CountryCode.ZM -> """\d{5}"""
            CountryCode.ZW -> null
        }

        if (pattern == null) return null

        return "^(?:$pattern)$"
    }
}