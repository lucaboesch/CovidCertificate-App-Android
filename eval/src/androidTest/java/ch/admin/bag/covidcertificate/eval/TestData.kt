/*
 * Copyright (c) 2021 Ubique Innovation AG <https://www.ubique.ch>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */

package ch.admin.bag.covidcertificate.eval

import ch.admin.bag.covidcertificate.eval.models.Jwk

// Note that this String (taken directly from a QR code) has some \ that escape $
// This HC is signed by the hardcoded BAG DEV key
const val HC1_A = "HC1:NCFJ60EG0/3WUWGSLKH47GO0KNJ9DSWQIIWT9CK+500XKY-CE59-G80:84F3ZKG%QU2F30GK JEY50.FK6ZK7:EDOLOPCF8F746KG7+59.Q6+A80:6JM8SX8RM8.A8TL6IA7-Q6.Q6JM8WJCT3EYM8XJC +DXJCCWENF6OF63W5\$Q69L6%JC+QE$.32%E6VCHQEU\$DE44NXOBJE719\$QE0/D+8D-ED.24-G8$:8.JCBECB1A-:8$96646AL60A60S6Q\$D.UDRYA 96NF6L/5QW6307KQEPD09WEQDD+Q6TW6FA7C466KCN9E%961A6DL6FA7D46JPCT3E5JDJA76L68463W5/A6..DX%DZJC3/DH$9- NTVDWKEI3DK2D4XOXVD1/DLPCG/DU2D4ZA2T9GY8MPCG/DY-CAY81C9XY8O/EZKEZ96446256V50G7AZQ4CUBCD9-FV-.6+OJROVHIBEI3KMU/TLRYPM0FA9DCTID.GQ\$NYE3NPBP90/9IQH24YL7WMO0CNV1 SDB1AHX7:O26872.NV/LC+VJ75L%NGF7PT134ERGJ.I0 /49BB6JA7WKY:AL19PB120CUQ37XL1P9505-YEFJHVETB3CB-KE8EN9BPQIMPRTEW*DU+X2STCJ6O6S4XXVJ\$UQNJW6IIO0X20D4S3AWSTHTA5FF7I/J9:8ALF/VP 4K1+8QGI:N0H 91QBHPJLSMNSJC BFZC5YSD.9-9E5R8-.IXUB-OG1RRQR7JEH/5T852EA3T7P6 VPFADBFUN0ZD93MQY07/4OH1FKHL9P95LIG841 BM7EXDR/PLCUUE88+-IX:Q"

internal fun getInvalidSigningKeys(): List<Jwk>{
	val n = "4uZO4_7tneZ3XD5OAiTyoANOohQZC-DzZ4YC0AoLnEO-Z3PcTialCuRKS1zHfujNPI0GGG09DRVVXdv-tcKNXFDt_nRU1zlWDGFf4_63l5RIjkWFD3JFKqR8IlcJjrYYxstuZs3May3SGQJ-kZaeH5GFZMRvE0waHqMxbfwakvjf8qyBXCrZ1WsK-XJf7iYbJS2dO1a5HnegxPuRA7Zz8ikO7QRzmSongqOlkejEaIkFjx7gLGTUsOrBPYa5sdZqinDwmnjtKi52HLWarMXs-t1MN4etIp7GE7_zarjBNxk1Efiiwl-RdcwJ2uVwfrgzxfv3_TekZF8IUykV2Geu3Q"
	val e = "AQAB"

	return listOf(
		Jwk.fromNE("", n, e, use = "")
	)
}
